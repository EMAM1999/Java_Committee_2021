/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.practise.numbers_guessing;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

/**

 @author EMAM
 */
public class TestGuessingGame {

      static Scanner in = new Scanner(System.in);

      public static void main(String[] args) {
            Cards c = new Cards(100);
            c.getCards();

            Set<ArrayList<Integer>> selectedCards = new HashSet<>();
            for ( ArrayList<Integer> v: c.getCards().values() ) {
                  v.forEach((ele) -> {
                        System.out.print(ele + " ");
                  });
                  System.out.println("");
                  String answer = in.next().toUpperCase();
                  switch ( answer ) {
                        case "YES":
                        case "Y": selectedCards.add(v);
                  }
            }
            System.out.println(c.makeGuess(selectedCards));
      }
}
