/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;
import java.util.ArrayDeque;
import java.util.Queue;

/**

 @author EMAM
 */
public class Queue_ {

      public static void main(String[] args) {
            Queue q = new ArrayDeque();
            q.offer(1);
            q.offer(2);
            q.offer(3);
            q.add(4);
            q.offer(5);
            System.out.println(q);
            System.out.println(q.element());
            System.out.println(q);
            System.out.println(q.poll());
            System.out.println(q);
            System.out.println(q.remove());
            System.out.println(q);
            System.out.println(q.peek());
            System.out.println(q);
      }
}
