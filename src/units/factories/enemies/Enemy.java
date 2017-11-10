/*
* Enemy class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

package units.factories.enemies;

import units.factories.Unit;

public class Enemy extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Enemy(String url) {
        super(url);
    }

    @Override
    public void moveX(int value) {

    }

    @Override
    public void moveY(int value) {

    }
}
