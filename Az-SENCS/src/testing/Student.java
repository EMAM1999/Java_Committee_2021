/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package testing;

/**

 @author EMAM
 */
public class Student {


          private String name;
          private int age;
          private float GPA;
          private boolean isSuccess;
          private final boolean   isMale;
          private static String superVicer;
          private static int studentNumber;



          public Student(String n , int a , boolean  g) {
                    this.name = n;
                    this.age = a;
                    this.isMale = g;
                    this.superVicer = "Ahmed";
                    this.studentNumber++;
          }



          public static int getStudentNumber() {
                    return studentNumber;
          }



          public static void setStudentNumber(int studentNumber) {
                    Student.studentNumber = studentNumber;
          }



          public static String getSuperVicer() {
                    return superVicer;
          }



          public static void setSuperVicer(String superVicer) {
                    Student.superVicer = superVicer;
          }



          public int getAge() {
                    return age;
          }



          public void setAge(int age) {
                    this.age = age;
          }



          public float getGPA() {
                    return GPA;
          }



          public void setGPA(float GPA) {
                    this.GPA = GPA;
          }



          public String getName() {
                    return name;
          }



          public void setName(String name) {
                    this.name = name;
          }



          public boolean isMale() {
                    return isMale;
          }



          public boolean isIsSuccess() {
                    return isSuccess;
          }



          public void setIsSuccess(boolean isSuccess) {
                    this.isSuccess = isSuccess;
          }

}
