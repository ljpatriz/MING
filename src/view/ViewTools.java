package view;

import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;

import java.awt.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Jacob on 10/05/17.
 */
public class ViewTools {
    public void beep(){
        Toolkit.getDefaultToolkit().beep();
    }

    public void alertWindow(String message){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setHeaderText("Something Went Wrong");
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void alertWindow(InterruptedException e){
        this.alertWindow("Interrupted Exception", e);
    }

    /**
     * Creates a simple alert window with a collapsable dialog
     * http://code.makery.ch/blog/javafx-dialogs-official/
     * @param message - simple message
     * @param e - exception
     */
    public void alertWindow(String message, Exception e){
        this.beep();
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("There was a problem");
        alert.setContentText(message);
        // Create expandable Exception.
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("The exception stacktrace was:");
        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        // Set expandable Exception into the dialog pane.
        alert.getDialogPane().setExpandableContent(expContent);

        alert.showAndWait();
    }
}
