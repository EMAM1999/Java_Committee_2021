/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;
import java.util.Stack;

/**

 @author EMAM
 */
public class Stack_ {

      public static void main(String[] args) {

            Stack s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            System.out.println(s);
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s);
            System.out.println(s.peek());
            System.out.println(s);

            while ( s.size() > 0 ) {
                  System.out.print(s.pop() + "  >>>  ");
            }
            System.out.println("\b\b\b\b\b\b\b");

            printAB();
            fac(5); //  StackOverflowError

      }

      private static double fac(int i) {
            return i * fac(i - 1);
      }

      private static void printAB() {
//            
//            
            printA();
//            
//            
            printB();
//            
//            
      }

      private static void printA() {
//            
//            
            System.out.println("A");
//            
//            
      }

      private static void printB() {
//            
//            
            System.out.println("B");
//            
//            
      }
}
