/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v2;

public class Employee extends person {

      private float salary;
      private String Working_time;

      public Employee(float salary, String Working_time, String phone, String gender, String name) {
            super(phone, gender, name);
            this.salary = salary;
            this.Working_time = Working_time;
      }

      public Employee() {

            this.salary = salary;
            this.Working_time = Working_time;

      }

      public float getSalary() {
            return salary;
      }

      public void setSalary(float salary) {
            this.salary = salary;
      }

      public String getWorking_time() {
            return Working_time;
      }

      public void setWorking_time(String Working_time) {
            this.Working_time = Working_time;
      }

      @Override
      public String toString() {
            super.toString();
            return "salary is:" + salary + "\nworkingTime is:" + Working_time;
      }

}
