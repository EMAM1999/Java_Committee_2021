/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package task.R92F;

/**

 @author REHAM
 */
public class Cylinder extends Shape3D {


          int radius;
          int height;



          public Cylinder(int radius , int height) {
                    this.radius = radius;
                    this.height = height;
          }



          public int getHeight() {
                    return height;
          }



          public void setHeight(int height) {
                    this.height = height;
          }



          public int getRadius() {
                    return radius;
          }



          public void setRadius(int radius) {
                    this.radius = radius;
          }



          @Override
          public double getArea() {
                    return 2 * Math.PI * radius * (radius + height);
          }



          @Override
          public void getShapeType() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }



          @Override
          public double getVolume() {
                    return Math.PI * Math.pow(radius , 2) * height;
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

}
