/**
 * FileName: Main.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
import controller.MainController;
import controller.ModelController;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    String testDirectory = System.getProperty("user.dir") + "/test/resources/";
    @Override
    public void start(Stage primaryStage) throws Exception{
        MainController mainController = new MainController();
        mainController.start(primaryStage);
        CharStream stream = CharStreams.fromFileName(testDirectory+"addi.asm");
        ModelController modelController = new ModelController();
        modelController.assemble(stream);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
