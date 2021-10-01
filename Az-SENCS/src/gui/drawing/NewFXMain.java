/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.drawing;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class NewFXMain extends Application {

//          Line & PolyLine
//          Circle
//          Resctangle
//          Polygon
          double w = 300;
          double h = 250;


          @Override
          public void start(Stage primaryStage) {
                    Circle c1 = new Circle(w / 2 , h / 2 , 100);
                    c1.setStrokeWidth(5);
                    c1.setStroke(Color.BLACK);
                    c1.setOnMousePressed((e) -> {
                              System.out.println("body");
                    });

                    Circle c2 = new Circle(w / 2 , h / 2 , 70);
                    c2.setStrokeWidth(5);
                    c2.setStroke(Color.BLACK);
                    Rectangle r = new Rectangle(w , h / 2 + 40);

                    Circle c3 = new Circle(w / 2 - 40 , h / 2 - 40 , 10);
                    c3.setFill(Color.RED);
                    c3.setOnMousePressed((e) -> {
                              System.out.println("right eye");
                    });
                    Circle c4 = new Circle(w / 2 + 40 , h / 2 - 40 , 10);
                    c4.setFill(Color.RED);
                    c4.setOnMousePressed((e) -> {
                              System.out.println("left eye");
                    });

                    Shape s = Polygon.subtract(c2 , r);
                    s.setFill(Color.WHITESMOKE);
                    s.setOnMousePressed((e) -> {
                              System.out.println("smile");
                    });
                    Group root = new Group(c1 , s , c3 , c4);

                    Scene scene = new Scene(root , w , h);

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
