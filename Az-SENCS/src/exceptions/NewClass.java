/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**

 @author EMAM
 */
public class NewClass {

// try catch finally
      static int getSize() throws Exception {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if ( num < 0 ) {
                  throw new Exception("-ve number not allowed as a size of the array");
            }
            return num;
      }

      public static void main(String[] args) {
            try {
                  Scanner in = new Scanner(System.in);
                  System.out.println("-> 1");
                  int size = getSize();
                  System.out.println("-> 2");
                  int[] array = new int[size];
                  System.out.println("-> 3");
                  for ( int i = 0; i < array.length; i++ ) {
                        array[i] = in.nextInt();
                  }
                  System.out.println("-> 4");
                  int index = in.nextInt();
                  System.out.println("-> 5");
                  System.out.println(array[index]);
                  System.out.println("-> 6");
            } catch ( ArithmeticException | InputMismatchException | NegativeArraySizeException e ) {
            } catch ( Exception e ) {
                  System.out.println(e.getMessage());
            }
//                    Scanner in = new Scanner(System.in);
//                    int num = in.nextInt();
//                    char op = in.next().charAt(0);
//                    int num2 = in.nextInt();
//                    switch ( op ) {
//                              case '+': System.out.println(num + num2);
//                                        break;
//                              case '-': System.out.println(num - num2);
//                                        break;
//                              case '*': System.out.println(num * num2);
//                                        break;
//                              case '/':
//                                        try {
//                                                  System.out.println(num / num2);
//                                        } catch ( ArithmeticException e ) {
//
//                                        }
//                                        break;
//                    }

//                    Scanner in = new Scanner(System.in);
//                    int num = in.nextInt();
//                    char op = in.next().charAt(0);
//                    int num2 = in.nextInt();
//                    switch ( op ) {
//                              case '+': System.out.println(num + num2);
//                                        break;
//                              case '-': System.out.println(num - num2);
//                                        break;
//                              case '*': System.out.println(num * num2);
//                                        break;
//                              case '/':
//                                        try {
//                                                  System.out.println(num / num2);
//                                        } catch ( ArithmeticException e ) {
//
//                                        }
//                                        break;
//                    }
      }

}
