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

import java.util.Hashtable;

  public class EnemyFactory extends UnitFactory {
    public EnemyFactory() { }
    public static Hashtable<String, Unit> enemies = new Hashtable<String, Unit>();

    /*
    * Creates any doodler (determined by the passing parameter) and returns it to the caller
     */
    @Override
    public Unit createUnit(String unitType) {
        Unit enemy = enemies.get(unitType);

        if (enemy == null) {
            if (unitType.equals("normal")) {
                    enemy = new NormalEnemy(0, 0, 0, 0);
            }

            if (unitType.equals("bat")) {
                enemy = new BatEnemy(50, 50, 0, 0);
            }

            enemies.put(unitType, enemy);
            System.out.println("\n----Flyweight pattern:----");
            System.out.print(unitType + " enemy added to hashtable");
            System.out.println("\n----Flyweight pattern:----\n");

        }

        return enemy;
    }
}
