/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.yellow_team;

import static Projects.gui.yellow_team.Sudoku.isValid;
import java.util.HashSet;
import java.util.Set;

/**

 @author mohas
 */
public class SamuraiSudoku {

          private Sudoku[] unSolvedBoard;
          private Sudoku[] solvedBoard;

          public static final int LEFT_UP = 0;
          public static final int RIGHT_UP = 1;
          public static final int CENTER = 2;
          public static final int LEFT_DOWN = 3;
          public static final int RIGHT_DOWN = 4;


          public SamuraiSudoku(int n) {
                    unSolvedBoard = generate(n);
                    solvedBoard = solve(unSolvedBoard);
          }


          public int[][][] getSolvedBoard() {
                    return new int[][][] {
                              solvedBoard[0].getUnSolvedBoard() ,
                              solvedBoard[1].getUnSolvedBoard() ,
                              solvedBoard[2].getUnSolvedBoard() ,
                              solvedBoard[3].getUnSolvedBoard() ,
                              solvedBoard[4].getUnSolvedBoard() };
          }


          public int[][][] getUnSolvedBoard() {
                    return new int[][][] {
                              unSolvedBoard[LEFT_UP].getUnSolvedBoard() ,
                              unSolvedBoard[RIGHT_UP].getUnSolvedBoard() ,
                              unSolvedBoard[CENTER].getUnSolvedBoard() ,
                              unSolvedBoard[LEFT_DOWN].getUnSolvedBoard() ,
                              unSolvedBoard[RIGHT_DOWN].getUnSolvedBoard(), };
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
                    rightUpSudoku.getList().size();

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

                    Sudoku[] s = new Sudoku[5];
                    s[LEFT_UP] = leftUpSudoku;
                    s[RIGHT_UP] = rightUpSudoku;
                    s[CENTER] = centerSudoku;
                    s[LEFT_DOWN] = leftDownSudoku;
                    s[RIGHT_DOWN] = rightDownSudoku;
                    return s;
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


          private Sudoku[] solve(Sudoku[] sudokus) {
                    Set<int[][]> luSet = sudokus[LEFT_UP].getList();
                    Set<int[][]> ruSet = sudokus[RIGHT_UP].getList();
                    Set<int[][]> cSet = sudokus[CENTER].getList();
                    Set<int[][]> ldSet = sudokus[LEFT_DOWN].getList();
                    Set<int[][]> rdSet = sudokus[RIGHT_DOWN].getList();
                    // get the common between all solutions 
                    Set<int[][]> solutions1 = getCommon(luSet , cSet , 6 , 6 , 0 , 0);
                    Set<int[][]> solutions2 = getCommon(ruSet , solutions1 , 6 , 0 , 0 , 6);
                    Set<int[][]> solutions3 = getCommon(ldSet , solutions2 , 0 , 6 , 6 , 0);
                    Set<int[][]> solutions4 = getCommon(rdSet , solutions3 , 0 , 0 , 6 , 6);

                    return new Sudoku[] {};
          }


          private Set<int[][]> getCommon(Set<int[][]> side , Set<int[][]> center , int xSide , int ySide , int xCenter , int yCenter) {
                    Set<int[][]> commonSet = new HashSet<>();
                    //////////////////////////////////
                    return commonSet;
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
