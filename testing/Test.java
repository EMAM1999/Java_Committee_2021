/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package testing;

import java.util.Scanner;

/**

 @author EMAM
 */
public class Test {


          static Student[] students = new Student[50];
          static int size = 0;



          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
loop:               while ( true ) {
                              System.out.println("Enter "
                                      + "\n1. to add student "
                                      + "\n2. to show student info"
                                      + "\n3. to get top student"
                                      + "\n4. to get students number"
                                      + "\nelse. to exit");
                              int num = in.nextInt();
                              switch ( num ) {
                                        case 1:
                                                  System.out.println("Enter the name :");
                                                  String name = in.next();
                                                  System.out.println("Enter the age :");
                                                  int age = in.nextInt();
                                                  System.out.println("Is he(she) ? :");
                                                  boolean isMale = in.nextBoolean();
                                                  Student s = new Student(name , age , isMale);
                                                  addStudent(s);
                                                  break;
                                        case 2:
                                                  System.out.println("Enter the name: ");
                                                  name = in.next();
                                                  int index = searchByName(name);
                                                  printStudentInfo(students[index]);
                                                  break;
                                        case 3:
                                                  s = getTopGPA();
                                                  printStudentInfo(s);
                                                  break;
                                        case 4:
                                                  System.out.println(size);
                                                  break;
                                        default:
                                                  System.out.println("good bye");
                                                  break loop;
                              }
                    }
          }



          private static void addStudent(Student s) {
                    students[size++] = s;
          }



          private static Student getTopGPA() {
                    int index = 0;
                    for ( int i = 0 ; i < size ; i++ ) {
                              if ( students[i].getGPA() > students[index].getGPA() ) {
                                        index = i;
                              }
                    }
                    return students[index];
          }



          private static void printStudentInfo(Student s) {
                    System.out.println("[ name: " + s.getName()
                            + ", age: " + s.getAge()
                            + ", " + (s.isMale() ? "male" : "female")
                            + ", GPA: " + s.getGPA() + " ]");
          }



          private static int searchByName(String name) {
                    for ( int i = 0 ; i < size ; i++ ) {
                              if ( students[i].getName().equals(name) ) {
                                        return i;
                              }
                    }
                    return -1;
          }

}
