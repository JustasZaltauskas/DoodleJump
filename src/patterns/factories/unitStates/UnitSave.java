package patterns.factories.unitStates;

public class UnitSave {
    private int[] save;

    UnitSave(int[] save) {
        this.save = save;
    }

    public int[] getSave() {
        return save;
    }
}
