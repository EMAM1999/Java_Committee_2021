/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Task.R92F;

/**

 @author REHAM
 */
public class Triangle extends Shape2D {


          int base;
          int length;
          int height;



          public Triangle(int base , int length , int height) {
                    this.base = base;
                    this.length = length;
                    this.height = height;
          }



          public int getBase() {
                    return base;
          }



          public void setBase(int base) {
                    this.base = base;
          }



          public int getHeight() {
                    return height;
          }



          public void setHeight(int height) {
                    this.height = height;
          }



          public int getLength() {
                    return length;
          }



          public void setLength(int length) {
                    this.length = length;
          }



          @Override
          public double getArea() {
                    return 0.5 * base * height;
          }



          @Override
          public double getCircumfrance() {
                    return base + length + height;
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