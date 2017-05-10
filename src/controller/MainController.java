package controller;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by larrypatrizio on 4/30/17.
 */
public class MainController {

    private View view;
    private Stage primaryStage;
    private ModelController modelController;
    boolean hasAssembled;

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.modelController = new ModelController();
        view = new View();
        view.start(this.primaryStage,this);

        this.setOutputs();

    }


    public void setOutputs() {
        PrintStream out = new PrintStream(this.view.getOutputStream(), true);
        //System.setOut(out);
        //System.setErr(out);
    }

    public void handleSave(){
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
                fileWriter.write(view.getTextArea().getText());
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println("IOException Error");
            }
        }
    }

    public void handleLoad(){
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showOpenDialog(this.primaryStage);
        if(file!=null){
            try { //Save file
                String content = new Scanner(file).useDelimiter("\\Z").next();
                view.getTextArea().setText(content);
            } catch (IOException ex) {
                System.out.println("IOException Error");
            }
        }
    }

    public void handleRun(){
        modelController.assemble(view.getUserText());
        while (modelController.canForward()) {
            modelController.forward();
            view.updateRegisters(modelController.getRegisterValues());
            System.out.println("did a command");
        }
    }

    public void handleStep(){
        if(!hasAssembled){
            System.out.println("reassembling");
            try {
                modelController.assemble(view.getUserText());
            }
            catch(Exception e){

            }
            this.hasAssembled = true;
        }
        if(modelController.canForward()) {
            modelController.forward();
            view.updateRegisters(modelController.getRegisterValues());
            System.out.println("did a command");
        }

    }

    public void handleChange(){
        System.out.println("changing");
        this.hasAssembled = false;
    }

    public void handleUndo(){
        System.out.println("backward");
        if(modelController.canBackward()){
            modelController.backward();
            view.updateRegisters(modelController.getRegisterValues());
        }

    }

}
