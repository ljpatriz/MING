/**
 * FileName: MainController.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */

package controller;

import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.MementoManager;
import model.commands.Command;
import model.Core;
import view.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class is used to controller the flow of information between the view and model.
 * It is highly critical for maintaining the Model-View-Controller design structure of
 * our project.
 */
public class MainController {

    private View view;
    private Stage primaryStage;
    private ModelController modelController;
    private MementoManager<Core> mementoManager;
    Iterator<Command> iterator;
    boolean hasAssembled;

    /**
     * Takes in a stage object and builds the Model and View properly. This begins the
     * whole experience.
     * @param primaryStage
     * @throws Exception
     */
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.modelController = new ModelController();
        view = new View();
        mementoManager = new MementoManager<>(modelController.core::clone, modelController.core::load);
        view.start(this.primaryStage,this);

        this.setOutputs();

    }

    /**
     * Directs the output print area within the View, controlling the flow of information
     * from the Model to that area.
     */
    public void setOutputs() {
        PrintStream out = new PrintStream(this.view.getOutputStream(), true);
        System.setOut(out);
        System.setErr(out);
    }

    /**
     * Handles a save request. This is received from the view.
     */
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

    /**
     * Handles a load request. This is received from the view.
     */
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

    /**
     * Handles a run request. This is received from the view.
     */
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

    /**
     * Handles a step request. This is received from the view.
     */
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


    /**
     * Handles an undo request. This is received from the view.
     */
    public void handleUndo(){
        if (mementoManager.rewindProperty().get()) {

            mementoManager.rewind();
            view.updateRegisters(modelController.getRegisterValues());
        }
    }

    /**
     * Handles an info request. This is received from the view.
     */
    public void handleInfo(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"MING is a MIPS " +
                "simulator that takes a user-generated file containing the " +
                "reduced instruction set architecture. This is done using " +
                "JavaFX, with the user interface generating an assembly " +
                "language file (.asm). This file is then parsed and converted" +
                " into a list of commands. This command list is then traversed" +
                " to manipulate a host of registers and memory locations. The " +
                "user interface features a similar setup as MARS, having an " +
                "area for text to be entered, a visible representation of the " +
                "registers/their values, and a print area. ");
        alert.setHeaderText("MING");
        alert.showAndWait();
    }

}
