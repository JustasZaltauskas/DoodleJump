import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import units.UnitFactory;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GameManager gameManager = GameManager.getInstance();
        Scene scene = gameManager.getScene();
        scene.getStylesheets().add("./assets/window.css");
        primaryStage.setTitle("Doodle Jump");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main.class);
    }
}
