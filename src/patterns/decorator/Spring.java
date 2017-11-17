/*
* Spring class.
* Description: .
*
* Author: Mantvydas Zakarevičius
 */

package patterns.decorator;

public class Spring implements IPlatform {
    private  final  static String stringURL = "/assets/resources/ach-spring.png";
    private double pushPower = 10.0;

    public Spring() {
    }

    @Override
    public void getImageURL() {
        System.out.println("Gets string image URL: " + stringURL);
    }

    @Override
    public double getPushPower() {
        return pushPower;
    }
}
