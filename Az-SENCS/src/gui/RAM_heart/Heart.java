package gui.RAM_heart;

import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.util.*;

class Heart extends Group {

          private double radius;
          private double ratio;
          private double rate;
          private Timeline t;


          public Heart(double radius , double ratio , double rate) {
                    this.radius = radius;
                    this.ratio = ratio;
                    this.rate = rate;
                    draw();
          }


          public void beat() {
                    double timeOfBeat = 60 / rate;
                    double timeOfMovement = timeOfBeat / 2;
                    double myocardialAndDiastoleTimes = 2;
                    double timeOfMyocardial = timeOfMovement / myocardialAndDiastoleTimes / 2;
                    double timeOfDiastole = timeOfMyocardial;
                    double timeOfMyocardialAndDiastole = timeOfMyocardial * 2;
                    double timeOfStop = timeOfBeat - timeOfMovement;

                    t = new Timeline();
                    for ( int i = 0 ; i < myocardialAndDiastoleTimes ; i++ ) {
                              KeyFrame MyocardialFrame = new KeyFrame(Duration.seconds(timeOfMyocardial + i * timeOfMyocardialAndDiastole) ,
                                      new KeyValue(getChildren().get(0).scaleXProperty() , 1 + ratio) ,
                                      new KeyValue(getChildren().get(0).scaleYProperty() , 1 + ratio));

                              KeyFrame DiastoleFrame = new KeyFrame(Duration.seconds(timeOfMyocardialAndDiastole + i * timeOfMyocardialAndDiastole) ,
                                      new KeyValue(getChildren().get(0).scaleXProperty() , 1) ,
                                      new KeyValue(getChildren().get(0).scaleYProperty() , 1));

                              t.getKeyFrames().add(MyocardialFrame);
                              t.getKeyFrames().add(DiastoleFrame);
                    }
                    t.getKeyFrames().add(
                            new KeyFrame(Duration.seconds(timeOfBeat) ,
                                    new KeyValue(getChildren().get(0).scaleXProperty() , 1) ,
                                    new KeyValue(getChildren().get(0).scaleYProperty() , 1))
                    );
                    t.setCycleCount(Timeline.INDEFINITE);
                    t.play();
          }


          public void setRate(double rate) {
                    t.setRate(rate / this.rate);
          }


          private void draw() {
                    Shape rightSide = drawSide(true);
                    rightSide.setTranslateX(0.6 * radius);
                    Shape leftSide = drawSide(false);
                    leftSide.setTranslateX(-0.6 * radius);
                    getChildren().add(Polygon.union(rightSide , leftSide));
          }


          private Shape drawSide(boolean isRight) {
                    int sign = isRight ? 1 : -1;
                    double r = radius / 2;
                    Circle c1 = new Circle(r);
                    Circle c2 = new Circle(sign * 0.65 * r , 0.75 * r , 2 * r);
                    Circle c3 = new Circle(-sign * 2 * r , 0 , 3 * r);

                    Rectangle r1 = new Rectangle(-sign * 1.2 * r - (isRight ? 0 : 0.5 * r) , -r , 0.5 * r , r);
                    Rectangle r2 = new Rectangle(-sign * 1.2 * r - (isRight ? 0 : 2.4 * r) , 0 , 2.4 * r , 3 * r);

                    Shape shape1 = Polygon.intersect(r1 , c2);
                    Shape shape2 = Polygon.intersect(r2 , c3);
                    Shape shape = Polygon.union(Polygon.union(shape1 , shape2) , c1);

                    return shape;
          }

}
