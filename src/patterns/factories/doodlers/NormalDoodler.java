/*
* NormalDoodler class used for Abstract Factory pattern.
* Description: Normal doodler object that contains predefined data.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.doodlers;

public class NormalDoodler extends Doodler {
    private  final  static String normalDoodlerURL = "/assets/images/doodleR.png";

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalDoodler(double x, double y, int velocityX, int velocityY) {
        super(normalDoodlerURL);
    }
}
