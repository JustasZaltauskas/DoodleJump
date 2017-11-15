/*
* MovementPowerUp class.
* Description: Doodler usable movement power ups.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.adapter;

public class MovementPowerUp {
    private int speed;

    public MovementPowerUp(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean speedLimit(PropellerHat propellerHat) {
        if(Math.abs(propellerHat.getSpeed()) <= this.speed)
            return true;

        return false;
    }
}
