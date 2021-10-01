/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A22M;

abstract class item {

      private String name;
      private double price;

      public item(String name, double price) {
            this.name = name;
            this.price = price;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public double getPrice() {
            return price;
      }

      public void setPrice(double price) {
            this.price = price;
      }

      public abstract double getItemcost();

      public abstract String ToString();
}
