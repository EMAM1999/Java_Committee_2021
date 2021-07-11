/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Task;

/**

 @author REHAM
 */
public class Sphere extends Shape3D{
          int radius;

          public Sphere(int radius) {
                    this.radius = radius;
          }

          public int getRadius() {
                    return radius;
          }

          public void setRadius(int radius) {
                    this.radius = radius;
          }

           @Override
          public double getArea(){
                    return 4 * Math.PI * Math.pow(radius , 2);
          }



          @Override
          public void getShapeType() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
          
          @Override
          public double getVolume(){
                    return 4.0/3 * Math.PI * Math.pow(radius, 3);
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
}
