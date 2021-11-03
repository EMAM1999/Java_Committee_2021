package Projects.gui.members.esayed.bank_system;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
/**

 @author M.Sabry
 */
public class main1 {

          public static void print(String a) {
                    System.out.println(a);
          }


          public static String Exception_add_phone() {
                    System.out.print("Please,enter your phone:");
                    String phone = "";
                    for ( ;; ) {
                              try {
                                        in = new Scanner(System.in);
                                        phone = in.next(Pattern.compile("^(01)([0125])([0-9]{8})$"));
                                        break;
                              } catch ( Exception e ) {
                                        System.out.print("Please,enter a correct egyption number:");
                              }
                    }
                    return phone;

          }


          public static double Exception_add_double(String print) {
                    double number = 0;
                    for ( ;; ) {
                              print(print);
                              try {
                                        in = new Scanner(System.in);
                                        number = in.nextDouble();
                                        if ( number >= 0 ) {
                                                  break;
                                        } else {
                                                  print("please enter a positive number!");
                                        }

                              } catch ( Exception e ) {
                                        print("please enter a positive number!");
                              }

                    }
                    return number;
          }


          public static String addEmail() {
                    print("your email?");
                    String Email = in.next();
                    return Email;
          }


          public static String addName() {
                    print("your name?");
                    in = new Scanner(System.in);
                    String Name = in.nextLine();
                    return Name;
          }


          public static String addPhone() {
                    return Exception_add_phone();
          }


          public static double add() {
                    return Exception_add_double("your first money");
          }


          public static String password() {
                    print("enter your password");
                    String password = in.next();
                    return password;
          }


          public static String id() {
                    print("enter your id");
                    String id = in.next();
                    return id;
          }
          static ArrayList<Client1> c = new ArrayList<>();
          static WithdrawAndDeposition wd = new WithdrawAndDeposition();
          static int conunter = 0;
          static Scanner in = new Scanner(System.in);


          public static void main(String[] args) throws FileNotFoundException , IOException {

                    ObjectOutputStream out = null;
                    for ( ;; ) {
                              print("If you wanna make a new account enrter:1\nTo Deposition enter:2\nTo withdraw enter:3");
                              String choice = in.next();
                              switch ( choice ) {
                                        case "1": {
                                                  Client1 thisC = new Client1(addName() , addEmail() , addPhone() , Exception_add_double("enter the money will be added?"));
                                                  c.add(thisC);
                                                  out = new ObjectOutputStream(new FileOutputStream("Client.txt"));
                                                  out.writeObject(thisC);
                                        }
                                        break;
                                        case "2": wd.Deposition(c , id() , password());
                                                  break;
                                        case "3": wd.withdraw(c , id() , password());

                                                  break;
                                        default: print("enter 1 or 2 or 3");

                              }
                              out.close();

                    }
          }

}
