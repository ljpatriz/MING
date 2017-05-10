package controller;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.MementoManager;
import model.commands.Command;
import model.Core;
import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by larrypatrizio on 4/30/17.
 */
public class MainController {

    private View view;
    private Stage primaryStage;
    private ModelController modelController;
    private MementoManager<Core> mementoManager;
    Iterator<Command> iterator;
    boolean hasAssembled;
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.modelController = new ModelController();
        view = new View();
        mementoManager = new MementoManager<>(modelController.core::clone, modelController.core::load);
        view.start(this.primaryStage,this);

        this.setOutputs();

    }


    public void setOutputs() {
        PrintStream out = new PrintStream(this.view.getOutputStream(), true);
        System.setOut(out);
        System.setErr(out);
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
        this.iterator = modelController.getCommandIterator();

        while (iterator.hasNext()) {
            Command command = iterator.next();
            mementoManager.saveState();
            command.apply();
        }
        view.updateRegisters(modelController.getRegisterValues());
    }

    public void handleStep(){
        if(!hasAssembled){
            modelController.assemble(view.getUserText());
            this.iterator = modelController.getCommandIterator();
            this.hasAssembled = true;
        }
        if (iterator.hasNext()) {
            Command command = iterator.next();
            mementoManager.saveState();
            command.apply();
            view.updateRegisters(modelController.getRegisterValues());
        } else {
            this.hasAssembled = false;
        }
    }



    public void handleUndo(){
        if (mementoManager.rewindProperty().get()) {

            mementoManager.rewind();
            view.updateRegisters(modelController.getRegisterValues());
        }
    }

}
