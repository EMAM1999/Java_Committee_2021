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

 @author mohas
 */
public class Clock extends Group {

          private double radius;
          private int minutesLinesNumber = 60;
          private boolean hasSecondHand;
          private boolean hasMinutesLines;

          private Group clockHourHand = new Group();
          private Group clockMinuteHand = new Group();
          private Group clockSecondHand = new Group();
          private Group clockCenter = new Group();
          private Group clockBody = new Group();
          private Group clockHoursLines = new Group();
          private Group clockMinutesLines = new Group();

          private Color bodyColor;
          private Color hourHandColor;
          private Color minuteHandColor;
          private Color secondHandColor;


          public Clock(double radius , boolean hasSecondHand , boolean hasMinutesLines) {
                    this(radius , hasSecondHand , hasMinutesLines , Color.TRANSPARENT , Color.BLACK , Color.CADETBLUE , Color.YELLOWGREEN);
          }


          public Clock(double radius , boolean hasSecondHand , boolean hasMinutesLines , Color bodyColor , Color hourHandColor , Color minuteHandColor , Color secondHandColor) {
                    this.radius = radius;
                    this.hasSecondHand = hasSecondHand;
                    this.hasMinutesLines = hasMinutesLines;
                    this.bodyColor = bodyColor;
                    this.hourHandColor = hourHandColor;
                    this.minuteHandColor = minuteHandColor;
                    this.secondHandColor = secondHandColor;
                    initDraw();
                    initAnimation();
                    start();
          }

          Timeline t;


          private void initAnimation() {
                    t = new Timeline(
                            new KeyFrame(Duration.millis(70) ,
                                    e -> refresh()
                            ));
                    t.setCycleCount(Timeline.INDEFINITE);
          }


          private void refresh() {
                    LocalTime time = LocalTime.now();

                    int seconds = time.getSecond();
                    Rotate rotate = new Rotate(seconds * 6);
                    clockSecondHand.getTransforms().clear();
                    clockSecondHand.getTransforms().add(rotate);

                    int minutes = time.getMinute();
                    rotate = new Rotate(minutes * 6 + seconds / 10);
                    clockMinuteHand.getTransforms().clear();
                    clockMinuteHand.getTransforms().add(rotate);

                    int hours = time.getHour();
                    rotate = new Rotate(hours * 30 + minutes / 2);
                    clockHourHand.getTransforms().clear();
                    clockHourHand.getTransforms().add(rotate);
          }


          private void start() {
                    t.play();
          }


          private void initDraw() {
                    initHourHand();
                    initMinuteHand();
                    if ( this.hasSecondHand ) {
                              initSecondHand();
                    }
                    initCenter();
                    initBody();
                    initHoursLines();
                    if ( this.hasMinutesLines ) {
                              initMinutesLines();
                    }
                    this.getChildren().addAll(clockBody , clockHoursLines , clockMinutesLines , clockHourHand , clockMinuteHand , clockSecondHand , clockCenter);
          }


          private void initBody() {
                    Circle body = new Circle(radius);
                    body.setFill(this.bodyColor);
                    body.setStrokeWidth(radius / 30);
                    body.setStroke(Color.BLACK);
                    clockBody = new Group(body);
          }


          private void initHoursLines() {
                    clockHoursLines = new Group();
                    for ( int i = 0 ; i < 12 ; i++ ) {
                              double degree = Math.toRadians(i * 30);
                              Line line = new Line(
                                      radius * Math.sin(degree) , -radius * Math.cos(degree) ,
                                      radius * 17 / 20 * Math.sin(degree) , -radius * 17 / 20 * Math.cos(degree));
                              line.setStrokeWidth(radius / 50);
                              clockHoursLines.getChildren().add(line);
                    }
          }


          private void initMinutesLines() {
                    clockMinutesLines = new Group();
                    for ( int i = 0 ; i < minutesLinesNumber ; i++ ) {
                              double degree = Math.toRadians(i * 360 / minutesLinesNumber);
                              Line line = new Line(
                                      radius * Math.sin(degree) , -radius * Math.cos(degree) ,
                                      radius * 18.5 / 20 * Math.sin(degree) , -radius * 18.5 / 20 * Math.cos(degree));
                              clockMinutesLines.getChildren().add(line);
                    }
          }


          private void initCenter() {
                    Circle center = new Circle(radius / 20);
                    center.setFill(Color.BLACK);
                    clockCenter = new Group(center);
          }


          private void initHourHand() {
                    Polygon hourHand = new Polygon(
                            this.radius / 50 , 0 ,
                            radius / 20 , -radius * 4 / 9 ,
                            0 , -radius / 15 - radius * 4 / 9 ,
                            -radius / 20 , -radius * 4 / 9 ,
                            -this.radius / 50 , 0 ,
                            this.radius / 50 , 0
                    );
                    hourHand.setFill(this.hourHandColor);
                    clockHourHand = new Group(hourHand);
          }


          private void initMinuteHand() {
                    Polygon minuteHand = new Polygon(
                            this.radius / 50 , 0 ,
                            radius / 20 , -radius * 2 / 3 ,
                            0 , -radius / 15 - radius * 2 / 3 ,
                            -radius / 20 , -radius * 2 / 3 ,
                            -this.radius / 50 , 0 ,
                            this.radius / 50 , 0
                    );
                    minuteHand.setFill(this.minuteHandColor);
                    clockMinuteHand = new Group(minuteHand);
          }


          private void initSecondHand() {
                    clockSecondHand = new Group();
//                    Polygon secondHand = new Polygon(-r / 50 , 0 , r / 50 , 0 , r / 50 , -r * 9 / 10 , -r / 50 , -r * 9 / 10 , -r / 50 , 0);
                    Line secondHand = new Line(0 , 0 , 0 , -radius * 9 / 10);
                    secondHand.setStrokeWidth(radius / 50);
                    secondHand.setStroke(this.secondHandColor);
                    clockSecondHand.getChildren().add(secondHand);
          }

}
