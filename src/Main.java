import model.Core;
import view.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        View view = new View();
        view.start(primaryStage);
        Core core = new Core();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
