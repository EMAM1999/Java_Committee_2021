/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.yellow_team;

import java.util.HashSet;
import java.util.Set;

/**

 @author EMAM
 */
public class Sudoku {

          private Set<int[][]> list = new HashSet<>();
          private int[][] unSolvedBoard = new int[9][9];
          private int[][] solvedBoard = new int[9][9];


          public Sudoku(int n , boolean solve) {
                    unSolvedBoard = generate(new int[9][9] , n);
                    if ( solve ) {
                              solvedBoard = solve(unSolvedBoard);
                              list = multiSolutions(copy(unSolvedBoard));
                    }
          }


          public Sudoku(int[][] board) {
                    unSolvedBoard = board;
                    solvedBoard = solve(unSolvedBoard);
                    list = multiSolutions(copy(unSolvedBoard));
          }


          public Sudoku(int n) {
                    unSolvedBoard = generate(new int[9][9] , n);
                    solvedBoard = solve(unSolvedBoard);
                    list = multiSolutions(copy(unSolvedBoard));
          }


          /**

           @param board
           @param number

           @return
           */
          private int[][] generate(int[][] board , int number) {
                    if ( number <= 0 ) {
                              return board;
                    }
                    int n, i, j, bCopy[][], b[][];
                    do {
                              b = copy(board);
                              for ( int k = 0 ; k < number ; k++ ) {
                                        i = (int) (Math.random() * 9);
                                        j = (int) (Math.random() * 9);
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
                              bCopy = copy(b);
                    } while ( !solve(bCopy , 0 , 0) );
                    return b;
          }


          public Set<int[][]> getList() {
                    return list;
          }


          public int[][] getSolvedBoard() {
                    return solvedBoard;
          }


          public int[][] getUnSolvedBoard() {
                    return unSolvedBoard;
          }


          public static boolean isValid(int b[][] , int row , int col , int num) {
                    int ii = row / 3 * 3;
                    int jj = col / 3 * 3;
                    for ( int i = 0 ; i < 9 ; i++ ) {
                              if ( b[row][i] == num ) {
                                        return false;
                              }
                              if ( b[i][col] == num ) {
                                        return false;
                              }
                              if ( b[ii + i / 3][jj + i % 3] == num ) {
                                        return false;
                              }
                    }
                    return true;
          }


          private int[][] solve(int[][] board) {
                    int[][] b = copy(board);
                    if ( solve(b , 0 , 0) ) {
                              return b;
                    }
                    return board;
          }


          public static boolean solve(int bord[][] , int row , int col) {
                    if ( row == 8 && col == 9 ) {
                              return true;
                    }
                    if ( col == 9 ) {
                              row++;
                              col = 0;
                    }
                    if ( bord[row][col] > 0 ) {
                              return solve(bord , row , col + 1);
                    }
                    for ( int num = 1 ; num <= 9 ; num++ ) {
                              if ( isValid(bord , row , col , num) ) {
                                        bord[row][col] = num;
                                        if ( solve(bord , row , col + 1) ) {
                                                  return true;
                                        }
                              }
                              bord[row][col] = 0;
                    }
                    return false;
          }


          public static int[][] copy(int[][] board) {
                    int[][] b = new int[9][9];
                    for ( int i = 0 ; i < 9 ; i++ ) {
                              System.arraycopy(board[i] , 0 , b[i] , 0 , 9);
                    }
                    return b;
          }


          private final Set<int[][]> multiSolutions(int[][] board) {
                    Set<int[][]> solutions = new HashSet();
                    new Object() {
                              boolean solve(int[][] board) {
                                        for ( int i = 0 ; i < 9 ; i++ ) {
                                                  for ( int j = 0 ; j < 9 ; j++ ) {
                                                            if ( board[i][j] >= 1 && board[i][j] <= 9 ) {
                                                                      continue;
                                                            }
                                                            for ( int k = 1 ; k <= 9 ; k++ ) {
                                                                      if ( isValid(board , i , j , k) ) {
                                                                                board[i][j] = k;
                                                                                int[][] b = copy(board);
                                                                                if ( solve(b) ) {
                                                                                          solutions.add(b);
                                                                                }
                                                                                board[i][j] = 0;
                                                                      }
                                                            }
                                                            return false;
                                                  }
                                        }
                                        if ( isComplete(board) ) {
                                                  return true;
                                        }
                                        return false;

                              }

                    }.solve(board);
                    return solutions;
          }


          private boolean isComplete(int[][] board) {
                    for ( int i = 0 ; i < board.length ; i++ ) {
                              for ( int j = 0 ; j < board[i].length ; j++ ) {
                                        if ( board[i][j] < 1 || board[i][j] > 9 ) {
                                                  return false;
                                        }
                              }
                    }
                    return true;
          }

}
