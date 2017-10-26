package units;

import javafx.scene.image.Image;

public abstract class Unit {
    private int xCoord;
    private int yCoord;
    private Image image;


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
    public void setxCoord(int x) {
        xCoord = x;
    }

    public void setyCoord(int y) {
        yCoord = y;
    }

}
