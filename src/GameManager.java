/*
* GameManager class.
* Description: Controls the whole game (includes game logic), main method for patterns demo.
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import patterns.adapter.Jetpack;
import patterns.adapter.JetpackAdapter;
import patterns.adapter.MovementPowerUp;
import patterns.adapter.PropellerHat;
import patterns.decorator.*;
import patterns.factories.Unit;
import patterns.factories.UnitFactory;
import patterns.factories.doodlers.Doodler;
import patterns.factories.unitControl.MoveLeft;
import patterns.factories.unitControl.MoveRight;
import patterns.factories.unitControl.NullControl;
import patterns.factories.unitControl.UnitControl;
import patterns.factories.unitStates.UnitOriginator;
import patterns.mediator.Button;
import patterns.mediator.Component;
import patterns.mediator.EndGameWindow;
import patterns.observer.Player;
import patterns.observer.Subject;
import patterns.state.ShootingState;

import java.util.Arrays;


public class GameManager {
    private static Player player;
    private Scene scene;
    private Subject subject;
    private GameSkin gameSkin;
    private Unit normalDoodler;

    /*
    * Constructor creates new game objects and starts new game
     */
    public GameManager(GameSkin gameSkin, Subject subject) {
        this.gameSkin = gameSkin;
        this.subject = subject;
        this.scene = new Scene(gameSkin.getStack());
        this.player = Player.getInstance(subject);
        this.newGame();
    }

    /*
    * Get Scene object
     */
    public Scene getScene() {
        return scene;
    }

    /*
    * Get UnitControl Chain object
     */
    public UnitControl getUnitControlsChain() {
        UnitControl left = new MoveLeft();
        UnitControl right = new MoveRight();
        UnitControl doNothing = new NullControl();

        left.setMoveNext(right);
        right.setMoveNext(doNothing);

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
        UnitControl controlChain = getUnitControlsChain();

        // Creates objects from specific factories
        normalDoodler = doodleFactory.createUnit("normal");
        Unit normalPlatform = platformFactory.createUnit("normal");
        Unit normalEnemy = enemyFactory.createUnit("normal");
        Unit batPlatform = enemyFactory.createUnit("bat");

        // Draws objects onto the screen
        normalPlatform.addGameUnit(gameSkin.getPane(),
                100,
                350,
                0, 0);
        normalDoodler.addGameUnit(gameSkin.getPane(),
                100,
                600,
                0, 0);
        normalEnemy.addGameUnit(gameSkin.getPane(),
                125,
                100,
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

        // Template Method pattern example
        System.out.println("----Template Method pattern example:----\n");

        normalEnemy.moveAlgorithm();
        normalPlatform.moveAlgorithm();
        normalDoodler.moveAlgorithm();

        System.out.println("\n----Template Method pattern example:----\n");

        // State pattern example
        System.out.println("----State pattern example:----\n");

        ShootingState shootingState = new ShootingState((Doodler) normalDoodler);

        shootingState.onShoot();
        shootingState.onLock();

        System.out.println("\n----State pattern example:----\n");

        // Memento pattern example
        System.out.println("----Memento pattern example:----\n");

        UnitOriginator unitOriginator = new UnitOriginator();
        int[] save = {0, 0};
        unitOriginator.setSave(save);
        System.out.println("Set save: [0, 0]");

        normalDoodler.addSave(unitOriginator.saveToUnitSaves());
        unitOriginator.restoreUnitSave(normalDoodler.getSave());
        int[] unitSave = unitOriginator.getSave();
        System.out.println("Restored state: " + Arrays.toString(unitSave));

        System.out.println("\n----Memento pattern example:----\n");

        // Mediator pattern example
        System.out.println("----Mediator pattern example:----\n");

        EndGameWindow endGameWindow = new EndGameWindow();

        endGameWindow.notify(endGameWindow.getRestartGameButton(), "CLICK");
        endGameWindow.notify(endGameWindow.getExitGameButton(), "PRESS");

        System.out.println("\n----Mediator pattern example:----\n");

        AnimationTimer timer = new AnimationTimer() {
            //TODO Creates and starts animation timer
            @Override
            public void handle(long now) {
                update();
            }
        };

        scene.setOnKeyPressed(keyEvent -> {
            controlChain.move(normalDoodler, 1.5, keyEvent.getCode());
        });

        scene.setOnKeyReleased(keyEvent -> {
            controlChain.move(normalDoodler, 0, keyEvent.getCode());
        });

        timer.start();
    }

    /**
     * Updates game every frame
     */
    public void update() {
        normalDoodler.setVelocityX(normalDoodler.approach(
                                        normalDoodler.getVelocityGoalX(),
                                        normalDoodler.getVelocityX(),
                                        Unit.dt));
        normalDoodler.setVelocityY(normalDoodler.approach(
                                        normalDoodler.getVelocityGoalY(),
                                        normalDoodler.getVelocityY(),
                                        Unit.dt));

        normalDoodler.moveX(normalDoodler.getVelocityX());
        normalDoodler.moveY(normalDoodler.getVelocityY());
    }
}
