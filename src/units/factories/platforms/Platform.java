/*
* Platform class used for Abstract Factory pattern.
* Description: Main platform object which contains specific data to platforms in general.
*
* Author: Justas Žaltauskas
 */

package units.factories.platforms;

import units.factories.Unit;

public class Platform extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Platform(String url) {
            super(url);
        }

    @Override
    public void moveX(int value) {

    }

    @Override
    public void moveY(int value) {

    }
}
