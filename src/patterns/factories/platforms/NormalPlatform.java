/*
* NormalPlatform class used for Abstract Factory pattern.
* Description: Normal platform object that contains predefined data.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.platforms;

import patterns.decorator.IPlatform;

public class NormalPlatform extends Platform implements IPlatform {
    private  final  static String normalPlatformURL = "/assets/images/platforms/p-green.png";
    private double pushPower = 7.0;

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalPlatform(double x, double y, int velocityX, int velocityY) {
        super(normalPlatformURL);
    }

    @Override
    public void getImageURL() {
        System.out.println("Gets normal platform image: " + normalPlatformURL);
    }

    @Override
    public double getPushPower() {
        return pushPower;
    }
}
