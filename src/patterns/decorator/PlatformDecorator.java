/*
* PlatformDecorator class.
* Description: .
*
* Author: Mantvydas Zakarevičius
 */

package patterns.decorator;

import patterns.factories.platforms.NormalPlatform;

public class PlatformDecorator implements IPlatform {
    private Spring spring = new Spring();
    private Trampoline trampoline = new Trampoline();
    private NormalPlatform normalPlatform = new NormalPlatform(0, 0, 0, 0);
    private double pushPower = spring.getPushPower() + normalPlatform.getPushPower();

    public void getImageURL() {
        System.out.println("Gets platform image URL.");
    }

    @Override
    public double getPushPower() {
        return pushPower;
    }
}
