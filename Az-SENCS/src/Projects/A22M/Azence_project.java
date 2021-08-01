/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A22M;
import java.util.Scanner;

public class Azence_project { // score = 80%

      /**
       @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("num_of_item");
            int numofitem = sc.nextInt();
            System.out.println("name");
            String name = sc.nextLine();
            System.out.println("price");
            double price = sc.nextDouble();

            ShoppingCart cart = new ShoppingCart();
            CountableItem countableItem = new CountableItem(numofitem, name, price);
            cart.additem(countableItem);
            cart.getTotalCost();
            cart.showAllItems();
      }

}
