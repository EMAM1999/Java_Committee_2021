/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package polymorphism;

import is_a.Proffessor;

/**

 @author EMAM
 */
public class NewClass {


          public static void main(String[] args) {
                    Object[] o = new Object[100];
                    o[0] = 5;
                    o[0] = 5.5;
                    o[0] = 'a';
                    o[0] = "emam";
                    o[0] = true;
                    o[0] = new Proffessor();

          }

}
