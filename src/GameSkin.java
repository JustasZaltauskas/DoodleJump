import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.File;

public class GameSkin extends StackPane {
    private static File backgroundURL = new File("./assets/images/bg-grid.png");
    static final Image background = new Image(backgroundURL.toURI().toString());
    private final ImageView imageView = new ImageView();

    public GameSkin() {
        getStyleClass().add("background");
        imageView.setImage(background);
        getChildren().setAll(imageView);
        setPrefSize(650, 650);
    }
}
