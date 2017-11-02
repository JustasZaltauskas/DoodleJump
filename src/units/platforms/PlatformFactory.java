package units.platforms;

import units.Unit;
import units.UnitFactory;

public class PlatformFactory extends UnitFactory {
    public PlatformFactory(){}

    @Override
    public Unit createUnit(String unitType) {
        if (unitType.equals("normal")) {
            return new PlatformGreen();
        }
        return null;
    }
}
