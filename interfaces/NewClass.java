/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package interfaces;

import java.io.IOException;

/**

 @author EMAM
 */
public class NewClass {


          public static void main(String[] args) throws CloneNotSupportedException , IOException {
                    Text t1 = new Text("123");
                    Text t2 = new Text("123");
                    Text t3 = (Text) t2.clone();
                    t2.s = "321";
                    System.out.println(t3.s);
          }

}

class Text implements Cloneable {


          String s;



          public Text(String s) {
                    this.s = s;
          }



          @Override
          protected Object clone() throws CloneNotSupportedException {
                    return super.clone(); //To change body of generated methods, choose Tools | Templates.
          }

}
