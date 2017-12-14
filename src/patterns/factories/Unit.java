/*
* Unit class used for Abstract Factory pattern.
* Description: Used by factories to create concrete objects (units).
*
* Author: Justas Žaltauskas
 */

package patterns.factories;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Unit extends Pane implements Cloneable {
    public Image image;
    public ImageView imageView;
    public Point2D velocity;

    public static final double moveSpeed = 1;

    /*
    * Constructor creates unit out of url (image file)
     */
    public Unit(String url) {
        setImage(url);
        setImageView(image);
    }

    /*
    * Abstract unitControl methods
     */

    public abstract void moveX(double value);
    public abstract void moveY(double value);
    public abstract boolean isMoving();
    public abstract void moveAlgorithm();
    /*
    * Adds new game unit to the screen (draws object)
     */

    public void addGameUnit(Pane pane, double x, double y, int velocityX, int velocityY) {
        setTranslate(x, y);
        setVelocity(velocityX, velocityY);
        pane.getChildren().add(getImageView());

        if (isMoving()) {
            moveAlgorithm();
        }
    }
    public static double getMoveSpeed() {
        return moveSpeed;
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

    public void setTranslate(double x, double y) {
        getImageView().setTranslateX(x);
        getImageView().setTranslateY(y);
    }

    public Unit makeCopy() {
        try {
            return (Unit) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return this;
        }
    }
}
