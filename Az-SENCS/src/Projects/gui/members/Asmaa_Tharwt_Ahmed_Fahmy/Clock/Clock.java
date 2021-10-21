/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.members.Asmaa_Tharwt_Ahmed_Fahmy.Clock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**

 @author AsmaaTharwtAhmedFahm
 */
public class Clock extends Application {

          @Override
          public void start(Stage primaryStage) {

                    Group root = new Group();

                    Scene scene = new Scene(root , 300 , 250);
                    scene.setFill(Color.CADETBLUE);
                    //shape of clock..
                    Circle c1 = new Circle(150.0 , 125.0 , 110);
                    c1.setFill(Color.WHITE);
                    c1.setStroke(Color.BLACK);
                    c1.setStrokeWidth(3);

                    Circle c2 = new Circle(150.0 , 125.0 , 10);
                    c2.setFill(Color.GRAY);
                    c2.setStroke(Color.BLACK);
                    c2.setStrokeWidth(3);
                    Circle c3 = new Circle(150.0 , 125.0 , 5);
                    c3.setFill(Color.DARKSLATEGREY);
                    c3.setStroke(Color.BLACK);
                    c3.setStrokeWidth(3);
                    //clockwise..
                    Line l1 = new Line(150 , 15 , 150 , 30);
                    l1.setStrokeWidth(3);
                    // Line L1 = new Line(160,45 , 160,55 );
                    // L1.setStrokeWidth(3);
                    Label b1 = new Label("12");
                    b1.setTranslateX(145);
                    b1.setTranslateY(38);
                    b1.setScaleX(2);
                    b1.setScaleY(2);

                    Line l2 = new Line(260 , 125 , 245 , 125);
                    l2.setStrokeWidth(3);
                    Label b2 = new Label("3");
                    b2.setTranslateX(230);
                    b2.setTranslateY(115);
                    b2.setScaleX(2);
                    b2.setScaleY(2);
                    Line l3 = new Line(150 , 235 , 150 , 220);
                    l3.setStrokeWidth(3);
                    Label b3 = new Label("6");
                    b3.setTranslateX(148);
                    b3.setTranslateY(190);
                    b3.setScaleX(2);
                    b3.setScaleY(2);
                    Line l4 = new Line(40 , 125 , 55 , 125);
                    l4.setStrokeWidth(3);
                    Label b4 = new Label("9");
                    b4.setTranslateX(65);
                    b4.setTranslateY(115);
                    b4.setScaleX(2);
                    b4.setScaleY(2);
                    //
                    Polyline y1 = new Polyline(148 , 115 , 152 , 115 , 155 , 75 , 150 , 65 , 146 , 75 , 148 , 115);
//                    y1.setTranslateX(50);
                    y1.setFill(Color.GRAY);
                    y1.setStroke(Color.BLACK);
                    y1.setStrokeWidth(3);
                    Polyline y2 = new Polyline(148 , 120 , 152 , 120 , 155 , 55 , 150 , 30 , 146 , 55 , 148 , 120);
                    y2.setFill(Color.DARKSLATEGREY);
                    y2.setStroke(Color.BLACK);
                    y2.setStrokeWidth(3);
                    root.getChildren().addAll(c1 , c2 , c3 , l1 , l2 , l3 , l4 , b1 , b2 , b3 , b4 , y2, y1 );

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
