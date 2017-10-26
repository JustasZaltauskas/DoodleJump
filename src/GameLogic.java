public class GameLogic {
    private GameSkin skin;

    public GameLogic(GameManager gameManager) {
        skin = new GameSkin();
    }

    public GameSkin getSkin() {
        return skin;
    }
}
