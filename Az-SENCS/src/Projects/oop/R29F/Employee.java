/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.oop.R29F;

enum Gender {
      male, female
};

public abstract class Employee {

      String name;
      int ssn;
      String address;
      Gender gen;

      public Employee() {
      }

      public Employee(String name, int ssn, String address, Gender gen) {
            this.name = name;
            this.ssn = ssn;
            this.address = address;
            this.gen = gen;
      }

      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      public Gender getGen() {
            return gen;
      }

      public void setGen(Gender gen) {
            this.gen = gen;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public int getSsn() {
            return ssn;
      }

      public void setSsn(int ssn) {
            this.ssn = ssn;
      }

      public abstract double earning();

      public String toString() {
            return "Employee{" + "name=" + name + ", ssn=" + ssn + ", address=" + address + ", gen=" + gen + '}';
      }

}
