/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.R29F;

public class salariedEmployee extends Employee implements Displayable {

      double salary;
      double bonus;
      double deductions;

      public salariedEmployee() {
      }

      public salariedEmployee(double salary, double bonus, double deductions, String name, int ssn, String address, Gender gen) {
            super(name, ssn, address, gen);
            this.salary = salary;
            this.bonus = bonus;
            this.deductions = deductions;
      }

      public void displayAllDetails() {
      }

      public double getBonus() {
            return bonus;
      }

      public void setBonus(double bonus) {
            this.bonus = bonus;
      }

      public double getDeductions() {
            return deductions;
      }

      public void setDeductions(double deductions) {
            this.deductions = deductions;
      }

      public double getSalary() {
            return salary;
      }

      public void setSalary(double salary) {
            this.salary = salary;
      }

      public double earning() {
            return (salary + bonus) - deductions;
      }

      public void displayEarnings() {
            System.out.println(earning());
      }

      public void DisplayAllDetails() {
            System.out.println(super.toString());
            System.out.println(toString());
      }

      public String toString() {
            return "salariedEmployee{" + "salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
      }

}
