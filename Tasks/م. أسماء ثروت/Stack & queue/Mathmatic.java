/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Asmaa
 */
// calculate 3 2 + 5* 7 / .
// 3  2  + --->5       5 5* 7 /.
// 5  5 * ---->25  25  7/ .
// 7 25  / ---->.28


public class Mathmatic {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        Stack <Double> s  =new Stack();
        System.out.println("plese enter the mathmatic expression");
        while(scn.hasNext()){
        String exp =scn.next();
      if("*".equals(exp))
      {
          s.push(s.pop()*s.pop());
      }
      else if("-".equals(exp))
      {
        s.push(s.pop()-s.pop());
      }
      else  if("+".equals(exp))
      {
          s.push(s.pop()+s.pop());
      }
      else  if("/".equals(exp))
      {
         s.push(s.pop()/s.pop());
      }
      else  if(".".equals(exp))
      {
          System.out.println(s.pop());
          break;
      }
       else
      {
          s.push(Double.parseDouble(exp));
      }
    }
    }
}
