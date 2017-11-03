import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Player implements IObserver{
    private static Player player;
    private int score;

    private Player() {
        setScore(0);
    }

    public static Player getInstance() {
        if (Player.player == null)
            Player.player = new Player();

        return Player.player;
    }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    @Override
    public void updateObserver(int number) {
        setScore(number);
    }
}
