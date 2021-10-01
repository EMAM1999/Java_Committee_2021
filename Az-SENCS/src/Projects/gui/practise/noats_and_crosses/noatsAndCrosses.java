/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.noats_and_crosses;

/**

 @author mohas
 */
public class noatsAndCrosses {

          private boolean isCellEmpty(int i , int j) {
                    return plate[i][j] != 'X' && plate[i][j] != 'O';
          }


          private boolean isGameFinished() {
                    return playingNum == 0;
          }

          enum Score {
                    X_WON,
                    O_WON,
                    DRAW,
                    STILL,
          }
          private char[][] plate;
          private boolean isXTurn;
          private Score score;
          private int playingNum = 9;


          public noatsAndCrosses(boolean xStarts) {
                    plate = new char[3][3];
                    isXTurn = xStarts;
          }


          public Score choose(int i , int j) {
                    if ( isCellEmpty(i , j) ) {
                              plate[i][j] = isXTurn ? 'X' : 'O';
                              playingNum--;
                              if ( isPlayerWon() ) {
                                        return isXTurn ? Score.X_WON : Score.O_WON;
                              } else if ( isGameFinished() ) {
                                        return score.DRAW;
                              }
                              isXTurn = !isXTurn;
                    }
                    return Score.STILL;
          }


          public Score getScore() {
                    return score;
          }


          public boolean isPlayerWon() {
                    return checkRaw() || checkCol() || checkDiag();
          }


          public boolean checkCol() {
                    // check if any columb is signed with the same litter
                    for ( int i = 0 ; i < 3 ; i++ ) {

                              char l1 = plate[0][i];
                              char l2 = plate[1][i];
                              char l3 = plate[2][i];
                              if ( (l2 == 'X' || l2 == 'O') && l1 == l2 && l2 == l3 ) {
                                        return true;
                              }

                    }
                    return false;
          }


          public boolean checkDiag() {
                    // check if any diagonal is signed with the same litter
                    char l1 = plate[0][0];
                    char l3 = plate[0][2];
                    char l5 = plate[1][1];
                    char l7 = plate[2][0];
                    char l9 = plate[2][2];
                    if ( (l1 == 'X' || l1 == 'O') && l1 == l5 && l1 == l9 ) {
                              return true;
                    } else if ( (l3 == 'X' || l3 == 'O') && l3 == l5 && l3 == l7 ) {
                              return true;
                    }
                    return false;

          }


          public boolean checkRaw() {
                    // check if any raw is signed with the same litter
                    for ( int i = 0 ; i < 3 ; i++ ) {

                              char l1 = plate[i][0];
                              char l2 = plate[i][1];
                              char l3 = plate[i][2];
                              if ( (l2 == 'X' || l2 == 'O') && l1 == l2 && l2 == l3 ) {
                                        return true;
                              }

                    }
                    return false;
          }

}
