/*
* Doodler class used for Abstract Factory pattern.
* Description: Main doodler object which contains specific data to doodlers in general.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.doodlers;

import patterns.factories.Unit;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Doodler extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Doodler(String url) {
        super(url);
    }

    @Override
    public boolean isMoving() {
        return false;
    }

    @Override
    public void moveX(int value) {

    }

    @Override
    public void moveY(int value) {

    }

    @Override
    public void moveAlgorithm() {
        throw new NotImplementedException();
    }
}
