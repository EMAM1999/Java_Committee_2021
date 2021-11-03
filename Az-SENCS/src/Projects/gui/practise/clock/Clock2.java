/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.clock;

import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

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
                    play();
          }


          private Circle drawBody() {
                    Circle c = new Circle(radius);
                    c.setStroke(bodyColor);
                    c.setFill(Color.TRANSPARENT);
                    return c;
          }


          private Group drawDashs() {
                    Group longDashs = drawDashs(this.longDashs , 50);
                    Group shortDashs = drawDashs(this.shortDashs , 25);
                    return new Group(longDashs , shortDashs);
          }


          private Group drawDashs(int num , int len) {
                    return new Group();
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
                    minuteHand.getChildren().add(r);
          }


          private void initminuteHand() {
                    double w = radius / 10;
                    double h = radius * 4 / 5;
                    Rectangle r = new Rectangle(-w / 2 , -h , w , h);
                    r.setFill(hourHandColor);
                    secondHand.getChildren().add(r);
          }


          private void play() {
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

}
