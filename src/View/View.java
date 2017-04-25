package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;

//// TODO: 4/25/2017 fix resizing of window so that the text area resizes and console doesnt
//// TODO: 4/25/2017 allow user resizing of components
//// TODO: 4/25/2017 stop using silly fonts this is a professional application
//// TODO: 4/25/2017 use fxml for layout stuff
//// TODO: 4/25/2017 have option for user to view registers in base 10
//// TODO: 4/25/2017 consider a (still bland but slightly) less bland color scheme
//// TODO: 4/25/2017 menu bar -> file -> save, open, quit
//// TODO: 4/25/2017 finish the application instead of writing so many todos

public class View {

    private GridPane registers;
    private int currentRegisterNumber; //Only used for initializing registers

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MING");
        TextArea textArea = new TextArea();
        textArea.setPrefSize(700,500);


        Button button = new Button("Click to print text");
        button.setOnAction(action-> {
            System.out.println(textArea.getText());
        });

        TextArea printArea = new TextArea();
        printArea.setDisable(true);
        printArea.setPrefSize(500,200);

        //properly initialize the registers
        initializeRegisterPane();

        GridPane gridPane = new GridPane();


        gridPane.add(textArea,0,0);
        gridPane.add(this.registers,1,0);
        gridPane.add(printArea,0,2);


        gridPane.add(button,0,1);
        Scene scene = new Scene(gridPane, 1200, 1000);

        //apply CSS Styling
        scene.getStylesheets().add(View.class.getResource("MINGstylesheet.css").toExternalForm());
        button.setId("font-button");
        this.registers.getStyleClass().add("grid");
        gridPane.getStyleClass().add("grid");


        primaryStage.setScene(scene);


        primaryStage.show();
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


}
