package units.platforms;

import units.Unit;
import units.UnitFactory;

public class PlatformFactory extends UnitFactory {
    private  final  String imageURL = "assets/images/platforms/p-green.png";
    public PlatformFactory(){}

    public Unit createUnit(String unitType, double x, double y, double veloxityX, double velociyY) {
        if (unitType.equals("normal")) {
            return new NormalPlatform(0, 0, imageURL, 0, 0);
        }
        return null;
    }
}
