/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package practesing;

/**

 @author EMAM
 */
public class BankAccount {


          public static final int CURRENT_ACCOUNT = 1;
          public static final int SAVING_ACCOUNT = 2;
          public static final int CITIZEN_ACCOUNT = 3;

          private final int accountNumber;
          private final String customerName;
          private double amount;
          private int accountType;
          private boolean isBlocked;

          private static int accountCounter = 0;



          public BankAccount(int accountNumber , String customerName , double amount , int accountType , boolean isBlocked) {
                    this.accountNumber = accountNumber;
                    this.customerName = customerName;
                    this.amount = amount;
                    this.accountType = accountType;
                    this.isBlocked = isBlocked;
                    this.accountCounter++;
          }



          public static int getAccountCounter() {
                    return accountCounter;
          }



          public int getAccountNumber() {
                    return accountNumber;
          }



          public int getAccountType() {
                    return accountType;
          }



          public void setAccountType(int accountType) {
                    this.accountType = accountType;
          }



          public double getAmount() {
                    return amount;
          }



          public void setAmount(double amount) {
                    this.amount = amount;
          }



          public String getCustomerName() {
                    return customerName;
          }



          public boolean isIsBlocked() {
                    return isBlocked;
          }



          public void setIsBlocked(boolean isBlocked) {
                    this.isBlocked = isBlocked;
          }



          public void printData() {
                    System.out.println("customerName: " + this.customerName);
                    System.out.println("accountNumber: " + this.accountNumber);
                    System.out.println("accountType: " + this.accountType);
                    System.out.println("amount: " + this.amount);
                    System.out.println("isBlocked: " + this.isBlocked);
          }



          public void deposite(double money) {
                    if ( isBlocked ) {
                              System.out.println("the account removed");
                    } else {
                              this.amount += money;
                              System.out.println("the process is successful");
                    }
          }



          public void withdraw(double money) {
//                    if ( isBlocked ) {
//                              System.out.println("failed");
//                    } else {
//                              if ( money <= this.amount ) {
//                                        this.amount -= money;
//                                        System.out.println("successful");
//                              } else {
//                                        System.out.println("failed");
//                              }
//                    }
                    if ( !isBlocked && money <= this.amount ) {
                              this.amount -= money;
                              System.out.println("successful");
                    } else {
                              System.out.println("failed");
                    }
          }



          public double interest() {
                    double rate;
                    switch ( accountType ) {
                              case 1: rate = 0.5;
                                        break;
                              case 2: rate = 0.7;
                                        break;
                              case 3: rate = 0.3;
                                        break;
                              default: rate = 0;
                    }
                    this.amount = this.amount + this.amount * rate / 100;
                    return this.amount;
          }

}
