/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package has_A;

/**

 @author EMAM
 */
public class test {

//    we will start 9:05 pm 

          public static void main(String[] args) {
                    Laptop.processor p1 = new Laptop.processor("Intel" , "" , 3.5 , 4);
                    Laptop l1 = new Laptop("" , 0 , 0 , 0 , "" , p1);
                    System.out.println(p1.getCores());
          }

}
