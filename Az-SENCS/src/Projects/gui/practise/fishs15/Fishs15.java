/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.practise.fishs15;
import java.util.Scanner;

/**

 @author EMAM
 */
public class Fishs15 {

//      []
      private int moved = 0;
      private final byte[] fishs = new byte[9];
      private final byte[] solution = new byte[3];
      private byte winner = 0;
      private boolean player = false;

      public byte[] getSolution() {
            return solution;
      }

      public byte getPlayer() {
            return (byte)(player ? 1 : -1);
      }

      private void setSolution(int n1, int n2, int n3) {
            this.solution[0] = (byte)n1;
            this.solution[1] = (byte)n2;
            this.solution[2] = (byte)n3;
      }

      public byte getWinner() {
            return winner;
      }

      /**
       +ve number for player1
       -ve number for player2

       @param fish
       @return true if there is no moves left (game over)
       */
      public boolean pick(int fish) {
            moved++;
            switchPlayers();
            switch ( fish ) {
                  case 1: fishs[7] = (byte)(player ? 1 : -1);
                        if ( fishs[1] == fishs[7] && fishs[4] == fishs[7] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(1, 4, 7);
                              return true;
                        }
                        if ( fishs[6] == fishs[7] && fishs[8] == fishs[7] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(6, 7, 8);
                              return true;
                        }
                        break;

                  case 2: fishs[0] = (byte)(player ? 1 : -1);
                        if ( fishs[1] == fishs[0] && fishs[2] == fishs[0] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 1, 2);
                              return true;
                        }
                        if ( fishs[3] == fishs[0] && fishs[6] == fishs[0] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 3, 6);
                              return true;
                        }
                        if ( fishs[4] == fishs[0] && fishs[8] == fishs[0] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 4, 8);
                              return true;
                        }
                        break;

                  case 3: fishs[5] = (byte)(player ? 1 : -1);
                        if ( fishs[2] == fishs[5] && fishs[8] == fishs[5] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 5, 8);
                              return true;
                        }
                        if ( fishs[4] == fishs[5] && fishs[3] == fishs[5] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(3, 4, 5);
                              return true;
                        }
                        break;
                  case 4: fishs[2] = (byte)(player ? 1 : -1);
                        if ( fishs[2] == fishs[0] && fishs[2] == fishs[1] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 1, 2);
                              return true;
                        }
                        if ( fishs[2] == fishs[5] && fishs[2] == fishs[8] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 5, 8);
                              return true;
                        }
                        if ( fishs[2] == fishs[4] && fishs[2] == fishs[6] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 4, 6);
                              return true;
                        }
                        break;

                  case 5: fishs[4] = (byte)(player ? 1 : -1);
                        if ( fishs[4] == fishs[0] && fishs[4] == fishs[8] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 4, 8);
                              return true;
                        }
                        if ( fishs[4] == fishs[1] && fishs[4] == fishs[7] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(1, 4, 7);
                              return true;
                        }
                        if ( fishs[4] == fishs[2] && fishs[4] == fishs[6] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 4, 6);
                              return true;
                        }
                        if ( fishs[4] == fishs[3] && fishs[4] == fishs[5] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(3, 4, 5);
                              return true;
                        }
                        break;
                  case 6: fishs[6] = (byte)(player ? 1 : -1);
                        if ( fishs[6] == fishs[0] && fishs[6] == fishs[3] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 3, 6);
                              return true;
                        }
                        if ( fishs[6] == fishs[2] && fishs[6] == fishs[4] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 4, 6);
                              return true;
                        }
                        if ( fishs[6] == fishs[7] && fishs[6] == fishs[8] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(6, 7, 8);
                              return true;
                        }
                        break;
                  case 7: fishs[3] = (byte)(player ? 1 : -1);
                        if ( fishs[3] == fishs[0] && fishs[3] == fishs[6] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 3, 6);
                              return true;
                        }
                        if ( fishs[3] == fishs[4] && fishs[3] == fishs[5] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(3, 4, 5);
                              return true;
                        }

                        break;
                  case 8: fishs[8] = (byte)(player ? 1 : -1);
                        if ( fishs[8] == fishs[0] && fishs[8] == fishs[4] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 4, 8);
                              return true;
                        }
                        if ( fishs[8] == fishs[2] && fishs[8] == fishs[5] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(2, 5, 8);
                              return true;
                        }
                        if ( fishs[8] == fishs[6] && fishs[8] == fishs[7] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(6, 7, 8);
                              return true;
                        }
                        break;
                  case 9: fishs[1] = (byte)(player ? 1 : -1);
                        if ( fishs[1] == fishs[0] && fishs[1] == fishs[2] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(0, 1, 2);
                              return true;
                        }
                        if ( fishs[1] == fishs[4] && fishs[1] == fishs[7] ) {
                              winner = (byte)(player ? 1 : -1);
                              setSolution(1, 4, 7);
                              return true;
                        }
                        break;
            }
            if ( moved == 9 ) {
                  winner = 0;
                  return true;
            }

            return false;
      }

      private boolean switchPlayers() {
            return player = !player;
      }

      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Fishs15 f = new Fishs15();
            int n = 0;
            do {
                  n = in.nextInt();
            } while ( !f.pick(n) );
            System.out.println(f.getWinner() > 0 ? "X" : f.getWinner() < 0 ? "O" : "=");
            System.out.println(f.getSolution()[0]);
            System.out.println(f.getSolution()[1]);
            System.out.println(f.getSolution()[2]);
      }
}
