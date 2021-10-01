/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.yellow_team;

import static Projects.gui.yellow_team.Sudoku.isValid;

/**

 @author mohas
 */
public class SamuraiSudoku {

          private Sudoku[] unSolvedBoard;

          private int[][][] solvedBoard = {
                    new int[9][9] ,
                    new int[9][9] ,
                    new int[9][9] ,
                    new int[9][9] ,
                    new int[9][9] };


          public SamuraiSudoku(int n) {
                    unSolvedBoard = generate(n);
                    solvedBoard = solve(unSolvedBoard);
          }


          public int[][][] getSolvedBoard() {
                    return new int[][][] {};
          }


          public int[][][] getUnSolvedBoard() {
                    return new int[][][] {
                              unSolvedBoard[0].getUnSolvedBoard() ,
                              unSolvedBoard[1].getUnSolvedBoard() ,
                              unSolvedBoard[2].getUnSolvedBoard() ,
                              unSolvedBoard[3].getUnSolvedBoard() ,
                              unSolvedBoard[4].getUnSolvedBoard(), };
          }


          private Sudoku[] generate(int n) {
                    Sudoku centerSudoku = new Sudoku(n / 5);
                    int[][] centerBoard = centerSudoku.getUnSolvedBoard();

//                    generate left-up side with the common box
                    int[][] num = new int[9][9];
                    for ( int i = 0 ; i < 3 ; i++ ) {
                              for ( int j = 0 ; j < 3 ; j++ ) {
                                        num[i + 6][j + 6] = centerBoard[i][j];
                              }
                    }
                    int[][] leftUp = generateLeftUp(num , n / 5);
                    Sudoku leftUpSudoku = new Sudoku(leftUp);

//                    generate right-up side with the common box
                    num = new int[9][9];
                    for ( int i = 0 ; i < 3 ; i++ ) {
                              for ( int j = 0 ; j < 3 ; j++ ) {
                                        num[i + 6][j] = centerBoard[i][j + 6];
                              }
                    }
                    int[][] rightUp = generateRightUp(num , n / 5);
                    Sudoku rightUpSudoku = new Sudoku(rightUp);

//                    generate left-down side with the common box
                    num = new int[9][9];
                    for ( int i = 0 ; i < 3 ; i++ ) {
                              for ( int j = 0 ; j < 3 ; j++ ) {
                                        num[i][j + 6] = centerBoard[i + 6][j];
                              }
                    }
                    int[][] leftDown = generateLeftDown(num , n / 5);
                    Sudoku leftDownSudoku = new Sudoku(leftDown);

//                    generate right-down side with the common box
                    num = new int[9][9];
                    for ( int i = 0 ; i < 3 ; i++ ) {
                              for ( int j = 0 ; j < 3 ; j++ ) {
                                        num[i][j] = centerBoard[i + 6][j + 6];
                              }
                    }
                    int[][] rightDown = generateRightDown(num , n / 5);
                    Sudoku rightDownSudoku = new Sudoku(rightDown);

                    return new Sudoku[] { leftUpSudoku , rightUpSudoku , centerSudoku , leftDownSudoku , rightDownSudoku };
          }


          private int[][] generateSide(int bord[][] , int num , int i1 , int i2 , int j1 , int j2) {
                    if ( num <= 0 ) {
                              return bord;
                    }
                    int i, j, n, b[][], cobyb[][];
                    do {
                              b = copy(bord);
                              for ( int k = 0 ; k < num ; k++ ) {
                                        i = (int) (Math.random() * 9);
                                        j = (int) (Math.random() * 9);
                                        if ( i >= i1 && i <= i2 && j >= j1 && j <= j2 ) {
                                                  continue;
                                        }
                                        if ( b[i][j] > 0 && b[i][j] < 10 ) {
                                                  k--;
                                                  continue;
                                        }
                                        n = (int) (Math.random() * 9) + 1;
                                        if ( isValid(b , i , j , n) ) {
                                                  b[i][j] = n;
                                        } else {
                                                  k--;
                                        }
                              }
                              cobyb = copy(b);
                    } while ( !Sudoku.solve(cobyb , 0 , 0) );
                    return b;
          }


          private int[][] generateLeftUp(int bord[][] , int num) {
                    return generateSide(bord , num , 6 , 8 , 6 , 8);
          }


          private int[][] generateLeftDown(int bord[][] , int num) {
                    return generateSide(bord , num , 0 , 2 , 6 , 8);
          }


          private int[][] generateRightUp(int bord[][] , int num) {
                    return generateSide(bord , num , 6 , 8 , 0 , 2);
          }


          private int[][] generateRightDown(int bord[][] , int num) {
                    return generateSide(bord , num , 0 , 2 , 0 , 2);
          }


          private static int[][] copy(int bord[][]) {
                    int s[][] = new int[9][9];
                    for ( int i = 0 ; i < bord.length ; i++ ) {
                              System.arraycopy(bord[i] , 0 , s[i] , 0 , bord[i].length);
                    }
                    return s;
          }


          private int[][][] solve(Sudoku[] sudokus) {
                    sudokus[0].getList();
                    sudokus[1].getList();
                    sudokus[2].getList();
                    sudokus[3].getList();
                    sudokus[4].getList();
                    // get the common between all solutions 
                    return new int[][][] {};
          }

//          private static int[][] generateCenter(int bord[][] , int num) {
//                    if ( num <= 0 ) {
//                              return bord;
//                    }
//                    int i, j, n, b[][], cobyb[][];
//                    do {
//                              b = copy(bord);
//                              for ( int k = 0 ; k < num ; k++ ) {
//                                        i = (int) (Math.random() * 9);
//                                        j = (int) (Math.random() * 9);
//                                        if ( i >= 3 && i <= 5 || j >= 3 && j <= 5 ) {
//                                                  if ( b[i][j] > 0 && b[i][j] < 10 ) {
//                                                            k--;
//                                                            continue;
//                                                  }
//                                                  n = (int) (Math.random() * 9) + 1;
//                                                  if ( isValid(b , i , j , n) ) {
//                                                            b[i][j] = n;
//                                                  } else {
//                                                            k--;
//                                                  }
//                                        } else {
//                                                  k--;
//                                                  continue;
//                                        }
//                              }
//                              cobyb = copy(b);
//                    } while ( solve(cobyb , 0 , 0) );
//
//                    return bord;
//          }
}
