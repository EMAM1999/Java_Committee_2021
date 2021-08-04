/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;
import java.util.ArrayList;

/**

 @author EMAM
 */
public class ArrayListTest {
//            [1,2,3,4,5,6]

      public static void main(String[] args) {
            ArrayList<BankAccount> list = new ArrayList<>();
            list.add(new BankAccount());
//            list.add('b');
//            list.add(true);
//            list.add(1.5);
//            list.add(1);
            System.out.println(list);
      }
}

class BankAccount {
}
