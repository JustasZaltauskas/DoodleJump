/*
* NormalDoodler class used for Abstract Factory pattern.
* Description: .
*
* Author: Justas Žaltauskas
 */

package units.doodlers;

public class NormalDoodler extends Doodler {
    private  final  static String normalDoodlerURL = "/assets/images/doodleR.png";

    /*
    * Constructor creates object at location and velocity specified
     */
    public NormalDoodler(double x, double y, int velocityX, int velocityY) {
        super(normalDoodlerURL);
    }
}
