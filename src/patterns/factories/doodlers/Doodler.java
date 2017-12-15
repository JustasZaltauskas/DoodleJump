/*
* Doodler class used for Abstract Factory pattern.
* Description: Main doodler object which contains specific data to doodlers in general.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.doodlers;

import patterns.factories.Unit;
import patterns.state.DoodlerState;
import patterns.state.LockedState;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class Doodler extends Unit {
    private DoodlerState doodlerState;

    /*
    * Constructor creates unit out of url (image file)
     */
    public Doodler(String url) {
        super(url);

        this.doodlerState = new LockedState(this);
    }

    @Override
    public boolean isMoving() {
        return false;
    }

    @Override
    public void moveX(double value) {
        setX(getX() + value);
        getImageView().setTranslateX(getX());
    }

    @Override
    public void moveY(double value) {
        setY(value);
        getImageView().setTranslateY(getY());
    }

    @Override
    public void moveAlgorithm() {
        throw new NotImplementedException();
    }

    public void changeState(DoodlerState doodlerState) {
        this.doodlerState = doodlerState;
    }

    public void onLock() {
        doodlerState.onLock();
    }

    public void onShoot() {
        doodlerState.onShoot();
    }

    //TODO Shooting behaviour
    public void startShooting() {
        System.out.println("Doodler is shooting!");
    }
}
