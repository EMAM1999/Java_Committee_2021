package Projects.A33F.v2;

import java.util.Scanner;

public class main {// score = 60%

      static Scanner scn = new Scanner(System.in);

      public static void main(String args[]) {
            product products[] = new product[2];
            for ( int i = 0; i < 1; i++ ) {
                  System.out.println("please enter name");
                  String name = scn.next();
                  System.out.println("Enter price");
                  float price = scn.nextFloat();
            }
            Company company = new Company();
//      company.remove_product(123, products);
            product product1 = new product();
            product1.setName("car");

            product1.setPrice(123.3f);
            System.out.println(product1);
            company.add_product(product1);
      }
}
