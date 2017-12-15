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
    private Image image;
    private ImageView imageView;
    private Point2D velocity;
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;
    private double velocityGoalX;
    private double velocityGoalY;
    public static double dt = 1;
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
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityGoalX = 0;
        this.velocityGoalY = 0;
        pane.getChildren().add(getImageView());

        if (isMoving()) {
            moveAlgorithm();
        }
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
        this.x = x;
        this.y = y;
    }

    public Unit makeCopy() {
        try {
            return (Unit) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return this;
        }
    }

    public double approach(double goal, double current, double dt) {
        double diff = goal - current;

        if (diff > dt) {
            return current + dt;
        }

        if (diff < -dt) {
            return current - dt;
        }

        return goal;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public double getVelocityGoalX() {
        return velocityGoalX;
    }

    public void setVelocityGoalX(double velocityGoalX) {
        this.velocityGoalX = velocityGoalX;
    }

    public double getVelocityGoalY() {
        return velocityGoalY;
    }

    public void setVelocityGoalY(double velocityGoalY) {
        this.velocityGoalY = velocityGoalY;
    }
}
