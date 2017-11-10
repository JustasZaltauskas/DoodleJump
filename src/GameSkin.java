/*
* GameSkin class.
* Description: .
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class GameSkin extends StackPane {
    private final double MAX_WIDTH = 600.0;
    private final double MAX_HEIGHT = 800.0;
    private final Image BACKGROUND = new Image(getClass().getResourceAsStream("./assets/images/grid.png"));

    private final Pane pane;
    private final ImageView imageView;

    /*
    * Constructor creates new gameskin (drawable space)
     */
    GameSkin(double screenWidth, double screenHeight) {
        // Creates new Pane and sets it size (layout size)
        pane = new Pane();
        pane.setPrefSize((screenWidth > MAX_WIDTH) ? MAX_WIDTH : screenWidth,
                        screenHeight > MAX_HEIGHT ? MAX_HEIGHT : screenHeight);

        // Creates new ImageView (and adds BACKGROUND to it)
        imageView = new ImageView();
        imageView.setImage(this.BACKGROUND);

        // Adds imageView to root
        pane.getChildren().add(imageView);
    }

    Pane getPane() {
        return pane;
    }
}
