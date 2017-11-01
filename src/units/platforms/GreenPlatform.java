package units.platforms;

public class GreenPlatform extends Platform {
    private  final  static String pGreenURL = "/assets/images/platforms/p-green.png";

    public GreenPlatform(double x, double y, int velocityX, int velocityY) {
        super(x, y, pGreenURL, velocityX, velocityY);
    }
}
