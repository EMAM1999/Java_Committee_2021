/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.members.Asmaa_Tharwt_Ahmed_Fahmy.bank_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**

 @author EMAM
 */
public class Bank {

          private static ArrayList<Account> accounts = new ArrayList<>();
          //to write and read


          public static ArrayList<Account> readFile(String fileName) throws IOException , ClassNotFoundException {
                    ObjectInputStream readObject = null;
                    try {
                              readObject = new ObjectInputStream(new FileInputStream(fileName));
                    } catch ( FileNotFoundException e ) {
                              writeFile(fileName);
                              return accounts;
                    }
                    while ( true ) {
                              try {
                                        Object o = readObject.readObject();
                                        readObject.readUTF();
                                        if ( o instanceof Account ) {
                                                  accounts.add((Account) o);
                                        }
                              } catch ( Exception e ) {
                                        break;
                              }
                    }
                    return accounts;
          }


          public static void writeFile(String fileName) throws IOException {
                    ObjectOutputStream writeOpject = new ObjectOutputStream(new FileOutputStream(fileName));
                    for ( Account a : accounts ) {
                              writeOpject.writeObject(a);
                              writeOpject.writeUTF("\n");
                    }
          }


          public static ArrayList<Account> getAccounts() {
                    return accounts;
          }


          public static Account getOldAccount(String idsearch) {
                    for ( Account a : accounts ) {
                              if ( idsearch.equals(a.getId()) ) {
                                        return a;
                              }
                    }
                    return null;
          }


          public static boolean addAccount(Account newbankAccount) {
                    if ( !accounts.contains(newbankAccount) ) {
                              return accounts.add(newbankAccount);
                    }
                    return false;
          }

}
