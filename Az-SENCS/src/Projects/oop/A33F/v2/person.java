/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v2;

public class person {

      private int id;
      private String phone;
      private String gender;
      private String name;

      public person(String phone, String gender, String name) {
            this.phone = phone;
            this.gender = gender;
            this.id = (int)(Math.random() * 999 + 1);
            this.name = name;
      }

      public person() {
            this.phone = phone;
            this.gender = gender;
            this.id = (int)(Math.random() * 999 + 1);
            this.name = name;

      }

      public int getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      @Override
      public String toString() {
            return "name:" + name + "\nId is:" + id + "\nGender is:" + gender + "\nphone is:" + phone;
      }

}
