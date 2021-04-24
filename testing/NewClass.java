/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package testing;

/**

 @author EMAM
 */
public class NewClass {


          public static void main(String[] args) {

                    int[] array1 = { 1 , 2 , 3 , 4 , 5 };
                    int[] array2 = new int[5];

                    for ( int ele : array2) {
                              System.out.println(ele);
                    }
                    
                    for ( int i = 0 ; i < array1.length ; i++ ) {
                              array2[i] = array1[i];
                    }
                    for ( int ele : array2) {
                              System.out.println(ele);
                    }
//                    double    int       int 
//                    int      double    int 
//                    int      int     double
//                    Student s1 = new Student(3 , 4.5 , 16.5);
                    Student s2 = new Student(3.5 , 5.3 , 6.25);
//                    Student s3 = new Student((int) 4.5 , 10.5 , 19);
//                    Student s4 = new Student(3 , 5 , 19.5);
//                    Student s5 = new Student(35 , 5 , 19.);
          }

          static class Student {


                    int id;
                    double grades;
                    double age;



                    public Student(double id , double grades , double age) {
                              this.id = (int) id;
                              this.grades = grades;
                              this.age = age;
                    }



                    public Student(double id , int grades , int age) {
                              this.id = (int) id;
                              this.grades = grades;
                              this.age = age;
                    }


//

                    public Student(int id , int grades , double age) {
                              this.id = id;
                              this.grades = grades;
                              this.age = age;
                    }

//                    public Student(int id , double grades , double age) {
//                              this.id = id;
//                              this.grades = grades;
//                              this.age = age;
//                    }
          }

}
