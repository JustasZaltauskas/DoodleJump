/*
* DoodlerFactory class used for Abstract Factory pattern.
* Description: Used to create specific doodlers.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.doodlers;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import patterns.factories.Unit;
import patterns.factories.UnitFactory;

public class DoodlerFactory extends UnitFactory {
    public DoodlerFactory() { }

    /*
    * Creates any doodler (determined by the passing parameter) and returns it to the caller
     */
    @Override
    public Unit createUnit(String unitType) {
        switch (unitType) {
            case "normal":
                System.out.println("Doodler (normal) unit has been created.");
                return new NormalDoodler(0, 0, 0, 0);
            default:
                System.out.println("No such doodler unit (" + unitType + ") exist!");
                throw new NotImplementedException();
        }
    }
}
