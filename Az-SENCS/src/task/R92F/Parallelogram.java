/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package task.R92F;

/**

 @author REHAM
 */
public class Parallelogram extends Shape2D{
          int height ;
          int base;
          int a , b;

          public Parallelogram(int height , int base , int a , int b) {
                    this.height = height;
                    this.base = base;
                    this.a = a;
                    this.b = b;
          }

          public int getA() {
                    return a;
          }

          public void setA(int a) {
                    this.a = a;
          }

          public int getB() {
                    return b;
          }

          public void setB(int b) {
                    this.b = b;
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
          
           @Override
          public double getArea(){
                    return base * height;
          }
          
          @Override
          public double getCircumfrance(){
                    return 2*(a+b);
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
