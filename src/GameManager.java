import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import units.Unit;
import units.UnitFactory;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements ISubject {
    private static GameManager gameManager;
    private Rectangle2D primaryScreenBounds;
    private double screenWidth;
    private double screenHeight;
    private GameSkin gameSkin;
    private Scene scene;
    private List<Unit> normalPlatforms;
    private Unit doodle;
    private double traveled;
    private final double ACCELERATION = 150;
    private final double DOWN_FORCE = 50;
    private List<IObserver> observers;
    private Player player;
    private int score;

    private GameManager() {
        primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        screenWidth = primaryScreenBounds.getMaxX();
        screenHeight = primaryScreenBounds.getMaxY();
        gameSkin = new GameSkin(screenWidth, screenHeight);
        scene = new Scene(this.gameSkin.getStack());
        traveled = 0;
        score = 0;
        observers = new ArrayList<>();
        normalPlatforms = new ArrayList<>();
        attach(player.getInstance());
        this.newGame();
    }

    public static GameManager getInstance() {
        if (GameManager.gameManager == null) {
            GameManager.gameManager = new GameManager();
        }

        return GameManager.gameManager;
    }

    @Override
    public void attach(IObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(int number) {
        for (IObserver o : observers) {
            o.updateObserver(number);
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private void newGame() {
        UnitFactory platformFactory = UnitFactory.createFactory("platform");
        UnitFactory doodleFactory = UnitFactory.createFactory("doodle");
        Unit normalPlatform = platformFactory.createUnit("normal");
        doodle = doodleFactory.createUnit("green");
        doodle.addGameUnit(gameSkin.getRoot(),
                          (screenWidth / 2) - doodle.getImage().getWidth() / 2,
                          (screenHeight - doodle.getImage().getHeight() - 50),
                          0, 0);
        normalPlatform.addGameUnit(gameSkin.getRoot(),
                                  (screenWidth / 2) - normalPlatform.getImage().getWidth() / 2,
                                  screenHeight - normalPlatform.getImage().getHeight() - 100,
                                  0, 0);
        normalPlatforms.add(normalPlatform);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();
    }

    public Scene getScene() {
        return this.scene;
    }

    /**
     * Update game every frame
     */
    public void update() {
        doodle.moveY(-1);

        for (Unit normalPlatform : normalPlatforms) {
            if (doodle.isColliding(normalPlatform)) {
                doodle.moveY(ACCELERATION);
                gameSkin.moveStackY(DOWN_FORCE);
                setScore(getScore() + 100);
            }
        }
        // Player dies
        if (doodle.isBelowViewPort(gameSkin.getStack())) {
            notifyObservers(getScore());
        }
//        System.out.println(doodle.isBelowViewPort(gameSkin.getStack()));
//        System.out.println("stack: " + gameSkin.getStack().getTranslateY());
//        System.out.println("doodle: " + doodle.getImageView().getTranslateY());
//        traveled += 100;
//        if (traveled >= screenHeight / 3) {
//            gameSkin.getGrid().addRow(gameSkin.getGrid().getChildren().size() + 1, gameSkin.createImageView());
//            traveled = 0;
//        }
    }
}
