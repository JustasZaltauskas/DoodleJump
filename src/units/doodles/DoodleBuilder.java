package units.doodles;

import javafx.scene.image.Image;
import units.IBuilder;
import units.Unit;

public abstract class DoodleBuilder implements IBuilder {
    protected Unit unit;
    private double x = 0;
    private double y = 0;
    private int velocityX = 0;
    private int velocityY = 5;
    private String url = "assets/images/doodleL.png";

    protected void setImage(String imageURL) {
        unit.setImage(imageURL);
    };

    protected void setImageView(Image image) {
        unit.setImageView(image);
    }

    protected  void setVelocity(int velocityX, int velocityY) {
        unit.setVelocity(velocityX, velocityY);
    }

    public Unit getBuild(Unit unit) {
        return new Doodle(x, y, url, velocityX, velocityY);
    }

}
