package units;

import javafx.scene.image.Image;

public class MoveJetPack implements IMoveAlgorithm {
    // Move up for 5 seconds
    @Override
    public void moveY(Unit unit, double y) {
        long t= System.currentTimeMillis();
        long end = t + 5000;
        Image imageOld = new Image("/assets/images/doodleL.png");
        Image imageNew = new Image("/assets/images/doodleR.png");
        unit.setImageView(imageNew);
        while(System.currentTimeMillis() < end) {
            unit.getImageView().setTranslateY(unit.getImageView().getTranslateY() - y);
        }
        unit.setImageView(imageOld);
    }
}
