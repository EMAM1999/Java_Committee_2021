/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.Set;
import java.util.HashSet;

/**

 @author EMAM
 */
public class Set_ {

      public static void main(String[] args) {
            Student s1 = new Student("mohamed", 20);
            Student s2 = new Student("ahmed", 22);
            Student s3 = new Student("mohamed", 16);
            Student s4 = new Student("ashraf", 20);
            Student s5 = new Student("ali", 22);
            Student s6 = new Student("hamza", 15);

            Set<Student> set1 = new HashSet<>();
            set1.add(s1);
            set1.add(s2);
            set1.add(s3);
            set1.add(s4);
            Set<Student> set2 = new HashSet<>();
            set2.add(s3);
            set2.add(s4);
            set2.add(s5);
            set2.add(s6);
            System.out.println(set1);
            System.out.println(set2);
            set1.addAll(set2);
            System.out.println(set1);
            set1.retainAll(set2);
            System.out.println(set1);
            
      }

      static class Student {

            String name;
            int age;

            public Student(String _name, int _age) {
                  this.name = _name;
                  this.age = _age;
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

            @Override
            public String toString() {
                  return "{" + name + ", " + age + "}";
            }

      }
}
