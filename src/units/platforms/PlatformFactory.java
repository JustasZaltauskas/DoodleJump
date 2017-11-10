/*
* PlatformFactory class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas
 */

package units.platforms;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.Unit;
import units.UnitFactory;

public class PlatformFactory extends UnitFactory {
    public PlatformFactory() { }

    /*
    * Creates any platform (determined by the passing parameter) and returns it to the caller
     */
    @Override
    public Unit createUnit(String unitType) {
        switch (unitType) {
            case "normal":
                System.out.println("Platform (normal) unit has been created.");
                return new NormalPlatform(0, 0, 0, 0);
            default:
                System.out.println("No such platform unit (" + unitType + ") exist!");
                throw new NotImplementedException();
        }
    }
}
