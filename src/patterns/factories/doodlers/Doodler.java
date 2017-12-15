/*
* Doodler class used for Abstract Factory pattern.
* Description: Main doodler object which contains specific data to doodlers in general.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.doodlers;

import patterns.factories.Unit;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Stack;

public class Doodler extends Unit {
    private Stack<DoodleSave> saves = new Stack<DoodleSave>();

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
    public void moveX(double value) {
        getImageView().setTranslateX(getImageView().getTranslateX() + value);
    }

    @Override
    public void moveY(double value) {
        getImageView().setTranslateY(getImageView().getTranslateY() + value);
    }

    @Override
    public void moveAlgorithm() {
        throw new NotImplementedException();
    }

    public void addSave(DoodleSave save) {
        saves.push(save);
    }

    public DoodleSave getSave() {
        return saves.pop();
    }
}
