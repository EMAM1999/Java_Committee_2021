/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package task.R92F;
import interfaces.Paint;
/**

 @author REHAM
 */
public abstract class Shape implements Paint {

      double Area;

      public double getArea() {
            return Area;
      }

      public abstract void getShapeType();

}
