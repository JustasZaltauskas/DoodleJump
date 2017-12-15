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
    private final Image background = new Image(getClass().getResourceAsStream("/assets/images/grid.png"));
    private final Pane root;
    private final GridPane grid;
    private final StackPane stack;
    private final double width = 500;
    private final double height = 800;

    GameSkin() {
        root = new Pane();
        grid = new GridPane();
        stack = new StackPane();
        stack.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.CENTER);
        grid.addRow(0, createImageView());
        stack.getChildren().addAll(grid, root);
    }

    Pane getRoot() {
        return root;
    }

    GridPane getGrid() {
        return grid;
    }

    StackPane getStack() {
        return stack;
    }

    public void moveStackY(double y) {
        getStack().setTranslateY(getStack().getTranslateY() + y);
    }

    public ImageView createImageView() {
        ImageView imageView = new ImageView();
        imageView.setImage(this.background);
        imageView.setFitHeight(height);
        imageView.setFitWidth(width);

        return imageView;
    }
}
