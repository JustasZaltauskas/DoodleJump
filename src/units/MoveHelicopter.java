package units;

import javafx.scene.image.Image;

public class MoveHelicopter implements IMoveAlgorithm {

    // Move up for 3 seconds
    @Override
    public void moveY(Unit unit, double y) {
        long t= System.currentTimeMillis();
        long end = t + 3000;
        Image imageOld = new Image("/assets/images/doodleL.png");
        Image imageNew = new Image("/assets/images/doodleR.png");
        unit.setImageView(imageNew);
        while(System.currentTimeMillis() < end) {
            unit.getImageView().setTranslateY(unit.getImageView().getTranslateY() - y);
        }
        unit.setImageView(imageOld);
    }
}
