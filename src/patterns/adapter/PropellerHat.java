/*
* PropellerHat class.
* Description: Propeller hat movement power up.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.adapter;

public class PropellerHat {
    private final static String propellerHatURL = "assets/resources/propeller.png";

    private int speed;

    public PropellerHat(int speed) {
        this.speed = speed;
    }

    public PropellerHat() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
