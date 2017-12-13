/*
 * NormalEnemy class used for Abstract Factory pattern.
 * Description: Normal enemy object that contains predefined data.
 *
 * Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package patterns.factories.enemies;

public class BatEnemy extends Enemy {
    private  final  static String batEnemyURL = "/assets/images/monsters/bat2.png";

    /*
     * Constructor creates object at location and velocity specified
     */
    public BatEnemy(double x, double y, int velocityX, int velocityY) {
        super(batEnemyURL);
    }
}
