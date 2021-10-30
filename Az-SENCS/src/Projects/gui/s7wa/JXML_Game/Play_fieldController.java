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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AsmaaTharwtAhmedFahm
 */
public class Play_fieldController implements Initializable {

   
    @FXML
    private AnchorPane basic_anchore;

    @FXML
    private ImageView imagebackid;

    @FXML
    private Button sound_button;

    @FXML
    private ImageView image_sound;

    @FXML
    private Button play_button;

    @FXML
    private ImageView play_image;

    @FXML
    private ImageView octoid;

    @FXML
    private ImageView sharkImage;

    @FXML
    private ImageView bubbleid1111;

    @FXML
    private ImageView bubbleid11111;

    @FXML
    private ImageView bubbleid111111;

    @FXML
    private ImageView bubbleid1111111;

    @FXML
    private ImageView bubbleid11111111;

    @FXML
    private Text score_text_id;

    @FXML
    private TextField score_show_id;

    @FXML
    private Text time_text_id;

    @FXML
    private TextField time_show;

    @FXML
    private AnchorPane second_anchor;

    @FXML
    private ImageView pause_label;
      @FXML
    void pause_game(MouseEvent event) throws IOException {
 FXMLLoader loader = new FXMLLoader(getClass().getResource("Pause_Game.fxml"));
        Parent root = loader.load();
                
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
