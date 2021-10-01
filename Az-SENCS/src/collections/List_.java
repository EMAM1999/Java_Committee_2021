/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.List;
import java.util.ArrayList;

/**

 @author EMAM
 */
public class List_ {

      public static void main(String[] args) {
            Student s1 = new Student("mohamed", 20);
            Student s2 = new Student("ahmed", 22);
            Student s3 = new Student("mohamed", 20);

            List<Student> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s1);
            System.out.println(list);
            
            
            
      }

      static class Student {

            String name;
            int age;

            public Student(String _name, int _age) {
                  this.name = _name;
                  this.age = _age;
            }

            @Override
            public String toString() {
                  return "{" + name + ", " + age + "}";
            }

            @Override
            public boolean equals(Object _obj) {
                  if ( _obj == null ) {
                        return false;
                  }
                  if ( !(_obj instanceof Student) ) {
                        return false;
                  }
                  return this.name.equalsIgnoreCase(((Student)_obj).name) && this.age == ((Student)_obj).age;
            }

            @Override
            public int hashCode() {
                  int result = 13;
                  result = result * 7 + age;
                  result = result * 7 + this.name.hashCode();
                  return result;
            }

      }
}
