package units.doodles;

import units.Unit;
import units.UnitFactory;

public class DoodleFactory extends UnitFactory{
    @Override
    public Unit createUnit(String unitType, double x, double y, double velocityX, double velocityY) {
        if (unitType.equals("green")) {
            return new DoodleGreen(0, 0, 0, 0);
        }
        return null;
    }
}
