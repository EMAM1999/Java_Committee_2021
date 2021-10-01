/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**

 @author EMAM
 */
public class Team<T extends Player> implements Comparable<Team<T>> {

      private String name;
      private int won;
      private int draw;
      private int lost;

      Player[] players = new Player[20];
      int size = 0;

      public Team(String _name) {
            this.name = _name;
      }

      public void addPlayer(T p) {
      }

      @Override
      public int compareTo(Team<T> o) {
            return this.rank() > o.rank() ? 1 : this.rank() < o.rank() ? -1 : 0;
      }

      public int rank() {
            return won * 3 + draw * 1;
      }

      public void playWith(Team<T> t, int wonOrlose) {
            if ( wonOrlose > 0 ) {
                  this.won++;
                  t.lost++;
            } else if ( wonOrlose < 0 ) {
                  this.lost++;
                  t.won++;
            } else {
                  this.draw++;
                  t.draw++;
            }
      }

}
