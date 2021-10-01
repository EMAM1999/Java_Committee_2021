/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v2;

public class Order {

      private int id;
      private String date;
      private boolean is_paid;
      private person person;
      private product products[];

      public Order(String date, boolean is_paid, person person, product[] products) {
            this.id = (int)(Math.random() * 999 + 1);;
            this.date = date;
            this.is_paid = is_paid;
            this.person = person;
            this.products = products;
      }

      public person getPerson() {
            return person;
      }

      public void setPerson(person person) {
            this.person = person;
      }

      public Order() {
            this.id = (int)(Math.random() * 999 + 1);
            this.date = date;
            this.is_paid = is_paid;
            this.products = products;
            this.person = person;
      }

      public int getId() {
            return id;
      }

      public String getDate() {
            return date;
      }

      public void setDate(String date) {
            this.date = date;
      }

      public boolean isIs_paid() {
            return is_paid;
      }

      public void setIs_paid(boolean is_paid) {
            this.is_paid = is_paid;
      }

      public product[] getProducts() {
            return products;
      }

      public void setProducts(product[] products) {
            this.products = products;
      }

      public void print() {
            System.out.println("The id of this order is:" + getId()
                    + "\nThe date of this order is :" + getDate()
                    + "\nThis orde is paied:" + isIs_paid()
            );
      }

      @Override
      public String toString() {
            return super.toString(); //To change body of generated methods, choose Tools | Templates.
      }

}
