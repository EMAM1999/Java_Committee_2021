/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package concarancy;

import java.util.Calendar;

/**

 @author EMAM
 */
public class TreadTest {

          public static void main(String[] args) throws InterruptedException {
                    while ( true ) {
                              Calendar calendar = Calendar.getInstance();
                              int h = calendar.get(Calendar.HOUR_OF_DAY);
                              int m = calendar.get(Calendar.MINUTE);
                              int s = calendar.get(Calendar.SECOND);
                              System.out.printf("%02d : %02d : %02d" , h , m , s);
                              Thread.sleep(700);
                              System.out.print("\b");
                              Thread.sleep(300);

                    }
          }

}
