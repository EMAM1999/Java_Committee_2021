/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**

 @author EMAM
 */
public class Lamda {

      public static void main(String[] args) {
            capable c = () -> {
                  System.out.println("hello world");
            };
            c.doSomething();
      }
}

interface capable {

      void doSomething();
}
