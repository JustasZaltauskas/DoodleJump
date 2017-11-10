/*
* NormalEnemy class used for Abstract Factory pattern.
* Description: Normal enemy object that contains predefined data.
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package units.factories.enemies;

public class NormalEnemy extends Enemy {
    private  final  static String normalEnemyURL = "/assets/images/monsters/bat1.png";

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalEnemy(double x, double y, int velocityX, int velocityY) {
        super(normalEnemyURL);
    }
}
