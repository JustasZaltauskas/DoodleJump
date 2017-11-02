package units.doodles;

import units.Unit;
import units.UnitFactory;

public class DoodleFactory extends UnitFactory{
    @Override
    public Unit createUnit(String unitType) {
        if (unitType.equals("green")) {
            return new DoodleGreen(0, 0, 0, 0);
        }
        return null;
    }
}
