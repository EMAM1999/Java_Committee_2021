/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.HashMap;
import java.util.Map;

/**

 @author EMAM
 */
public class Map_ {

      public static void main(String[] args) {
            //Array
            //             0   1     2           3
            //            [1 , 5 , true , "ahmed"]

            //Map <K,V>
            // key              123               456         789
            //value          mohamed    ahmed    mohamed
            Map<Integer, String> students = new HashMap<>();
            students.put(123, "mohamed");
            students.put(456, "ahmed");
            students.putIfAbsent(123, "ali");
            System.out.println(students);
            for ( int key: students.keySet() ) {
                  String value = students.get(key);
                  System.out.println(key + " " + value);
            }
            for ( String value: students.values() ) {
                  System.out.println(value);
            }
            for ( Map.Entry<Integer, String> ele: students.entrySet() ) {
                  System.out.println(ele.getKey() + " " + ele.getValue());
            }
            students.forEach((Integer k, String v) -> System.out.println(k + " " + v));
      }
}
