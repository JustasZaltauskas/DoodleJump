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
import patterns.adapter.Jetpack;
import patterns.adapter.JetpackAdapter;
import patterns.adapter.MovementPowerUp;
import patterns.adapter.PropellerHat;
import patterns.decorator.*;
import patterns.factories.unitControl.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import patterns.factories.Unit;
import patterns.factories.UnitFactory;
import patterns.observer.Player;
import patterns.observer.Subject;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

import java.util.Scanner;

public class GameManager {
    private static GameManager gameManager;
    private static Player player;

    private Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
    private double screenWidth = primaryScreenBounds.getMaxX();
    private double screenHeight = primaryScreenBounds.getMaxY();
    private GameSkin gameSkin;
    private Scene scene;
    private Scanner scan;
    private UnitControl controlChain;
    private Unit normalDoodler;

    private Subject subject;

    /*
    * Constructor creates new game
     */
    private GameManager() {
        gameSkin = new GameSkin(screenWidth, screenHeight);
        scene = new Scene(this.gameSkin.getPane());

        subject = new Subject();
        player = Player.getInstance(subject);

        scan = new Scanner(System.in);
        controlChain = getUnitControlsChain();

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

    public UnitControl getUnitControlsChain() {
        UnitControl left = new MoveLeft();
        UnitControl right = new MoveRight();
        UnitControl shoot = new Shoot();
        UnitControl doNothing = new NullControl();

        left.setMoveNext(right);
        right.setMoveNext(shoot);
        shoot.setMoveNext(doNothing);

        return left;
    }

    /*
        * Creates new game (creates and draws patterns used, starts game logic)
         */
    private void newGame() {
        System.out.println("New game has been started...");

        // Abstract Factory pattern example
        System.out.println("\n----Abstract Factory pattern example:----\n");


        // Creates factory objects
        UnitFactory doodleFactory = UnitFactory.createFactory("doodler");
        UnitFactory platformFactory = UnitFactory.createFactory("platform");
        UnitFactory enemyFactory = UnitFactory.createFactory("enemy");

        // Creates objects from specific factories
        normalDoodler = doodleFactory.createUnit("normal");
        Unit normalPlatform = platformFactory.createUnit("normal");
        Unit normalEnemy = enemyFactory.createUnit("normal");
        Unit batPlatform = enemyFactory.createUnit("bat");

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

        System.out.println("\n----Abstract Factory pattern example:----\n");

        // Observer pattern example
        System.out.println("----Observer pattern example:----\n");

        System.out.println("Player name: " + player.getName());
        System.out.println("Player score: " + player.getScore());

        System.out.println("First state change: 11");
        subject.setState(11);
        System.out.println("Second state change: 99");
        subject.setState(99);

        System.out.println("Player score: " + player.getScore());

        System.out.println("\n----Observer pattern example:----\n");

        // Adapter pattern example
        System.out.println("----Adapter pattern example:----\n");

        MovementPowerUp movementPowerUp = new MovementPowerUp(3);
        PropellerHat propellerHat = new PropellerHat(3);
        System.out.println("Speed limit? " + movementPowerUp.speedLimit(propellerHat));

        Jetpack slow_jetpack = new Jetpack(3.3);
        Jetpack fast_jetpack = new Jetpack(7.7);
        // Won't compile incompatible types
        //System.out.println("Speed limit? " + movementPowerUp.speedLimit(slow_jetpack));

        JetpackAdapter slow_jetpack_adapter = new JetpackAdapter(slow_jetpack);
        JetpackAdapter fast_jetpack_adapter = new JetpackAdapter(fast_jetpack);
        System.out.println("Speed limit? " + movementPowerUp.speedLimit(slow_jetpack_adapter));
        System.out.println("Speed limit? " + movementPowerUp.speedLimit(fast_jetpack_adapter));

        System.out.println("\n----Adapter pattern example:----\n");

        // Decorator pattern example
        System.out.println("----Decorator pattern example:----\n");

        Spring spring = new Spring();
        Trampoline trampoline = new Trampoline();
        spring.getImageURL();
        System.out.println("Spring push power: " + spring.getPushPower());
        trampoline.getImageURL();
        System.out.println("Trampoline push power: " + trampoline.getPushPower());

        PlatformDecorator platformDecorator = new PlatformDecorator();
        System.out.println("PlatformDecorator push power: " + platformDecorator.getPushPower());

        SpringPlatform springPlatform = new SpringPlatform();
        TrampolinePlatform trampolinePlatform = new TrampolinePlatform();
        System.out.println("SpringPlatform push power: " + springPlatform.getPushPower());
        System.out.println("TrampolinePlatform push power: " + trampolinePlatform.getPushPower());

        System.out.println("\n----Decorator pattern example:----\n");

        // Prototype pattern example
        System.out.println("----Prototype pattern example:----\n");

        Unit normalEnemyClone = normalEnemy.makeCopy();

        System.out.println("\n----Prototype pattern example:----\n");

        AnimationTimer timer = new AnimationTimer() {
            //TODO Creates and starts animation timer
            @Override
            public void handle(long now) {
                update();
            }
        };

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(keyEvent.getCode());
                controlChain.move(normalDoodler, keyEvent.getCode());
            }
        });
        timer.start();
    }

    /**
     * Updates game every frame
     */
    public void update() {
//        TODO
//        System.out.println("Game update (frame) not implemented yet!");
//        throw new NotImplementedException();
//        int keyCode = scan.nextInt();
//        controlChain.move(normalDoodler, keyCode);
//        System.out.println(keyCode);
    }

}
