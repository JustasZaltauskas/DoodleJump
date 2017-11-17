/*
* SpringPlatform class.
* Description: .
*
* Author: Mantvydas Zakarevičius
 */

package patterns.decorator;

public class SpringPlatform extends PlatformDecorator {
    private double pushPower = 10.0;

    public SpringPlatform() {
    }

    public double getPushPower() {
        return pushPower;
    }
}
