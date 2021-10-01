/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.birthday_calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class Main extends Application {

          @Override
          public void start(Stage primaryStage) throws IOException {
                    Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));

                    Scene scene = new Scene(root);

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
