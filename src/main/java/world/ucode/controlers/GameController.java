package world.ucode.controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class GameController {
    private Stage s;


    @FXML
    private Button btn_start;



    public GameController() {
        System.out.println(btn_start);
    }

    @FXML
    protected void initialize() {
        btn_start.setText("Play");
        System.out.println("Method initialize()");
    }

    private int n = 0;

    @FXML
    protected void onClick(ActionEvent e) {
        Scene sc = ((Node) e.getSource()).getScene();
        Window w = sc.getWindow();
        System.out.println("Button is pressed!");

        System.out.println(s.getTitle());
        System.out.printf("Window dementions %dx%d\n", (int)w.getWidth(), (int)w.getHeight());
        System.out.printf("Scene dementions %dx%d\n", (int)sc.getX(), (int)sc.getY());

    }

    /**
     * Throws in and set primary stage variable
     * @param s primary stage
     */
    public void setPrimeryStage(Stage s) {
        // TODO Auto-generated method stub
        this.s = s;
    }

}
