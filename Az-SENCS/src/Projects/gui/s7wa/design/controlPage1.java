package Projects.gui.s7wa.design;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
/**

 @author AsmaaTharwtAhmedFahm
 */
public class controlPage1 implements Initializable {

          @FXML
          private ResourceBundle resources;

          @FXML
          private URL location;

          @FXML
          private ImageView backGroundImage;

          @FXML
          private ImageView sound;

          @FXML
          private ImageView start;


          @FXML
          void sound(MouseEvent event) {
                    sound.setImage(new Image("sound block"));
          }


          @FXML
          void start(MouseEvent event) throws IOException {
                    NewFXMain sta = new NewFXMain();
                    sta.switchStage("page2.fxml");
          }


          @Override
          public void initialize(URL location , ResourceBundle resources) {
          }

}
