/*
* Trampoline class.
* Description: .
*
* Author: Mantvydas Zakarevičius
 */

package patterns.decorator;

public class Trampoline implements IPlatform {
    private  final  static String trampolineURL = "/assets/resources/today.png";
    private double pushPower = 25.0;

    public Trampoline() {
    }

    @Override
    public void getImageURL() {
        System.out.println("Gets trampoline image URL: " + trampolineURL);
    }

    @Override
    public double getPushPower() {
        return pushPower;
    }
}
