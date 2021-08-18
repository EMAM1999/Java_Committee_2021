/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package The_Top_Student;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author M.Sabry
 */
public class Stack_Queu {
    
public static void Print(String first_sec){
                                System.out.println("please enter the of the  "+first_sec+" student");
                                          }

      static Scanner in=new Scanner(System.in);
      static Stack<String>  Name_Of_Student =new Stack<>();
      static Queue<String>  Name_Of_Student1=new ArrayDeque<>();
      
      public  static void Add(String first_sec){
                Print(first_sec);
                String e=in.next();
                Name_Of_Student.push(e);
                Name_Of_Student1.offer(e);
      
      }
    public static void main(String[] args) {
    
        for (int i = 0; i < 10; i++) {
            switch ( i) {
                case 0:{
                       Add("first");
                       }
        break;
                case 1:{ Add("second");
                       }
        break;
                case 2:{ Add("third");
                       }
        break;
                case 8:{ Add("fourth");
        break;                }
                case 3:{ Add("fifth");
                       }
        break;
                case 4:{ Add("sixth");
                       }
        break;
                case 5:{ Add("seventh");
                       }
        break;
                case 6:{ Add("eighth");
                       }
        break;
                case 7:{ Add("ninth");
                       }
       
        break;
                case 9:{ Add("tenth");
                       }
     
            }}
        
       for (int i = 0; i < 10; i++) {
           System.out.println("The "+(i+1)+" will be honored is::"+Name_Of_Student.pop());
        }
        for (int i = 0; i < 40; i++) {System.out.print("*");
                                      if(i==39){System.out.println();}
        }
       
         for (int i = 0; i < 10; i++) {
           System.out.println("The "+(i+1)+"deserves to live in the universite city is::"+Name_Of_Student1.remove());
        }
      








        }
    
}
