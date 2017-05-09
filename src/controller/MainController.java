package controller;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.commands.Command;
import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by larrypatrizio on 4/30/17.
 */
public class MainController {

    private View view;
    private Stage primaryStage;
    private ModelController modelController;

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.modelController = new ModelController();
        view = new View();
        view.start(this.primaryStage,this);

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
        Iterator<Command> it = modelController.getCommandIterator();

        while (it.hasNext()) {
            Command command = it.next();
            command.apply();
            view.updateRegisters(modelController.getRegisterValues());
            System.out.println("did a command");
        }
    }
}
