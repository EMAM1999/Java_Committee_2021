/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

/**

 @author EMAM
 */
public class JavaFX extends Application {

          @Override
          public void start(Stage stage) throws Exception {
                    Button btn1 = new Button("Button 1");
                    Button btn2 = new Button("Button 2");
//            VBox root = new VBox();
                    GridPane root = new GridPane();
//            root.getChildren().addAll(btn1, btn2);
                    root.add(btn1 , 0 , 0);
                    root.add(btn2 ,0 , 2);

//            RGB 000000 -> ffffff
                    Scene scene = new Scene(root , 500 , 500 , Paint.valueOf("2f5a9c"));
                    stage.setScene(scene);
                    stage.show();
          }


          public static void main(String[] args) {
                    launch(args);
          }

}
