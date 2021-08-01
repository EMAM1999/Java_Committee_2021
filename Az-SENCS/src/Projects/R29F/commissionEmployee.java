/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.R29F;

public class commissionEmployee extends Employee implements Displayable {

      private double grossSales;
      private double commissionRate;

      public commissionEmployee() {
      }

      public commissionEmployee(double grossSales, double commissionRate, String name, int ssn, String address, Gender gen) {
            super(name, ssn, address, gen);
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
      }

      public void DisplayAllDetails() {
            System.out.println(super.toString());
            System.out.println(toString());
      }

      @Override
      public void displayAllDetails() {
      }

      @Override
      public void displayEarnings() {
            System.out.println(earning());
      }

      @Override
      public double earning() {
            return grossSales + commissionRate;
      }

      public double getCommissionRate() {
            return commissionRate;
      }

      public void setCommissionRate(double commissionRate) {
            this.commissionRate = commissionRate;
      }

      public double getGrossSales() {
            return grossSales;
      }

      public void setGrossSales(double grossSales) {
            this.grossSales = grossSales;
      }

      @Override
      public String toString() {
            return "commissionEmployee{" + "grossSales=" + grossSales + ", commissionRate=" + commissionRate + '}';
      }

}
