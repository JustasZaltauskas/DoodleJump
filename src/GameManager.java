import javafx.scene.Scene;

public class GameManager {
    private Scene scene;
    private GameLogic gameLogic;
    private static GameManager gameManager = null;

    private GameManager() {
        newGame();
    }

    public static GameManager getInstance() {
        if (gameManager == null) {
            gameManager = new GameManager();
        }

        return gameManager;
    }

    public void newGame() {
       gameLogic = new GameLogic(gameManager);
       scene = new Scene(gameLogic.getSkin());
    }
    public Scene getScene() {
        return scene;
    }
}
