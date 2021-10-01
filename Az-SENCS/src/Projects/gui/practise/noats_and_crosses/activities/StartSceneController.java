/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.noats_and_crosses.activities;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;

/**

 @author mohas
 */
public class StartSceneController implements Initializable {

          @FXML
          private RadioButton xStarts;

          @FXML
          private Button startButton;

          @FXML
          private RadioButton PlayerButton1;

          @FXML
          private ToggleGroup whichComputer;

          @FXML
          private TextField playerName1;

          @FXML
          private ComboBox<?> levelBox1;

          @FXML
          private RadioButton PlayerButton2;

          @FXML
          private TextField playerName2;

          @FXML
          private ComboBox<?> levelBox2;


          @FXML
          void startTheGame(ActionEvent event) throws IOException {
                    String player1 = playerName1.getText();
                    String player2 = playerName2.getText();

                    MainSceneController.player1Name = player1;
                    MainSceneController.player2Name = player2;

                    Parent root = FXMLLoader.load(getClass().getResource("../designs/MainScene.fxml"));

                    Scene scene = new Scene(root);

                    NewFXMain.stage.setScene(scene);
          }


          @Override
          public void initialize(URL location , ResourceBundle resources) {
          }

}
