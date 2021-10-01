/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.noats_and_crosses.activities;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class NewFXMain extends Application {

          public static Stage stage;


          @Override
          public void start(Stage primaryStage) throws IOException {
                    Parent root = FXMLLoader.load(getClass().getResource("../designs/StartScene.fxml"));

                    Scene scene = new Scene(root);

                    stage = primaryStage;
                    primaryStage.setTitle("Hello World!");
                    primaryStage.setScene(scene);
                    primaryStage.show();
          }


          /**
           @param args the command line arguments
           */
          public static void main(String[] args) {
                    launch(args);
          }

}
