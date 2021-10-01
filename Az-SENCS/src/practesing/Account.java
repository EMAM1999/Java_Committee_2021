/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package practesing;

/**

 @author EMAM
 */
public class Account {


          private int id;
          private double balance;
          private double annualInterestRate;//stored interest rate
          private String dateCreated;



          public Account() {
                    this.id = 0;
                    this.balance = 0;
                    this.annualInterestRate = 0;
                    this.dateCreated = null;
          }



          public Account(int id) {
          }



          public Account(int id , double balance) {
          }



          public Account(double balance) {
          }



          public Account(int id , double balance , double annualInterestRate) {
                    this.id = id;
                    this.balance = balance;
                    this.annualInterestRate = annualInterestRate;
          }



          public double getAnnualInterestRate() {
                    return annualInterestRate;
          }



          public void setAnnualInterestRate(double annualInterestRate) {
                    this.annualInterestRate = annualInterestRate;
          }



          public double getBalance() {
                    return balance;
          }



          public void setBalance(double balance) {
                    this.balance = balance;
          }



          public String getDateCreated() {
                    return dateCreated;
          }



          public int getId() {
                    return id;
          }



          public void setId(int id) {
                    this.id = id;
          }



          public double getMonthlyInterestRate() {
                    return this.annualInterestRate / 100. / 12.;
          }



          public double getMonthlyInterest() {
                    return this.balance * getMonthlyInterestRate();
          }



          public boolean withdraw(double money) {
                    if ( money <= this.balance && money > 0 ) {
                              this.balance -= money;
                              return true;
                    }
                    return false;
          }



          public boolean deposite(double money) {
                    if ( money > 0 ) {
                              this.balance += money;
                              return true;
                    }
                    return false;
          }

}
