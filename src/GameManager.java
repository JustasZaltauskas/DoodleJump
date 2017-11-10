/*
* GameManager class.
* Description: Controls the whole game (includes game logic).
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.factories.Unit;
import units.factories.UnitFactory;
import units.observer.Player;
import units.observer.Subject;

public class GameManager {
    private static GameManager gameManager;
    private static Player player;

    private Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
    private double screenWidth = primaryScreenBounds.getMaxX();
    private double screenHeight = primaryScreenBounds.getMaxY();
    private GameSkin gameSkin;
    private Scene scene;

    private Subject subject;

    /*
    * Constructor creates new game
     */
    private GameManager() {
        gameSkin = new GameSkin(screenWidth, screenHeight);
        scene = new Scene(this.gameSkin.getPane());

        subject = new Subject();
        player = Player.getInstance(subject);

        this.newGame();
    }

    public static GameManager getInstance() {
        if (GameManager.gameManager == null)
            GameManager.gameManager = new GameManager();

        return GameManager.gameManager;
    }

    public Scene getScene() {
        return scene;
    }

    public Player getPlayer() {
        return player;
    }

    /*
        * Creates new game (creates and draws units used, starts game logic)
         */
    private void newGame() {
        System.out.println("New game has been started...");

        // Creates factory objects
        UnitFactory doodleFactory = UnitFactory.createFactory("doodler");
        UnitFactory platformFactory = UnitFactory.createFactory("platform");
        UnitFactory enemyFactory = UnitFactory.createFactory("enemy");

        // Creates objects from specific factories
        Unit normalDoodler = doodleFactory.createUnit("normal");
        Unit normalPlatform = platformFactory.createUnit("normal");
        Unit normalEnemy = enemyFactory.createUnit("normal");

        // Draws objects onto the screen
        normalPlatform.addGameUnit(gameSkin.getPane(),
                0,
                gameSkin.getPane().getHeight() + 60,
                0, 0);
        normalDoodler.addGameUnit(gameSkin.getPane(),
                            0,
                            gameSkin.getPane().getHeight(),
                            0, 0);
        normalEnemy.addGameUnit(gameSkin.getPane(),
                200,
                gameSkin.getPane().getHeight(),
                0, 0);

        // [DEBUGGING ONLY] Prints out parameters
//        System.out.println(gameSkin.getPane().getLayoutX());
//        System.out.println(gameSkin.getPane().getWidth());
        System.out.println("Player name: " + player.getName());
        System.out.println("Player score: " + player.getScore());

        System.out.println("First state change: 11");
        subject.setState(11);
        System.out.println("Second state change: 99");
        subject.setState(99);

        System.out.println("Player score: " + player.getScore());

        //TODO Creates and starts animation timer
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
//                update();
            }
        };
        timer.start();
    }

    /**
     * Updates game every frame
     */
    public void update() {
        //TODO
        System.out.println("Game update (frame) not implemented yet!");
        throw new NotImplementedException();
    }
}
