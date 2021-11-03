/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.clock;

import Projects.gui.practise.clock.Clock2;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

/**

 @author EMAM
 */
public class MainStage extends Application {

          double radius = 300;
          boolean hasNumbers = true;
          boolean isSmoth = true;
          int longDashs = 12;
          int shortDashs = 60;
          Color bodyColor = Color.BLACK;
          Color hourHandColor = Color.BLACK;
          Color minuteHandColor = Color.BLACK;
          Color secondHandColor = Color.BLACK;


          @Override
          public void start(Stage stage) throws Exception {

                    Group clock = new Clock2(radius , hasNumbers , isSmoth , longDashs , shortDashs , bodyColor , hourHandColor , minuteHandColor , secondHandColor);
                    StackPane root = new StackPane(clock);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
          }


          public static void main(String[] args) {
                    launch(args);
          }

}
