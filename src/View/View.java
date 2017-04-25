package View;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.awt.*;

public class View {

    GridPane registers;
    int currentRegisterNumber; //Only used for initializing registers

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MING");
        TextArea textArea = new TextArea();
        textArea.setPrefSize(500,500);

        Button button = new Button("Click to print text");
        button.setOnAction(action-> {
            System.out.println(textArea.getText());
        });

        setupUpRegisterPane();

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(25,25,10,25));
        gridPane.setHgap(50);


        gridPane.add(textArea,0,0);
        gridPane.add(this.registers,1,0);
        gridPane.add(button,0,1);
        Scene scene = new Scene(gridPane, 1000, 750);

        //apply CSS Styling
        scene.getStylesheets().add(View.class.getResource("MINGstylesheet.css").toExternalForm());
        button.setId("font-button");
        this.registers.getStyleClass().add("grid");


        primaryStage.setScene(scene);


        primaryStage.show();
    }



    private void setupUpRegisterPane(){
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
