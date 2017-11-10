/*
* Doodler class used for Abstract Factory pattern.
* Description: Main doodler object which contains specific data to doodlers in general.
*
* Author: Justas Žaltauskas
 */

package units.factories.doodlers;

import units.factories.Unit;

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
