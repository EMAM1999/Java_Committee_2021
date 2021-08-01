/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_object_methods;

/**

 @author EMAM
 */
public class ToString {

      public static void main(String[] args) {
            Person m = new Person("Ahmed", 50, 'm');
            System.out.println(m);
            String s = Integer.toString(5);
      }
      // backageName.className@HashCode
}

class Person {

      String name;
      int age;
      char gender;

      public Person(String _name, int _age, char _gender) {
            this.name = _name;
            this.age = _age;
            this.gender = _gender;
      }

      @Override
      public String toString() {
            return "Name :: " + name+", "
                    + "Age :: " + age+", "
                    + "Gender :: " + (gender == 'm' ? "Male" : "Female");
      }

}
