import controller.ModelController;
import model.Core;
import model.reading.MipsCommandListener;
import model.reading.MipsLexer;
import model.reading.MipsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import view.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    String testDirectory = System.getProperty("user.dir") + "/test/resources/";



    @Override
    public void start(Stage primaryStage) throws Exception{
//        View view = new View();
//        view.start(primaryStage);
    //enter the text file to run
        //run the text file
        CharStream stream = CharStreams.fromFileName(testDirectory+"addi.asm");
        ModelController modelController = new ModelController();
        modelController.run(stream);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
