/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A22M;
import java.util.ArrayList;

class ShoppingCart {

      private ArrayList<item> items = new ArrayList<item>();

      public void additem(item i) {
            items.add(i);
      }

      public double getTotalCost() {
            double sum = 0;
            for ( int i = 0; i < items.size(); i++ ) {
                  sum += items.get(i).getItemcost();
                  if ( items.get(i) instanceof CountableItem ) {
                        sum += ((CountableItem)items.get(i)).getItemcost();
                  } else {
                        sum += ((Uncountable)items.get(i)).getItemcost();
                  }
            }
            return sum;
      }

      public void showAllItems() {
            for ( int i = 0; i < items.size(); i++ ) {
                  if ( items.get(i) instanceof CountableItem ) {
                        System.out.println(((CountableItem)items.get(i)).toString());
                  } else {
                        System.out.println(((Uncountable)items.get(i)).toString());
                  }

            }
      }
}
