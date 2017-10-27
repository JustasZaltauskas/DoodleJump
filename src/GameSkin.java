import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class GameSkin extends StackPane {
    private final Image background = new Image(getClass().getResourceAsStream("./assets/images/grid.png"));
    private final Pane root;
    private final double maxWidth = 640.0;
    private final double maxHeight = 1000.0;

    GameSkin(double screenWidth, double screenHeight) {
        root = new Pane();
        root.setPrefSize((screenWidth > maxWidth) ? maxWidth : screenWidth,
                screenHeight > maxHeight ? maxHeight : screenHeight);
        ImageView imageView = new ImageView();
        imageView.setImage(this.background);
        root.getChildren().add(imageView);
    }

    Parent getRoot() {
        return root;
    }
}
