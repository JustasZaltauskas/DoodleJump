/*
* UnitFactory class used for Abstract Factory pattern.
* Description: Used to create defined factories.
*
* Author: Justas Žaltauskas
 */

package units.factories;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import units.factories.doodlers.DoodlerFactory;
import units.factories.enemies.EnemyFactory;
import units.factories.platforms.PlatformFactory;

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
