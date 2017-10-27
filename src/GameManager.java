import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.Unit;
import units.UnitFactory;
import units.platforms.PlatformFactory;

public class GameManager {
    private static GameManager gameManager;
    private Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
    private double screenWidth = primaryScreenBounds.getMaxX();
    private double screenHeight = primaryScreenBounds.getMaxY();
    private GameSkin gameSkin = new GameSkin(screenWidth, screenHeight);
    private Scene scene = new Scene(this.gameSkin.getRoot());
    private UnitFactory unitFactory;

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
        PlatformFactory platformFactory = UnitFactory.createFactory("platform");
        Unit normalPlatform = platformFactory.createUnit("normal", 0, 10,0, 0);
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
