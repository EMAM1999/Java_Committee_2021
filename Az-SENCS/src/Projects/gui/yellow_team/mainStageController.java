/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.yellow_team;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.input.*;

/**

 @author EMAM
 */
public class mainStageController implements Initializable {

          @Override
          public void initialize(URL url , ResourceBundle rb) {
          }


          @FXML
          void openGame(MouseEvent event) throws IOException {
                    Parent root = FXMLLoader.load(getClass().getResource("sudouko.fxml"));
                    MainStage.stage.setScene(new Scene(root));
          }

}
