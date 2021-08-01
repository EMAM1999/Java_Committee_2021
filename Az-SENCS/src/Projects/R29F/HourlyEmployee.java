/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.R29F;

public class HourlyEmployee extends Employee implements Displayable {

      private double hourRate;
      private int numberOfHours;

      public HourlyEmployee() {
      }

      public HourlyEmployee(double hourRate, int numberOfHours, String name, int ssn, String address, Gender gen) {
            super(name, ssn, address, gen);
            this.hourRate = hourRate;
            this.numberOfHours = numberOfHours;
      }

      public double getHourRate() {
            return hourRate;
      }

      public void setHourRate(double hourRate) {
            this.hourRate = hourRate;
      }

      public int getNumberOfHours() {
            return numberOfHours;
      }

      public void setNumberOfHours(int numberOfHours) {
            this.numberOfHours = numberOfHours;
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
            return numberOfHours + hourRate;
      }

      @Override
      public String toString() {
            return "HourlyEmployee{" + "hourRate=" + hourRate + ", numberOfHours=" + numberOfHours + '}';
      }

      public void DisplayAllDetails() {
            System.out.println(super.toString());
            System.out.println(toString());
      }

}
