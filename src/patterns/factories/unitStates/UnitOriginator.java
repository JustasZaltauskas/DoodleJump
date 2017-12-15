package patterns.factories.unitStates;

public class UnitOriginator {
    private int[] save;

    public void setSave(int[] save) {
        this.save = save;
    }

    public int[] getSave() {
        return save;
    }

    public UnitSave saveToUnitSaves() {
        return new UnitSave(save);
    }

    public void restoreUnitSave(UnitSave save) {
        this.save = save.getSave();
    }
}
