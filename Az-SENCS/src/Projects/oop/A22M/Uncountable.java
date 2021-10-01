/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A22M;

class Uncountable extends item {

      private float weght;

      public Uncountable(float weght, String name, double price) {
            super(name, price);
            this.weght = weght;
      }

      public float getWeght() {
            return weght;
      }

      public void setWeght(float weght) {
            this.weght = weght;
      }

      @Override
      public double getItemcost() {
            return weght * this.getPrice();
      }

      @Override
      public String ToString() {
            return "name is: " + this.getName() + " price is: " + this.getPrice() + "weight is: " + this.getWeght();
      }

}
