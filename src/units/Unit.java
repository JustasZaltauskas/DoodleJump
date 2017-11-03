package units;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public abstract class Unit extends Pane{
    private Image image;
    private ImageView imageView;
    private Point2D velocity;
    private IMoveAlgorithm iMoveAlgorithm;

    public Unit(String url) {
        setImage(url);
        setImageView(image);
        Rectangle2D viewport = new Rectangle2D(0, 0, image.getWidth(), image.getHeight());
        imageView.setViewport(viewport);
    }

    public void moveX(double x) {
        getImageView().setTranslateX(getImageView().getTranslateX() - x);
    };

    public void moveY(double y) {
        if (iMoveAlgorithm == null) {
            getImageView().setTranslateY(getImageView().getTranslateY() - y);
        } else {
            iMoveAlgorithm.moveY(this, y);
        }
    }

    public void setiMoveAlgorithm(IMoveAlgorithm iMoveAlgorithm) {
        this.iMoveAlgorithm = iMoveAlgorithm;
    }

    public IMoveAlgorithm getiMoveAlgorithm() {
        return iMoveAlgorithm;
    }

    public void addGameUnit(Pane pane, double x, double y, int velocityX, int velocityY) {
        getImageView().setLayoutX(x);
        getImageView().setLayoutY(y);
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

    public double getViewPortWidth() {
        return imageView.getViewport().getWidth();
    }

    public double getViewPortHeight() {
        return imageView.getViewport().getHeight();
    }

    public boolean isColliding(Unit other) {
        return getImageView().getBoundsInParent().intersects(other.getImageView().getBoundsInParent());
    }

    public boolean isBelowViewPort(StackPane stack) {
        return Math.abs(stack.getTranslateY()) >= Math.abs(getImageView().getTranslateY());
    }

}
