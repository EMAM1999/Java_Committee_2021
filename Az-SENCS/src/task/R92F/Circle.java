/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package task.R92F;

/**

 @author REHAM
 */
public class Circle extends Shape2D {


          int radius;



          public Circle(int radius) {
                    this.radius = radius;
                    super.Area = Math.PI * Math.pow(radius , 2);
                    super.circumfrance = 2 * Math.PI * radius;
          }



          public int getRadius() {
                    return radius;
          }



          public void setRadius(int radius) {
                    this.radius = radius;
          }



          @Override
          public void getShapeType() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

}
