package world.ucode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import world.ucode.entities.Menu;

import java.io.IOException;

public class DinoApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage s) {
        try {
            Pane root = new Pane();
            s.setTitle("Dino Game!");
            s.getIcons().add(new Image("sprites/Dino-stand.png"));
            s.setResizable(false);
            s.centerOnScreen();
            s.show();
            new Menu(root, s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
