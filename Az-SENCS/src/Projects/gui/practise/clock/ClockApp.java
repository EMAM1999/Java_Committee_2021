/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.clock;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class ClockApp extends Application {

          @Override
          public void start(Stage primaryStage) {
                    Clock c = new Clock(200 , true , true);
                    c.setTranslateX(250);
                    c.setTranslateY(250);

                    Group root = new Group(c);

                    Scene scene = new Scene(root , 500 , 500);
                    primaryStage.setTitle("clock");
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
