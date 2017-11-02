import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.Unit;
import units.UnitFactory;

public class GameManager {
    private static GameManager gameManager;
    private Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
    private double screenWidth = primaryScreenBounds.getMaxX();
    private double screenHeight = primaryScreenBounds.getMaxY();
    private GameSkin gameSkin = new GameSkin(screenWidth, screenHeight);
    private Scene scene = new Scene(this.gameSkin.getRoot());

    private GameManager() {
        this.newGame();
    }

    public static GameManager getInstance() {
        if (GameManager.gameManager == null) {
            GameManager.gameManager = new GameManager();
        }

        return GameManager.gameManager;
    }

    private void newGame() {
        UnitFactory platformFactory = UnitFactory.createFactory("platform");
        UnitFactory doodleFactory = UnitFactory.createFactory("doodle");
        Unit normalPlatform = platformFactory.createUnit("normal");
        Unit doodle = doodleFactory.createUnit("green");
        doodle.addGameUnit(gameSkin.getRoot(),
                           0,
                           gameSkin.getRoot().getHeight(),
                           0, 0);
        System.out.println(gameSkin.getRoot().getLayoutX());
        System.out.println(gameSkin.getRoot().getWidth());
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
//                update();
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
        throw new NotImplementedException();
    }

}
