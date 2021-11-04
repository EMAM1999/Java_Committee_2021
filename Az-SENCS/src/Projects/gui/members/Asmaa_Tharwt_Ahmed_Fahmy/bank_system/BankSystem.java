/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.members.Asmaa_Tharwt_Ahmed_Fahmy.bank_system;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

/**

 @author Asmaa Tharwt
 */
public class BankSystem {

          static Scanner scan = new Scanner(System.in);
          private static String fileName = "file.dat";
          public static Account thisAccount;


          public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException {
                    //..........
                    Bank.readFile(fileName);
                    while ( true ) {
                              System.out.println("Plese Enter 1 to add new Account\nplese Enter 2 to see your old Account\nplese Enter 0 to exist");
                              int n = scan.nextInt();
                              switch ( n ) {
                                        case 0:
                                                  Bank.writeFile(fileName);
                                                  System.exit(0);
                                        case 1:
                                                  System.out.println("Enter your name");
                                                  String name = scan.next();
                                                  System.out.println("Enter Your id");
                                                  String id = scan.next();
                                                  System.out.println("Enter your money");
                                                  double money = scan.nextDouble();
                                                  Account newbankAccount = new Account(id , name , money);
                                                  Bank.addAccount(newbankAccount);
                                                  thisAccount = newbankAccount;
                                                  break;
                                        case 2:
                                                  System.out.println("Enter your id");
                                                  String idsearch = scan.next();
                                                  Account a = Bank.getOldAccount(idsearch);
                                                  if ( a != null ) {
                                                            thisAccount = a;
                                                            System.out.println(thisAccount);
                                                  } else {
                                                            System.out.println("Invalid ID");
                                                  }
                                                  break;
                                        default:
                                                  System.out.println("You Enter invalid value, try again");
                              }
                              
                              
                              
                              
                    }
          }

}
