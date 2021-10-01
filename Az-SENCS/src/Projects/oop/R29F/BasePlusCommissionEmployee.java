/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.oop.R29F;

public class BasePlusCommissionEmployee extends commissionEmployee {

      private double base;

      public BasePlusCommissionEmployee() {
      }

      public BasePlusCommissionEmployee(double base, double grossSales, double commissionRate, String name, int ssn, String address, Gender gen) {
            super(grossSales, commissionRate, name, ssn, address, gen);
            this.base = base;
      }

      public double getBase() {
            return base;
      }

      public void setBase(double base) {
            this.base = base;
      }

      @Override
      public double earning() {
            return base + super.earning();
      }

      @Override
      public void displayAllDetails() {
            System.out.println(super.toString());
            displayEarnings();
      }

      @Override
      public void displayEarnings() {
            System.out.println(earning());
      }
}
