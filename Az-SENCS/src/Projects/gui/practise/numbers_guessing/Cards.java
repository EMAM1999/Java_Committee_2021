/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.practise.numbers_guessing;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayList;

/**

 @author EMAM
 */
public class Cards {

      private Map<Integer, ArrayList<Integer>> cards = new HashMap<>();
      private int from;
      private int to;

      public Cards(int _from, int _to) {
            setFrom(_from);
            setTo(_to);
            cards = Collections.unmodifiableMap(generateCards(from, to));
      }

      public Map<Integer, ArrayList<Integer>> getCards() {
            return cards;
      }

      public int makeGuess(Set<ArrayList<Integer>> selectedCards) {
            int sum = 0;
            for ( ArrayList<Integer> card: selectedCards ) {
                  for ( int key: this.cards.keySet() ) {
                        if ( this.cards.get(key) == card ) {
                              sum += key;
                              break;
                        }
                  }
            }
            return sum;
      }

      public Cards(int _to) {
            this(1, _to);
      }

      public Cards() {
            this(1, 63);
      }

      public int getFrom() {
            return from;
      }

      private void setFrom(int _from) {
            this.from = _from;
      }

      public int getTo() {
            return to;
      }

      private void setTo(int _to) {
            this.to = _to;
      }

      public static final Map<Integer, ArrayList<Integer>> generateCards(int from, int to) {
            Map<Integer, ArrayList<Integer>> cards = new HashMap<>();
            for ( int i = from; i <= to; i++ ) {
                  // copy of the number to save in sets
                  int num = i;
                  // the sum of valid set that the number saved into 
                  int sum = 0;
                  for ( int j = 1; sum != i; j <<= 1 ) {
                        if ( (num & 1) == 1 ) {
                              cards.putIfAbsent(j, new ArrayList<>());
                              cards.get(j).add(i);
                              sum += j;
                        }
                        num >>= 1;
                  }
            }
            return cards;
      }
}
