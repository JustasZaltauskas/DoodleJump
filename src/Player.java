import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Player implements IObserver{
    private static Player player;
    private GameManager gameManager;

    private Player() {
        setScore(0);
    }

    public static Player getInstance() {
        if (Player.player == null)
            Player.player = new Player();

        return Player.player;
    }

    public int getScore() { return gameManager.getScore(); }

    public void setScore(int score) { gameManager.setScore(); }

    @Override
    public void updateObserver(int number) {
        setScore(number);
    }
}
