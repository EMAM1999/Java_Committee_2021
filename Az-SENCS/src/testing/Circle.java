/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package testing;

/**

 @author EMAM
 */
public class Circle {


          public double radios ;



          public Circle(double r) {
                    radios = r;
          }



          public double getArea() {
                    return radios * radios * Math.PI;
          }



          public double getcer() {
                    return 2 * radios * Math.PI;
          }

}
