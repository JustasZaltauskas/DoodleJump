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

    public Unit(String url) {
        setImage(url);
        setImageView(image);
        imageView.setViewport(null);
    }

    public abstract void moveX(int value);
    public abstract void moveY(int value);

    public void addGameUnit(Pane pane, double x, double y, int velocityX, int velocityY) {
        getImageView().setTranslateX(x);
        getImageView().setTranslateY(y);
        setVelocity(velocityX, velocityY);
        pane.getChildren().add(getImageView());
    }

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
