/*
* Player class.
* Description: Player information (updates score).
*
* Author: Mantvydas Zakarevičius
 */

package patterns.observer;

public class Player implements IObserver {
    private static Player player;
    private String name;
    private int score;

    protected Subject subject;

    private Player(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

        name = "DefaultName";
        score = 0;
    }

    public static Player getInstance(Subject subject) {
        if (Player.player == null)
            Player.player = new Player(subject);

        return Player.player;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void update() {
        setScore(subject.getState());
        System.out.println("Player observer score update: " + getScore());
    }
}
