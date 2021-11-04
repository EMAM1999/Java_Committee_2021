/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.members.Asmaa_Tharwt_Ahmed_Fahmy.bank_system;

import java.io.Serializable;

/**

 @author Asmaa Tharwt
 */
public class Account implements Serializable {

          private String id;
          private String name;
          private double salary;


          Account() {

          }


          public Account(String id , String name , double salary) {
                    this.id = id;
                    this.name = name;
                    this.salary = salary;
          }


          @Override
          public boolean equals(Object obj) {
                    if ( !(obj instanceof Account) ) {
                              return false;
                    }
                    if ( this == obj ) {
                              return true;
                    }
                    return this.id.equals(((Account) obj).getId());
          }


          public String getId() {
                    return id;
          }


          public void setId(String id) {
                    this.id = id;
          }


          public String getName() {
                    return name;
          }


          public void setName(String name) {
                    this.name = name;
          }


          public double getSalary() {
                    return salary;
          }


          public void setSalary(double salary) {
                    this.salary = salary;
          }


          /**


           @param money

           @return the salary after withdraw
           */
          public double withDrew(double money) {
                    if ( money < salary ) {
                              salary -= money;
                    } else {
                              salary = 0;
                    }
                    return salary;
          }


          public double diposit(double money) {
                    if ( money > 0 ) {
                              salary += money;
                    }
                    return salary;
          }


//          public String search(Account b) {
//                    String txt;
//                    if ( this.id.equals(b.getId()) ) {;
//                              txt = "it Found "
//                                      + "\n" + toString();
//                    } else {
//                              txt = "oops! it not found";
//                    }
//
//                    return txt;
//          }
          @Override
          public String toString() {
                    return "Name is :" + getName()
                            + "\nId is:" + getId()
                            + "\nsalary is:" + getSalary();
          }


}
