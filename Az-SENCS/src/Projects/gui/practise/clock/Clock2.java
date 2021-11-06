/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.clock;

import java.time.LocalTime;
import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.transform.*;
import javafx.util.*;

/**

 @author EMAM
 */
public class Clock2 extends Group {

          double radius;
          boolean hasNumbers;
          boolean isSmoth;
          int longDashs;
          int shortDashs;
          Color bodyColor;
          Color hourHandColor;
          Color minuteHandColor;
          Color secondHandColor;

          Group body = new Group();
          Group hands = new Group();
          Group hourHand = new Group();
          Group minuteHand = new Group();
          Group secondHand = new Group();


          public Clock2(double radius , boolean hasNumbers , boolean smoth , int longDashs , int shortDashs , Color bodyColor , Color hourHandColor , Color minuteHandColor , Color secondHandColor) {
                    this.radius = radius;
                    this.hasNumbers = hasNumbers;
                    this.isSmoth = isSmoth;
                    this.longDashs = longDashs;
                    this.shortDashs = shortDashs;
                    this.bodyColor = bodyColor;
                    this.hourHandColor = hourHandColor;
                    this.minuteHandColor = minuteHandColor;
                    this.secondHandColor = secondHandColor;
                    initBody();
                    initHands();
                    this.getChildren().addAll(body , hands);
                    initAnimation();
                    play();
          }


          private Circle drawBody() {
                    Circle c = new Circle(radius);
                    c.setStroke(bodyColor);
                    c.setStrokeWidth(radius / 30);
                    c.setFill(Color.TRANSPARENT);
                    return c;
          }


          private Group drawDashs() {
                    Group longDashs = drawDashs(this.longDashs , radius * 17 / 20);
                    Group shortDashs = drawDashs(this.shortDashs , radius * 18.5 / 20);
                    return new Group(longDashs , shortDashs);
          }


          private Group drawDashs(int num , double len) {
                    Group g = new Group();
                    for ( int i = 0 ; i < num ; i++ ) {
                              double degree = Math.toRadians(i * 360 / num);
                              Line line = new Line(
                                      radius * Math.sin(degree) , -radius * Math.cos(degree) ,
                                      len * Math.sin(degree) , -len * Math.cos(degree));
                              g.getChildren().add(line);
                    }
                    return g;
          }

          Timeline t;


          private void initAnimation() {
                    t = new Timeline(
                            new KeyFrame(Duration.millis(70) ,
                                    (e) -> refresh()
                            )
                    );
                    t.setCycleCount(Timeline.INDEFINITE);
          }


          private void initBody() {
                    Circle body = drawBody();
                    Group dashs = drawDashs();
                    this.body.getChildren().add(new Group(body , dashs));
          }


          private void initHands() {
                    initHourHand();
                    initminuteHand();
                    initSecondHand();
                    hands.getChildren().addAll(hourHand , minuteHand , secondHand);
          }


          private void initHourHand() {
                    double w = radius / 10;
                    double h = radius * 2 / 3;
                    Rectangle r = new Rectangle(-w / 2 , -h , w , h);
                    r.setFill(hourHandColor);

                    hourHand.getChildren().add(r);
          }


          private void initSecondHand() {
                    double w = radius / 15;
                    double h = radius;
                    Rectangle r = new Rectangle(-w / 2 , -h , w , h);
                    r.setFill(minuteHandColor);
                    secondHand.getChildren().add(r);
          }


          private void initminuteHand() {
                    double w = radius / 10;
                    double h = radius * 4 / 5;
                    Rectangle r = new Rectangle(-w / 2 , -h , w , h);
                    r.setFill(hourHandColor);
                    minuteHand.getChildren().add(r);
          }


          private void play() {
                    t.play();
          }


          private void refresh() {
                    LocalTime time = LocalTime.now();
                    int h = time.getHour();
                    int m = time.getMinute();
                    int s = time.getSecond();

                    double hourDegree = h * 30;
                    double minuteDegree = m * 6;
                    double secondDegree = s * 6;

//                    hourHand.setRotate(hourDegree);
//                    minuteHand.setRotate(minuteDegree);
//                    secondHand.setRotate(secondDegree);
                    Rotate hr = new Rotate(hourDegree);
                    hourHand.getTransforms().clear();
                    hourHand.getTransforms().add(hr);
                    Rotate mr = new Rotate(minuteDegree);
                    minuteHand.getTransforms().clear();
                    minuteHand.getTransforms().add(mr);
                    Rotate sr = new Rotate(secondDegree);
                    secondHand.getTransforms().clear();
                    secondHand.getTransforms().add(sr);

          }

}
