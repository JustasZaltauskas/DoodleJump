/*
* Main class.
* Description: Starts (starting point) the program (game) with JavaFX method start().
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import patterns.observer.Subject;

public class Main extends Application {
    private static final String VERSION = "1.11";

    /*
    * Starts the program and creates GameManager
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Subject subject = new Subject();
        GameSkin gameSkin = new GameSkin();
        GameManager gameManager = new GameManager(gameSkin, subject);

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
