/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A33;

import java.util.Scanner;

/**
 *
 * @author Asmaa
 */
public class company {

    Person p[];
    product pro[];
    order o[];
    Scanner scn = new Scanner(System.in);
    Person per = new Person();
    product pr = new product();
    order or = new order();
    employee e = new employee();
    client c = new client();

    public company(Person[] p, product[] pro, order[] o) {
        this.p = p;
        this.pro = pro;
        this.o = o;
    }

    public company() {
    }

    public void add_product(product p) {
         {
            System.out.println("Please Enter your name:");
            String name = scn.next();
            System.out.println("Please Enter your id:");
            int id = scn.nextInt();
            System.out.println("Please Enter price:");
            float price = scn.nextFloat();
        }
    }

    public void add_person(Person p) {
        Scanner scn = new Scanner(System.in);
         {
            System.out.println("Enter ^e^ if you want add employee \n  Enter ^c^ if you want to add client");
            char c = scn.next().charAt(0);
            switch (c) {
                case 'e':
                    System.out.println("Please Enter your name:");
                    String name = scn.next();
                    System.out.println("Please Enter your id:");
                    int id = scn.nextInt();
                    System.out.println("Please Enter your phone:");
                    String phone = scn.next();
                    System.out.println("Please Enter your salary:");
                    float salary = scn.nextFloat();
                    System.out.println("Please Enter your gendar:");
                    String gendar = scn.next();
                    System.out.println("Please Enter your working time:");
                    String time = scn.next();
                    break;
                case 'c':
                    System.out.println("Please Enter your name:");
                    String name1 = scn.next();
                    System.out.println("Please Enter your id:");
                    int id1 = scn.nextInt();
                    System.out.println("Please Enter your phone:");
                    String phone1 = scn.next();
                    System.out.println("Please Enter your email:");
                    String email1 = scn.next();
                    System.out.println("Please Enter your gendar:");
                    String gendar1 = scn.next();
                    break;
            }
        }
    }

    public void add_order(order o) {

        for (int i = 0; i < o.length(); i++) {
            System.out.println("Enter id of order:");
            int id = scn.nextInt();
            System.out.println("Enter date of order:");
            String date = scn.next();
            System.out.println("If it is paid:");
            boolean paied = scn.nextBoolean();
            per.print_extra_info();
            pr.print();

        }
    }

    public void remove_product(int id) {
        if (pr.getId() == id) {
            remove_product(id);
            System.out.println("This product is removed");
        } else {
            System.out.println("This product is not found");

        }
    }

    public void remove_person(int id) {
        System.out.println("Do you want to remove the employee or client?  e/c");
        String d = scn.next();

        switch (d) {
            case "e":
            case "employee": {
                if (e.getId() == id) {
                    remove_person(id);
                    System.out.println("This employee is removed");
                }
                break;
            }
            case "c":
            case "client":
                if (c.getId() == id) {
                    remove_person(id);
                    System.out.println("This client is not found");

                }
        }
    }

    public void remove_order(int id) {
        if (or.getId() == id) {
            remove_order(id);
            System.out.println("The order of this id is removed");
        } else {
            System.out.println("The order of this id is not found");

        }
    }

    public void person_info(int id) {
        if (per.getId() == id) {
            per.print_extra_info();
        } else {
            System.out.println("The id of this person is not found");
        }
    }

    public void product_info(int id) {
        for (Person p1 : p) {
            if (pr.getId() != id) {
                System.out.println("The id of this product is not found");
            } else {
                pr.print();
            }}
}

    public void order_details(int id) {
        if (or.getId() == id) {
            or.print();
        } else {
            System.out.println("The id of this order is not found");
        }
    }

}
