/*
* Enemy class used for Abstract Factory pattern.
* Description: Main enemy object which contains specific data to enemies in general.
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package patterns.factories.enemies;

import patterns.factories.Unit;

public class Enemy extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Enemy(String url) {
        super(url);
    }

    @Override
    public boolean isMoving() {
        return true;
    }

    @Override
    public void moveX(double value) {
    }

    @Override
    public void moveY(double value) {
    }

    @Override
    public void moveAlgorithm() {
        System.out.println("Template method pattern, Enemy");
    }
}
