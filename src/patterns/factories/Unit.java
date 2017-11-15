/*
* Unit class used for Abstract Factory pattern.
* Description: Used by factories to create concrete objects (units).
*
* Author: Justas Žaltauskas
 */

package patterns.factories;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Unit extends Pane{
    public Image image;
    public ImageView imageView;
    public Point2D velocity;

    /*
    * Constructor creates unit out of url (image file)
     */
    public Unit(String url) {
        setImage(url);
        setImageView(image);
        imageView.setViewport(null);
    }

    /*
    * Abstract movement methods
     */
    public abstract void moveX(int value);
    public abstract void moveY(int value);

    /*
    * Adds new game unit to the screen (draws object)
     */
    public void addGameUnit(Pane pane, double x, double y, int velocityX, int velocityY) {
        getImageView().setTranslateX(x);
        getImageView().setTranslateY(y);
        setVelocity(velocityX, velocityY);
        pane.getChildren().add(getImageView());
    }

    public Image getImage() {
        return image;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public Point2D getVelocity() {
        return velocity;
    }

    public void setImage(String imageURL) {
        try {
            this.image = new Image(getClass().getResourceAsStream(imageURL));
        } catch (Exception e) {
            System.out.println("No such image (" + imageURL + ") found!");
            throw e;
        }
    }

    public void setImageView(Image image) {
        this.imageView = new ImageView(image);
    }

    public void setVelocity(int velocityX, int velocityY) {
        this.velocity = new Point2D(velocityX, velocityY);
    }
}
