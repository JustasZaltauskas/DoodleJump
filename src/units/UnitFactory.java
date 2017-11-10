/*
* UnitFactory class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas
 */

package units;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.doodlers.DoodlerFactory;
import units.enemies.EnemyFactory;
import units.platforms.PlatformFactory;

public abstract class UnitFactory {
    /*
    * Constructor
     */
    public UnitFactory() { }

    /*
    * Abstract create method
     */
    public abstract Unit createUnit(String unitType);

    /*
    * Creates any factory (determined by the passing parameter) and returns it to the caller
     */
    public static UnitFactory createFactory(String factoryType) {
        switch (factoryType) {
            case "platform":
                System.out.println("Platform factory has been created.");
                return new PlatformFactory();
            case "doodler":
                System.out.println("Doodler factory has been created.");
                return new DoodlerFactory();
            case "enemy":
                System.out.println("Enemy factory has been created.");
                return new EnemyFactory();
            default:
                System.out.println("No such factory (" + factoryType + ") exist!");
                throw new NotImplementedException();
        }
    }
}
