import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
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
    private final double height = 650;

    GameSkin(double screenWidth, double screenHeight) {
        root = new Pane();
        grid = new GridPane();
        stack = new StackPane();
//        grid.setPrefSize((screenWidth > maxWidth) ? maxWidth : screenWidth,
//                screenHeight > maxHeight ? maxHeight : screenHeight - 28);
        stack.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.CENTER);
        grid.addRow(0, createImageView());
        grid.addRow(1, createImageView());
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
