package Projects.A33F.v1;

import java.util.Scanner;

public class Main { // score = 50%

      Scanner scn = new Scanner(System.in);

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            Person pe1 = new Person(123, "salem", "0102743633", "male");
            Person pe2 = new Person();

            client c1 = new client("salam@gmail.com", 3647, "Asmaa", "01129308216", "female");

            product p1 = new product(123, "books", 1234);
            product p2 = new product(123, "books", 1234);

            order or1 = new order(234, "Nov", true, pe1, p1);
            order or2 = new order();

            employee em1 = new employee(1236.8f, "November");
            em1.Gander = pe1.Gander;
            em1.id = pe1.id;
            em1.name = pe1.name;
            em1.phone = pe1.phone;

            company co = new company();
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//  pe1.print_extra_info();
//          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
//          c1.printf();
//          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//em1.printf();
//          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//p1.print();

// example for array of opject
            Person p[] = new Person[4];
            for ( int i = 0; i < 4; i++ ) {
                  int id = scn.nextInt();
                  String name = scn.next();
                  String phone = scn.next();
                  String gendar = scn.next();

                  p[i] = new Person(id, name, phone, gendar);
            }//To test methods of class company

            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println(" Enter 1 to add product"
                    + "\n Enter 2 to add person"
                    + "\n Enter 3 to add order"
                    + "\n Enter 4 to remove product"
                    + "\n Enter 5 to remove person"
                    + "\n Enter 6 to remove order"
                    + "\n Enter 0 to quit ");
            int n = scn.nextInt();
            System.out.println("Enter id");
            int m = scn.nextInt();
            switch ( n ) {
                  case 1:
                        co.add_product(p2);
                        break;
                  case 2:
                        co.add_person(p[4]);
                        break;
                  case 3:
                        co.add_order(or2);
                        break;
                  case 4:
                        co.remove_product(m);
                        break;
                  case 5:
                        co.remove_person(m);
                        break;
                  case 6:
                        co.remove_order(m);
                        break;
                  case 0:
                        System.exit(0);
            }
      }
}
