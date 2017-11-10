/*
* Main class.
* Description: .
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static final double VERSION = 1.9;

    /*
    * Starts the program and creates GameManager
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        GameManager gameManager = GameManager.getInstance();

        Scene scene = gameManager.getScene();
        scene.getStylesheets().add("./assets/window.css");

        primaryStage.setTitle("Doodle Jump " + VERSION + "v");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main.class);
    }
}
