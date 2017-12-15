package patterns.factories.doodlers;

public class DoodleOriginator {
    private int[] save;

    public void setSave(int[] save) {
        this.save = save;
    }

    public DoodleSave saveToDoodleSave() {
        return new DoodleSave(save);
    }

    public void restoreDoodleSave(DoodleSave save) {
        this.save = save.getSave();
    }
}
