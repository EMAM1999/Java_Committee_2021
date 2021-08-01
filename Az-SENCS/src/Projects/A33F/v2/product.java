/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A33F.v2;

public class product {

      private int id;
      private String name;
      private float price;

      public product(String name, float price) {
            this.name = name;
            this.price = price;
            this.id = (int)(Math.random() * 999 + 1);
      }

      public product() {
            this.name = name;
            this.price = price;
            this.id = (int)(Math.random() * 999 + 1);
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

      public float getPrice() {
            return price;
      }

      public void setPrice(float price) {
            this.price = price;
      }

      @Override
      public String toString() {
            return "id of product is" + getId()
                    + "\nname of product is:" + getName()
                    + "\nprice of product is" + getPrice();
      }

}
