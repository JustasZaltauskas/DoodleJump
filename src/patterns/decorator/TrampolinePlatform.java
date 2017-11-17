/*
* TrampolinePlatform class.
* Description: .
*
* Author: Mantvydas Zakarevičius
 */

package patterns.decorator;

public class TrampolinePlatform extends PlatformDecorator {
    private double pushPower = 25.0;

    public TrampolinePlatform() {
    }

    public double getPushPower() {
        return pushPower;
    }
}
