/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v2;

public class Company {

      private person person[];
      private product product[];
      private Order order[];
      //objects of classes 
      private person person1 = new person();
      private product product1 = new product();
      private Order order1 = new Order();
//////////

      public Company(person[] person, product[] product, Order[] order) {
            this.person = person;
            this.product = product;
            this.order = order;
      }

      public Company() {
            this.person = person;
            this.product = product;
            this.order = order;
      }

      public person[] getPerson() {
            return person;
      }

      public void setPerson(person[] person) {
            this.person = person;
      }

      public product[] getProduct() {
            return product;
      }

      public void setProduct(product[] product) {
            this.product = product;
      }

      public Order[] getOrder() {
            return order;
      }

      public void setOrder(Order[] order) {
            this.order = order;
      }
//method of adding

      public void add_product(product product) {
            System.out.println("The Id of product is:" + product1.getId());
            System.out.println("The Name of is:" + product1.getName());
            System.out.println("The price of is:" + product1.getPrice());

      }

      public void add_person(person person) {
            System.out.println("The Id of person is:" + person.getId());
            System.out.println("The Id of person is:" + person.getName());
            System.out.println("The Id of phone is:" + person.getPhone());
            System.out.println("The Id of Gander is:" + person.getGender());

      }

      public void add_order(Order order) {
            System.out.println("The Id of order is:" + order.getId());
            System.out.println("The  of date of order is:" + order.getDate());
            System.out.println("The person of  is:" + order.getPerson());
            System.out.println("The Id of products of this orders is:" + order.getProducts());

      }
//method of removing

      public void remove_product(int id, product product[]) {
            int c = 0;
            for ( int i = 0; i < product.length; i++ ) {
                  if ( product[i].getId() == id ) {
                        product[i] = null;
                        c++;
                  }
            }
            if ( c == 0 ) {
                  System.out.println("It is not found");
            }
      }

      public void remove_person(int id, person person[]) {
            int c = 0;
            for ( int i = 0; i < person.length; i++ ) {
                  if ( id == person[i].getId() ) {
                        person[i] = null;
                        c++;
                  }
            }
            if ( c == 0 ) {
                  System.out.println("It is not found");
            }
      }

      public void remove_order(int id, Order order[]) {
            int c = 0;
            for ( int i = 0; i < order.length; i++ ) {
                  if ( id == order[i].getId() ) {
                        order[i] = null;
                        c++;
                  }
            }
            if ( c == 0 ) {
                  System.out.println("It is not found");
            }
      }

//methods of print
      public void print_person(int id) {
            if ( person1.getId() == id ) {
                  person1.toString();
            } else {
                  System.out.println("It is not found");
            }
      }

      public void print_product(int id) {
            if ( product1.getId() == id ) {
                  product1.toString();
            } else {
                  System.out.println("It is not found");
            }

      }

      public void print_order(int id) {
            if ( order1.getId() == id ) {
                  order1.print();
            } else {
                  System.out.println("It is not found");
            }

      }

}
