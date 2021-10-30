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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AsmaaTharwtAhmedFahm
 */
public class Start_gameController implements Initializable {

    @FXML
    private AnchorPane backgroundid;

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
    private Label labelid;

    @FXML
    private ImageView keyid;

    @FXML
    private ImageView mouseid;

    @FXML
    private ImageView fishshapeid;

    @FXML
    private Text mouseuseeid;

    @FXML
    private Text mouseuseeid1;
    
    @FXML
    void moveToScene3(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("play_field.fxml"));
        Parent root = loader.load();
        //Start_gameController scene3 = loader.getController();
      
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
