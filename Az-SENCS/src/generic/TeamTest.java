/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**

 @author EMAM
 */
public class TeamTest {

      public static void main(String[] args) {
            FootballPlayer p1 = new FootballPlayer("mohamed");
            FootballPlayer p2 = new FootballPlayer("ahmed");
            FootballPlayer p3 = new FootballPlayer("mahmoud");
            
            Team<FootballPlayer> t1 = new Team("Ahly");
            t1.addPlayer(p1);
            t1.addPlayer(p2);
            t1.addPlayer(p3);
            
            BasketballPlayer p4 = new BasketballPlayer("ali");
            BasketballPlayer p5 = new BasketballPlayer("saied");
            BasketballPlayer p6 = new BasketballPlayer("omar");
            
            Team<BasketballPlayer> t2 = new Team("zamalik");
            t2.addPlayer(p4);
            t2.addPlayer(p5);
            t2.addPlayer(p6);
            
            t1.compareTo(t1);
      }
}
