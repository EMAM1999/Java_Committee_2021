/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v1;

//super class for(client and employee
public class Person {
// we don't have to change them os we will make get methode for them

      int id;
      String name;
      String phone;
      String Gander;

      public Person(int id, String name, String phone, String Gander) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.Gander = Gander;
      }

      public Person() {
      }

      public int getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public String getPhone() {
            return phone;
      }

      public String getGander() {
            return Gander;
      }

      public void print_extra_info() {
            System.out.println("Name is:" + getName() + "\n" + "Id is :" + getId() + "\n" + "Phone is: " + getPhone() + "\n" + "Gender is:" + getGander());
      }

}
