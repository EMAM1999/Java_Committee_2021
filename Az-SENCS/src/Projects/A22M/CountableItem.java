/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A22M;

class CountableItem extends item {

      private int numOfSubitem;

      public CountableItem(int numOfSubitem, String name, double price) {
            super(name, price);
            this.numOfSubitem = numOfSubitem;
      }

      public int getNumOfSubitem() {
            return numOfSubitem;
      }

      public void setNumOfSubitem(int numOfSubitem) {
            this.numOfSubitem = numOfSubitem;
      }

      @Override
      public double getItemcost() {
            return numOfSubitem * this.getNumOfSubitem();
      }

      @Override
      public String ToString() {
            return "Name is :" + this.getName() + "Price is :" + this.getPrice() + "Number of sup item is :" + this.getNumOfSubitem();
      }

}
