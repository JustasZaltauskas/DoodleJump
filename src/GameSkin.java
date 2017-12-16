/*
* GameSkin class.
* Description: Game layout settings.
*
* Author: Justas Žaltauskas, Mantvydas Zakarevičius
 */

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class GameSkin extends StackPane {
    private final double MAX_WIDTH = 500.0;
    private final double MAX_HEIGHT = 800.0;
    private final Image BACKGROUND = new Image(getClass().getResourceAsStream("./assets/images/grid.png"));
    private final Pane pane;
    private final GridPane grid;
    private final StackPane stack;

    /*
    * Constructor creates new Gameskin (drawable space)
     */
    public GameSkin() {
        pane = new Pane();
        grid = new GridPane();
        stack = new StackPane();
        stack.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.CENTER);
        grid.addRow(0, createImageView());
        stack.getChildren().addAll(grid, pane);
    }

    public Pane getPane() {
        return pane;
    }

    public GridPane getGrid() {
        return grid;
    }

    public StackPane getStack() {
        return stack;
    }

    public void moveStackY(double y) {
        getStack().setTranslateY(getStack().getTranslateY() + y);
    }

    public ImageView createImageView() {
        ImageView imageView = new ImageView();
        imageView.setImage(BACKGROUND);
        imageView.setFitHeight(MAX_HEIGHT);
        imageView.setFitWidth(MAX_WIDTH);

        return imageView;
    }
}
