/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Task;

/**

 @author REHAM
 */
public class Test {


          public static void main(String[] args) {
                    Rectangle rec = new Rectangle(2 , 3);
                    Triangle tri = new Triangle(5 , 2 , 3);
                    Cube cu = new Cube(8);
                    rec.getShapeType();
                    tri.getShapeType();
                    cu.getShapeType();
          }

}
