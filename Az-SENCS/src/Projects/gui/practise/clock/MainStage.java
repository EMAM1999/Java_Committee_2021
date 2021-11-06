/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.clock;

import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
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

//                    Group clock = new Clock(radius , true , true , null , hourHandColor , minuteHandColor , secondHandColor);
//                    Group clock = new Clock2(radius , hasNumbers , isSmoth , longDashs , shortDashs , bodyColor , hourHandColor , minuteHandColor , secondHandColor);
//                    HBox root = new HBox(clock);
                    Group s1 = creatSegment1(200 , 400);
                    Group s2 = creatSegment2(200 , 400);
                    Group s3 = creatSegment3(200 , 400);
                    writeNumber(s1 , 10);
                    writeNumber(s2 ,11);
                    writeNumber(s3 , 15);
                    HBox root = new HBox(50 , s1 , s2 , s3);

                    root.setAlignment(Pos.CENTER);
                    Scene scene = new Scene(root , 1000 , 600);
                    stage.setScene(scene);
                    stage.show();
          }


          public static void main(String[] args) {
                    launch(args);
          }


          private Group creatSegment1(double w , double h) {
                    w = w / 370;
                    h = h / 630;
                    ObservableList<Double> points;
                    Polygon p1 = new Polygon(
                            w * 110 , -h * 250 ,
                            w * 180 , -h * 315 ,
                            -w * 180 , -h * 315 ,
                            -w * 110 , -h * 250 ,
                            w * 110 , -h * 250
                    );
                    Polygon p2 = new Polygon(
                            -w * 150 , -h * 5 ,
                            -w * 185 , -h * 40 ,
                            -w * 185 , -h * 310 ,
                            -w * 115 , -h * 245 ,
                            -w * 115 , -h * 40 ,
                            -w * 150 , -h * 5
                    );
                    Polygon p3 = new Polygon();
                    points = p2.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 0 ) {
                                        p3.getPoints().add(-1 * points.get(i));
                              } else {
                                        p3.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p4 = new Polygon(
                            w * 145 , 0 ,
                            w * 110 , -h * 35 ,
                            -w * 110 , -h * 35 ,
                            -w * 145 , 0 ,
                            -w * 110 , h * 35 ,
                            w * 110 , h * 35 ,
                            w * 145 , 0
                    );
                    Polygon p5 = new Polygon();
                    points = p2.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p5.getPoints().add(-1 * points.get(i));
                              } else {
                                        p5.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p6 = new Polygon();
                    points = p3.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p6.getPoints().add(-1 * points.get(i));
                              } else {
                                        p6.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p7 = new Polygon();
                    points = p1.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p7.getPoints().add(-1 * points.get(i));
                              } else {
                                        p7.getPoints().add(points.get(i));
                              }
                    }
                    return new Group(p1 , p2 , p3 , p4 , p5 , p6 , p7);
          }


          private Group creatSegment2(double w , double h) {
                    ObservableList<Double> points;
                    w = w / 260;
                    h = h / 260;
                    Polygon p1 = new Polygon(
                            w * 93 , -h * 130 ,
                            
                            -w * 80 , -h * 130 ,
                            -w * 93 , -h * 129 ,
                            -w * 104 , -h * 127 ,
                            -w * 114 , -h * 124 ,
                            -w * 123 , -h * 120 ,
                            
                            -w * 63 , -h * 100 ,
                            w * 63 , -h * 100
                    );
                    Polygon p2 = new Polygon(
                            -w * 120 , -h * 2 ,
                            -w * 130 , -h * 10 ,
                            -w * 130 , -h * 117 ,
                            -w * 70 , -h * 97 ,
                            -w * 70 , -h * 21.75
                    );
                    Polygon p3 = new Polygon(
                            w * 120 , -h * 2 ,
                            w * 130 , -h * 10 ,
                            
                            w * 130 , -h * 104 ,
                            w * 126 , -h * 113 ,
                            w * 119.5 , -h * 119.5,
                            w * 111 , -h * 125 ,
                            w * 101 , -h * 129 ,
                            
                            w * 70 , -h * 98 ,
                            w * 70 , -h * 21.75
                    );
                    Polygon p4 = new Polygon(
                            w * 113 , 0 ,
                            w * 65 , -h * 18 ,
                            -w * 65 , -h * 18 ,
                            -w * 113 , 0 ,
                            -w * 65 , h * 18 ,
                            w * 65 , h * 18);
                    Polygon p5 = new Polygon();
                    points = p2.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p5.getPoints().add(-1 * points.get(i));
                              } else {
                                        p5.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p6 = new Polygon();
                    points = p3.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p6.getPoints().add(-1 * points.get(i));
                              } else {
                                        p6.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p7 = new Polygon();
                    points = p1.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p7.getPoints().add(-1 * points.get(i));
                              } else {
                                        p7.getPoints().add(points.get(i));
                              }
                    }
                    return new Group(p1 , p2 , p3 , p4 , p5 , p6 , p7);
          }


          private Group creatSegment3(double w , double h) {
                    ObservableList<Double> points;
                    w = w / 14;
                    h = h / 25;
                    Polygon p1 = new Polygon(
                            w * 4.8 , -h * 10 ,
                            w * 2.8 , -h * 12 ,
                            -w * 2.8 , -h * 12 ,
                            -w * 4.8 , -h * 10 ,
                            -w * 2.8 , -h * 8 ,
                            w * 2.8 , -h * 8
                    );
                    Polygon p2 = new Polygon(
                            -w * 5 , -h * 0.2 ,
                            -w * 3 , -h * 2.2 ,
                            -w * 3 , -h * 7.8 ,
                            -w * 5 , -h * 9.8 ,
                            -w * 7 , -h * 7.8 ,
                            -w * 7 , -h * 2.2
                    );
                    Polygon p3 = new Polygon();
                    points = p2.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 0 ) {
                                        p3.getPoints().add(-1 * points.get(i));
                              } else {
                                        p3.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p4 = new Polygon();
                    points = p1.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p4.getPoints().add(points.get(i) + h * 10);
                              } else {
                                        p4.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p5 = new Polygon();
                    points = p2.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p5.getPoints().add(-1 * points.get(i));
                              } else {
                                        p5.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p6 = new Polygon();
                    points = p3.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p6.getPoints().add(-1 * points.get(i));
                              } else {
                                        p6.getPoints().add(points.get(i));
                              }
                    }
                    Polygon p7 = new Polygon();
                    points = p1.getPoints();
                    for ( int i = 0 ; i < points.size() ; i++ ) {
                              if ( i % 2 == 1 ) {
                                        p7.getPoints().add(-1 * points.get(i));
                              } else {
                                        p7.getPoints().add(points.get(i));
                              }
                    }
                    return new Group(p1 , p2 , p3 , p4 , p5 , p6 , p7);
          }


          private void writeNumber(Group g , int num) {
                    boolean number0[] = { true , true , true , false , true , true , true };
                    boolean number1[] = { false , false , true , false , false , true , false };
                    boolean number2[] = { true , false , true , true , true , false , true };
                    boolean number3[] = { true , false , true , true , false , true , true };
                    boolean number4[] = { false , true , true , true , false , true , false };
                    boolean number5[] = { true , true , false , true , false , true , true };
                    boolean number6[] = { true , true , false , true , true , true , true };
                    boolean number7[] = { true , false , true , false , false , true , false };
                    boolean number8[] = { true , true , true , true , true , true , true };
                    boolean number9[] = { true , true , true , true , false , true , true };
                    boolean number10[] = { true , true , true , true , true , true , false };
                    boolean number11[] = { false , true , false , true , true , true , true };
                    boolean number12[] = { true , true , false , false , true , false , true };
                    boolean number13[] = { false , false , true , true , true , true , true };
                    boolean number14[] = { true , true , false , true , true , false , true };
                    boolean number15[] = { true , true , false , true , true , false , false };
                    boolean numberx[] = { false , true , true , true , true , true , false };
                    boolean[] number;
                    switch ( num ) {
                              case 0: number = number0;
                                        break;
                              case 1: number = number1;
                                        break;
                              case 2: number = number2;
                                        break;
                              case 3: number = number3;
                                        break;
                              case 4: number = number4;
                                        break;
                              case 5: number = number5;
                                        break;
                              case 6: number = number6;
                                        break;
                              case 7: number = number7;
                                        break;
                              case 8: number = number8;
                                        break;
                              case 9: number = number9;
                                        break;
                              case 10: number = number10;
                                        break;
                              case 11: number = number11;
                                        break;
                              case 12: number = number12;
                                        break;
                              case 13: number = number13;
                                        break;
                              case 14: number = number14;
                                        break;
                              case 15: number = number15;
                                        break;
                              default: number = numberx;
                    }
                    for ( int i = 0 ; i < 7 ; i++ ) {
                              ((Polygon) g.getChildren().get(i)).setFill(number[i] ? Color.BLACK : Color.TRANSPARENT);
                    }
          }

}
