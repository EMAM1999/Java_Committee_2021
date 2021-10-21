package Projects.gui.s7wa.design;


import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AsmaaTharwtAhmedFahm
 */
public class controlPage2 implements Initializable {

    private String fishes[] = {"hero1.png", "hero2.png", "hero3.png", "hero4.png"};
    @FXML
    private ImageView sound2;

    @FXML
    private Button sound;
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    void Countinue(MouseEvent event) throws IOException {
        NewFXMain sta = new NewFXMain();
        sta.switchStage("page3.fxml");
    }

    @FXML
    void selectFishArrow(MouseEvent event) {
        int index = (int) Math.random() * 4;
        image1.setImage(new Image(fishes[index]));

    }

    @FXML
    void selectFishMouse(MouseEvent event) {
  int index = (int) Math.random() * 4;
        image2.setImage(new Image(fishes[index]));
    }

    @FXML
    void sound(MouseEvent event) {
      sound2.setImage(new Image("sound block")) ;

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
