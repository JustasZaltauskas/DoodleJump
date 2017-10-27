package units;

import units.platforms.PlatformFactory;

public class UnitFactory {
    public UnitFactory(){};

    public static PlatformFactory createFactory(String familyType) {
        switch (familyType) {
            case "platform":
                return new PlatformFactory();
            case "enemy":
                break;
        }

        return null;
    }
}
