/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Task;

/**

 @author REHAM
 */
public class Cube extends Shape3D{
          int length;
          

          public Cube(int length) {
                    this.length = length;
          }
          public int getLength() {
                    return length;
          }

          public void setLength(int length) {
                    this.length = length;
          }

          
          @Override
          public double getArea(){
                    return 6 * Math.pow(length, 2);
          }



          @Override
          public void getShapeType() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
          
          @Override
          public double getVolume(){
                    return Math.pow(length, 3);
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
          
}
