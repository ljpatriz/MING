package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//// TODO: 4/25/2017 fix resizing of window so that the text area resizes and console doesnt
//// TODO: 4/25/2017 allow user resizing of components
//// TODO: 4/25/2017 use fxml for layout stuff
//// TODO: 4/25/2017 have option for user to view registers in base 10
//// TODO: 4/25/2017 consider a (still bland but slightly) less bland color scheme
//// TODO: 4/25/2017 menu bar -> file -> save, open, quit (Larry - done, but need to fix interactions)
//// TODO: 4/25/2017 finish the application instead of writing so many todos

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

    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MING");
        this.registerLabels = new ArrayList<>();
        initializeMenuBar();
        initializeTextAreas();
        initializeRegisterPane();
        organizeUIPane();
        primaryStage.setScene(this.scene);
        primaryStage.show();
    }

    private void organizeUIPane(){
        this.masterGridPane = new GridPane();
        this.masterGridPane.add(textArea,0,0);
        this.masterGridPane.add(this.registers,1,0);
        this.masterGridPane.add(this.printArea,0,2);
        this.scene = new Scene(new VBox(), 1200, 1000);
        ((VBox) this.scene.getRoot()).getChildren().addAll(this.menuBar,this.masterGridPane);
        //apply CSS Styling
        this.scene.getStylesheets().add(View.class.getResource("MINGstylesheet.css").toExternalForm());
        this.registers.getStyleClass().add("grid");
        this.masterGridPane.getStyleClass().add("grid");
    }

    private void initializeTextAreas(){
        this.textArea = new TextArea();
        this.textArea.setPrefSize(700,500);
        this.printArea = new TextArea();
        this.printArea.setDisable(true);
        this.printArea.setPrefSize(500,200);
    }

    private void initializeMenuBar(){
        this.menuBar = new MenuBar();

        //----Menu File----
        Menu menuFile = new Menu("File");
        //save
        MenuItem save = new MenuItem("Save");
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Save");
                handleSave();
            }
        });
        //load
        MenuItem load = new MenuItem("Load");
        load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Load");
                handleLoad();
            }
        });
        menuFile.getItems().addAll(save,load);

        //----Run Program----
        Menu menuRun = new Menu();
        Label menuRunLabel = new Label("Run");
        menuRunLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Run");
                //run code
                //ModelController.run()
            }
        });
        menuRun.setGraphic(menuRunLabel);

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


        //add menus to menuBar
        this.menuBar.getMenus().addAll(menuFile,menuRun,menuQuit);
    }

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

    private void makeRegisters(String letter, int numRegisters){
        for(int i = 0; i < numRegisters; i++){
            initializeRegister(letter+String.valueOf(i));
        }
    }

    private void initializeRegister(String name){
        registers.add(new Label(name),0,this.currentRegisterNumber+1);
        this.registers.add(new Label(String.valueOf(this.currentRegisterNumber)),1,this.currentRegisterNumber+1);
        this.currentRegisterNumber+=1;
        registers.add(new Label("0x00000000"),2,this.currentRegisterNumber);
    }

    private void handleSave(){
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showSaveDialog(this.primaryStage);
        if(file!=null){
            try { //Save file
                FileWriter fileWriter = null;
                fileWriter = new FileWriter(file);
                fileWriter.write(this.textArea.getText());
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println("IOException Error");
            }
        }
    }

    private void handleLoad(){
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showOpenDialog(this.primaryStage);
        if(file!=null){
            try { //Save file
                String content = new Scanner(file).useDelimiter("\\Z").next();
                this.textArea.setText(content);
            } catch (IOException ex) {
                System.out.println("IOException Error");
            }
        }
    }

}