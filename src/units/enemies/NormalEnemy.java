/*
* NormalEnemy class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package units.enemies;

public class NormalEnemy extends Enemy {
    private  final  static String normalEnemyURL = "/assets/images/monsters/bat1.png";

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalEnemy(double x, double y, int velocityX, int velocityY) {
        super(normalEnemyURL);
    }
}
