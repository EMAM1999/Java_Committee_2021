package Projects.gui.members.esayed.bank_system;

import java.util.ArrayList;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
/**

 @author M.Sabry
 */
public class WithdrawAndDeposition<T extends Client1> {

          private String id;
          private String password;
          private String Deposition;
          private String Withdraw;
          static int index;


          private boolean search(ArrayList<T> t , String id , String password) {
                    boolean search = false;
                    for ( int i = 0 ; i < Client1.size ; i++ ) {
                              if ( id.equals(t.get(index).getId()) && password.equals(t.get(i).getPassword()) ) {
                                        index = i;
                                        search = true;
                                        break;
                              } else {
                                        search = false;
                              }
                    }
                    return search;
          }


          public void Deposition(ArrayList<T> t , String id , String password) {
                    if ( search(t , id , password) ) {
                              t.get(index).setSeposition(main1.Exception_add_double("enter the money will be add?"));
                              System.out.println("Your many in  your pocket:" + t.get(index).getSeposition());
                    } else {
                              System.out.println("the id or password is incorrect!");
                    }

          }


          public void withdraw(ArrayList<T> t , String id , String password) {
                    if ( search(t , id , password) ) {
                              for ( ;; ) {
                                        double withdraw = main1.Exception_add_double("enter the money will be taken?");
                                        if ( withdraw <= t.get(index).getSeposition() ) {
                                                  t.get(index).setSeposition(-withdraw);
                                                  System.out.println("Your money in  your pocket:" + t.get(index).getSeposition());
                                                  break;
                                        } else {
                                                  System.out.println("You do not have this mony ." + "Your money in  your pocket:" + t.get(index).getSeposition());
                                        }
                              }

                    } else {
                              System.out.println("the id or password is incorrect!");
                    }

          }

}
