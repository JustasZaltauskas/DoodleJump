/*
* Platform class used for Abstract Factory pattern.
* Description: Main platform object which contains specific data to platforms in general.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.platforms;

import patterns.factories.Unit;

public class Platform extends Unit {
    /*
    * Constructor creates unit out of url (image file)
     */
    public Platform(String url) {
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

    //TODO Platform movement algorithm
    @Override
    public void moveAlgorithm() {
        System.out.println("Template Method pattern, Platform movement algorithm.");
    }
}
