package units;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.doodles.DoodleFactory;
import units.platforms.PlatformFactory;

public abstract class UnitFactory {
    public UnitFactory(){}
    public static UnitFactory createFactory(String familyType) {
        switch (familyType) {
            case "platform":
                return new PlatformFactory();
            case "doodle":
                return new DoodleFactory();
            default:
                throw new NotImplementedException();
        }
    }

    public abstract Unit createUnit(String unitType, double x, double y, double velocityX, double velocityY);
}
