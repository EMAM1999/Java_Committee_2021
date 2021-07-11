/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Task;

/**

 @author REHAM
 */
public class Rectangle extends Shape2D {


          int length;
          int width;



          public Rectangle(int length , int width) {
                    this.length = length;
                    this.width = width;
          }



          public int getLength() {
                    return length;
          }



          public void setLength(int length) {
                    this.length = length;
          }



          @Override
          public void getShapeType() {
                    System.out.println("Rectangle");
          }



          public int getWidth() {
                    return width;
          }



          public void setWidth(int width) {
                    this.width = width;
          }



          @Override
          public double getArea() {
                    return length * width;
          }



          @Override
          public double getCircumfrance() {
                    return 2 * (length + width);
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }


}
