package patterns.factories.doodlers;

public class DoodleSave {
    private int[] save;

    DoodleSave(int[] save) {
        this.save = save;
    }

    public int[] getSave() {
        return save;
    }
}
