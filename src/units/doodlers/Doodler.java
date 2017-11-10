/*
* Doodler class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas
 */

package units.doodlers;

import units.Unit;

public class Doodler extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Doodler(String url) {
        super(url);
    }

    @Override
    public void moveX(int value) {

    }

    @Override
    public void moveY(int value) {

    }
}
