/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JXML_Game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AsmaaTharwtAhmedFahm
 */
public class Main_pageController implements Initializable {

    @FXML
    private ImageView backGround;

    @FXML
    private Button sound_button;

    @FXML
    private ImageView image_sound;

    @FXML
    private Button play_button;

    @FXML
    private ImageView play_ima;

   @FXML
    void soundOpreater(ActionEvent event) {
 
    }

    @FXML
    void sound_play(MouseEvent event) {
       Image no_sound = new Image("no_audio.png");
        image_sound.setImage(no_sound);
    }

  
    @FXML
    void moveToScene2(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Start_game.fxml"));
        Parent root = loader.load();
        Start_gameController scene2 = loader.getController();
                /*
                When i want to change between scenes in same scene
        we use this code
        ehen we want to change same scene
        use this code --->  Stage stage = new Stage(root);
                */
                
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
