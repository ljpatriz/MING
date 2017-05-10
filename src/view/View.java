/**
 * FileName: View.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */

package view;

import controller.MainController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is responsible for maintaining the visual components of the program. Also
 * it manages any user interaction and communicates with the MainController to properly
 * handle these user requests.
 */
public class View {

    private GridPane registers;
    private List<Label> registerLabels;
    private int currentRegisterNumber; //Only used for initializing registers
    private MenuBar menuBar;
    private GridPane masterGridPane;
    private TextArea textArea;
    private TextArea printArea;
    private Scene scene;
    private Stage primaryStage;
    private MainController mainController;
    private OutputStream outputStream;

    private StringBuilder autocompleteString;
    private ContextMenu autocompleteMenu;

    private Slider slider;
    private Label sliderLabel;
    private Label pcLabel;


    /**
     * Starts the window/U.I. portion of the project. Takes in a primaryStage and the
     * MainController
     * @param primaryStage - primaryStage
     * @param mainController - mainController
     * @throws Exception
     */
    public void start(Stage primaryStage, MainController mainController) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MING");
        this.registerLabels = new ArrayList<>();
        this.mainController = mainController;
        this.autocompleteString = new StringBuilder();
        this.autocompleteMenu = new ContextMenu();

        initializeInfoComponents();
        initializeMenuBar();
        initializeTextIO();
        initializeRegisterPane();
        organizeUIPane();
        primaryStage.setScene(this.scene);
        primaryStage.show();
    }

    private void initializeInfoComponents(){
        this.slider = new Slider();
        this.sliderLabel = new Label("Program Slow-Down: 0");
        this.slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                sliderLabel.setText("Program Slow-Down: " + String.valueOf(newValue.intValue()));
            }
        });
        this.pcLabel = new Label("Program Counter Value: 0");
    }
    /**
     * Properly organizes the User Interface Pane
     */
    private void organizeUIPane(){


        this.masterGridPane = new GridPane();
        this.masterGridPane.add(textArea,0,0);
        this.masterGridPane.add(this.registers,1,0);
        this.masterGridPane.add(this.printArea,0,2);
        this.masterGridPane.add(this.slider,1,2);
        this.masterGridPane.add(this.sliderLabel,1,1);
        this.scene = new Scene(new VBox(), 1200, 1000);
        ((VBox) this.scene.getRoot()).getChildren().addAll(this.menuBar,this.masterGridPane);
        //apply CSS Styling
        this.scene.getStylesheets().add(View.class.getResource("MINGstylesheet.css").toExternalForm());
        this.registers.getStyleClass().add("grid");
        this.masterGridPane.getStyleClass().add("grid");
    }

    /**
     * Initializes the text area to properly handle User Interaction
     */
    private void initializeTextIO(){
        this.textArea = new TextArea();
        this.textArea.setPrefSize(700,500);
        this.textArea.setOnKeyPressed(event -> {
            autocompleteMenu.hide();
            mainController.handleChange();
            if (event.getCode().isLetterKey()) {
                autocompleteString.append(event.getText());
//                System.out.println(autocompleteString);
//                System.out.println(textArea.getCaretPosition());
                this.autocompleteWindow();



                //autocompleteMenu.



            } else if (event.getCode().equals(KeyCode.BACK_SPACE) &&
                    autocompleteString.length() > 0) {

                autocompleteString.setLength(autocompleteString.length()-1);
                this.autocompleteWindow();
            } else {
                autocompleteString.setLength(0);
            }

        });

        this.textArea.setOnMouseClicked(event -> autocompleteMenu.hide());

        this.printArea = new TextArea();
        this.printArea.setEditable(false);
        this.printArea.setPrefSize(500,200);
        this.outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                View.this.printArea.appendText(String.valueOf((char) b));
            }
        };
    }

    /**
     * Properly steps up and maintains the auto complete dialogue window
     */
    private void autocompleteWindow(){
        autocompleteMenu.getItems().clear();
        List<String> commands = Arrays.asList("add","addi","addiu","addu","and","andi",
                "beq","bgez","bgtz","blez","bltz","bne"	,"break","clo"	,"clz"	,"div"	,"divu",
                "j"	,"jal"	,"jalr","jr"	,"lb"	,"lbu"	,"lh"	,"lhu"	,"li","lw"	,"mfhi",
                "mflo","move","movn","movz","mul","mult","nop","nor","or","sb","sub","subu",
                "sw","syscall","xor","xori","ori");
        commands.stream()
                .filter(c -> c.startsWith(autocompleteString.toString()))
                .forEach(c -> autocompleteMenu.getItems().add(new MenuItem(c)));
        autocompleteMenu.getItems().forEach(m -> m.setOnAction(event1 -> {
            textArea.appendText(m.getText().replace(autocompleteString.toString(), ""));

        }));
        autocompleteMenu.show(textArea, 0, 0);
    }

    /**
     * Initializes the menuBar
     */
    private void initializeMenuBar(){
        this.menuBar = new MenuBar();

        //----Menu File----
        Menu menuFile = new Menu("File");
        //save
        MenuItem save = new MenuItem("Save");
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainController.handleSave();
            }
        });
        //load
        MenuItem load = new MenuItem("Load");
        load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainController.handleLoad();
            }
        });
        menuFile.getItems().addAll(save,load);

        //undo
        MenuItem undo = new MenuItem("Undo");
        load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainController.handleUndo();
            }
        });
        menuFile.getItems().addAll(undo);

        //----Run Program----
        Menu menuRun = new Menu();
        Label menuRunLabel = new Label("Run");
        menuRunLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainController.handleRun();
            }
        });
        menuRun.setGraphic(menuRunLabel);

        //----PC Label----
        Menu menuPC = new Menu();
        menuPC.setGraphic(this.pcLabel);

        //----Back Step Program----
        Menu menuBack = new Menu();
        Label menuBackLabel = new Label("Back Step");
        menuBackLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainController.handleUndo();
            }
        });
        menuBack.setGraphic(menuBackLabel);

        //----Forward Step Program----
        Menu menuForward = new Menu();
        Label menuForwardLabel = new Label("Forward Step");
        menuForwardLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainController.handleStep();
            }
        });
        menuForward.setGraphic(menuForwardLabel);

        //----Quit----
        Menu menuQuit = new Menu();
        Label menuQuitLabel = new Label("Quit");
        menuQuitLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Quit");
                System.exit(0);
            }
        });
        menuQuit.setGraphic(menuQuitLabel);

        //----Info----
        Menu menuInfo = new Menu();
        Label menuInfoLabel = new Label("Info");
        menuInfoLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainController.handleInfo();
            }
        });
        menuInfo.setGraphic(menuInfoLabel);


        //add menus to menuBar
        this.menuBar.getMenus().addAll(menuFile,menuInfo,menuRun,menuPC,menuBack,menuForward,menuQuit);
    }

    /**
     * Initialies the register pane
     */
    private void initializeRegisterPane(){
        this.registers = new GridPane();

        //headers
        registers.add(new Label("Name"),0,0);
        registers.add(new Label("Number"),1,0);
        registers.add(new Label("Value"),2,0);

        //zero register
        initializeRegister("$zero");

        //at register
        initializeRegister("$at");

        //v registers
        makeRegisters("$v",2);

        //a registers
        makeRegisters("$a",4);

        //t registers
        makeRegisters("$t",10);

        //s registers
        makeRegisters("$s",8);

        //k registers
        makeRegisters("$k",2);

        //gp register
        initializeRegister("$gp");

        //sp register
        initializeRegister("$sp");

        //fp register
        initializeRegister("$fp");

        //ra register
        initializeRegister("$ra");
    }

    /**
     * Makes the visual components of the registers. If given a and 3, it will add the
     * registers $a0, $a1, and $a2.
     * @param letter - letter of register
     * @param numRegisters - number of registers to make
     */
    private void makeRegisters(String letter, int numRegisters){
        for(int i = 0; i < numRegisters; i++){
            initializeRegister(letter+String.valueOf(i));
        }
    }

    /**
     * Initializes a given register
     * @param name - register name
     */
    private void initializeRegister(String name){
        this.registers.add(new Label(name),0,this.currentRegisterNumber+1);
        this.registers.add(new Label(String.valueOf(this.currentRegisterNumber)),1,this.currentRegisterNumber+1);
        this.currentRegisterNumber+=1;

        Label label = new Label("0x0");

        registerLabels.add(label);
        registers.add(label, 2, this.currentRegisterNumber);
    }

    /**
     * returns the textArea
     * @return - TextArea
     */
    public TextArea getTextArea(){return this.textArea;}

    /**
     * returns the user generated text within the textArea
     * @return - String from textArea
     */
    public String getUserText() {
        return this.textArea.getText();
    }

    /**
     * Updates the visual registers with new values
     * @param newValues - List of integers
     */
    public void updateRegisters(List<Integer> newValues) {
        for (int i = 0; i < newValues.size(); i++) {
            this.registerLabels.get(i)
                    .setText("0x"+Integer.toHexString(newValues.get(i)));

        }
    }

    /**
     * returns the current value of the slider (as an integer)
     * @return - int slider value
     */
    public int getSliderValue(){
        return (int) this.slider.getValue();
    }

    /**
     * returns the OutputStream
     * @return -OutputStream
     */
    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void updateProgramCounter(int newValue){
        this.pcLabel.setText("Program Counter Value: "+ newValue);
    }
}
