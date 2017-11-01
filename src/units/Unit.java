package units;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Unit extends Pane{
    public Image image;
    public ImageView imageView;
    public Point2D velocity;

    public Unit() {}
    public Unit(double x, double y, String url, int velocityX, int velocityY) {
        setVelocity(velocityX, velocityY);
        setImage(url);
        setImageView(image);
        imageView.setViewport(new Rectangle2D(x, y,
                              image.getWidth(),
                              image.getHeight()));
        getChildren().add(imageView);
    }

    public abstract void moveX(int value);
    public abstract void moveY(int value);

    public Image getImage() {
        return image;
    }

    public void setImage(String imageURL) {
        try {
            this.image = new Image(getClass().getResourceAsStream(imageURL));
        } catch (Exception e) {
            throw e;
        }
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(Image image) {
        this.imageView = new ImageView(image);
    }

    public Point2D getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocityX, int velocityY) {
        this.velocity = new Point2D(velocityX, velocityY);
    }
}
