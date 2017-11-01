package units.platforms;

import units.Unit;
import units.UnitFactory;

public class PlatformFactory extends UnitFactory {
    public PlatformFactory(){}

    @Override
    public Unit createUnit(String unitType, double x, double y, double velocityX, double velocityY) {
        if (unitType.equals("normal")) {
            return new PlatformGreen(0, 0, 0, 0);
        }
        return null;
    }
}
