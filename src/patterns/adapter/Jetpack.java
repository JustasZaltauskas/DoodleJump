/*
* Jetpack class.
* Description: Jetpack movement power up.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.adapter;

public class Jetpack {
    private final static String jetpackURL = "assets/resources/jetpack.png";

    private double velocity;

    public Jetpack(double velocity) {
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
}
