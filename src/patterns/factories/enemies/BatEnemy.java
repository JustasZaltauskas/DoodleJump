/*
 * BatEnemy class used for Flyweight pattern.
 * Description: Bat enemy object that contains predefined data.
 *
 * Author: Justas Žaltauskas
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
