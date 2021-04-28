/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package is_a;

import java.util.Scanner;

/**

 @author EMAM
 */
public class NewClass {
// super
// protected
// private
// object


          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
                    Student std = new Student();
                    Proffessor pro = new Proffessor();
                    Person p = new Person("" , 0 , "" , "" , 0 , true);
          }

}

class proff extends person {


          int cNum;

}

class person extends object {


          int bNum;

}

class object {


          int aNum;

}
