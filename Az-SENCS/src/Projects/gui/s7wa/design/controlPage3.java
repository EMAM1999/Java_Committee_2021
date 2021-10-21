package Projects.gui.s7wa.design;

//import Projects.gui.s7wa.activities.time;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
/**

 @author AsmaaTharwtAhmedFahm
 */
public class controlPage3 implements Initializable {

          @FXML
          private ImageView sound;

          @FXML
          private ImageView pause;

          @FXML
          private ImageView bubble3;

          @FXML
          private ImageView bubble2;

          @FXML
          private ImageView bubble4;

          @FXML
          private ImageView bubble1;

          @FXML
          private ImageView fish1;

          @FXML
          private ImageView octo;

          @FXML
          private ImageView labelTime;

          @FXML
          private ImageView labelScore;

          @FXML
          private TextField score;


          @FXML
          void pause(MouseEvent event) {

          }


          @FXML
          void score(MouseEvent event) {

          }


          @FXML
          void time(MouseEvent event) {
//time t =new time(3,0);
          }

          @FXML
          private AnchorPane subScene;


          @Override
          public void initialize(URL location , ResourceBundle resources) {
                    try {
                              Parent root = FXMLLoader.load(getClass().getResource("Mian.fxml"));
                              subScene.getChildren().add(root);
                    } catch ( IOException ex ) {
                              Logger.getLogger(controlPage3.class.getName()).log(Level.SEVERE , null , ex);
                    }

          }

}
