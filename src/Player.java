import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Player {
    private static Player player;
    private String name;
    private int score;

    //TODO
    private Player() {}

    public static Player getInstance() {
        if (Player.player == null)
            Player.player = new Player();

        return Player.player;
    }

    public String getName() { return name; }

    public int getScore() { return score; }

    public void setName(String name) { this.name = name; }

    public void setScore(int score) { this.score = score; }

    //TODO
    public void notify(DoodleJumpLogic doodleJumpLogic, String event) {
        switch(event) {
            case "DOODLER_JUMPED" :
                System.out.println("Update score based on Doodler jump point!");
            default:
                throw new NotImplementedException();
        }
    }

}
