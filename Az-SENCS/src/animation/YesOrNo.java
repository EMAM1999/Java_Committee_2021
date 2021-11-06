/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package animation;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.*;

/**

 @author EMAM
 */
public class YesOrNo extends Application {

          @Override
          public void start(Stage primaryStage) {
                    Label l = new Label("Are you donkey ?");
                    Button btn1 = new Button("Yes");
                    Button btn2 = new Button("No");
                    btn1.setTranslateX(50);
                    btn1.setTranslateY(50);
                    btn2.setTranslateX(-50);
                    btn2.setTranslateY(50);
                    l.setTranslateX(-50);
                    l.setTranslateY(-50);

//                    btn2.setOnMouseEntered((e) -> {
//                              btn2.setTranslateX(Math.random() * 280 - 140);
//                              btn2.setTranslateY(Math.random() * 230 - 115);
//                    });
                    btn2.setOnMouseEntered((e) -> {
                              new Timeline(
                                      new KeyFrame(Duration.millis(500) ,
                                              new KeyValue(btn2.translateXProperty() , Math.random() * 280 - 140) ,
                                              new KeyValue(btn2.translateYProperty() , Math.random() * 230 - 115)
                                      )
                              ).play();
                    });

                    Group root = new Group(l , btn1 , btn2);
                    root.setTranslateX(150);
                    root.setTranslateY(125);

                    Scene scene = new Scene(root , 300 , 250);

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
