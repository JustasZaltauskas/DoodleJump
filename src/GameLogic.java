public class GameLogic {
    private static GameLogic gameLogic;
    private GameSkin gameSkin;
//    private GameLayout gameLayout;
    private DoodleJumpLogic doodleJumpLogic;
    private Player player;

    private GameLogic() { }

    public static GameLogic getInstance() {
        if (GameLogic.gameLogic == null)
            GameLogic.gameLogic = new GameLogic();

        return GameLogic.gameLogic;
    }

    public GameSkin getGameSkin() { return gameSkin; }

//    public GameLayout getGameLayout() { return gameLayout; }

    public Player getPlayer() { return player; }

    //TODO
    public void isDrawn() { }

    //TODO
    public void isGameOver() { }

    //TODO
    public void updateGame() { }

    //TODO
    public void updateLayout() { }

}
