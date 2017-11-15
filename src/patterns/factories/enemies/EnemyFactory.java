/*
* EnemyFactory class used for Abstract Factory pattern.
* Description: Used to create specific enemies.
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package patterns.factories.enemies;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import patterns.factories.Unit;
import patterns.factories.UnitFactory;

public class EnemyFactory extends UnitFactory {
    public EnemyFactory() { }

    /*
    * Creates any doodler (determined by the passing parameter) and returns it to the caller
     */
    @Override
    public Unit createUnit(String unitType) {
        switch (unitType) {
            case "normal":
                System.out.println("Enemy (normal) unit has been created.");
                return new NormalEnemy(0, 0, 0, 0);
            default:
                System.out.println("No such enemy unit (" + unitType + ") exist!");
                throw new NotImplementedException();
        }
    }
}
