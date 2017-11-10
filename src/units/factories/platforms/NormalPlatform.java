/*
* NormalPlatform class used for Abstract Factory pattern.
* Description: Normal platform object that contains predefined data.
*
* Author: Justas Žaltauskas
 */

package units.factories.platforms;

public class NormalPlatform extends Platform {
    private  final  static String normalPlatformURL = "/assets/images/platforms/p-green.png";

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalPlatform(double x, double y, int velocityX, int velocityY) {
        super(normalPlatformURL);
    }
}
