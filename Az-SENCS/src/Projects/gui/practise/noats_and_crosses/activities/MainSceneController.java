/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.noats_and_crosses.activities;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

/**

 @author mohas
 */
public class MainSceneController implements Initializable {

          public static String player1Name;
          public static String player2Name;

          @FXML
          private Text currentPlayerName;

          @FXML
          private ComboBox<?> moodBox;

          @FXML
          private Pane gameBoard;


          @Override
          public void initialize(URL location , ResourceBundle resources) {
                    currentPlayerName.setText(player1Name + " turn");

                    try {
                              Parent root = FXMLLoader.load(getClass().getResource("../designs/GameScene.fxml"));
                              gameBoard.getChildren().add(root);
                    } catch ( IOException ex ) {
                              Logger.getLogger(MainSceneController.class.getName()).log(Level.SEVERE , null , ex);
                    }

          }

}
