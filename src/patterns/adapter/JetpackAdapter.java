/*
* JetpackAdapter class.
* Description: Adapts jetpack to propeller hat class.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.adapter;

public class JetpackAdapter extends PropellerHat {
    private Jetpack jetpack;

    public JetpackAdapter(Jetpack jetpack) {
        this.jetpack = jetpack;
    }

    public int getSpeed() {
        return (int) Math.round(jetpack.getVelocity());
    }
}
