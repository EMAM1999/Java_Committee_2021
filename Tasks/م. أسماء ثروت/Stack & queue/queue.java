/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Asmaa
 */
public class queue {

    public static void main(String[] args) {
        game g1 =new game("cars",123);
        game g2 =new game("beach war",923);
        game g3 =new game("ball",423);

        Queue<game> q = new LinkedList<>();
      q.add(g1);
            q.add(g2);
      q.add(g3);
        System.out.println(q);

}
static class game{
    String name;
    int id;

        public game(String name, int id) {
            this.name = name;
            this.id = id;
        }
    @Override
    public String toString() {
        return name +" "+id;
    }
}

    

}
