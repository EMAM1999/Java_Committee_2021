/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package io_nio;

import java.io.*;

/**

 @author EMAM
 */
public class WriteToFiles {
//          FileWriter
//          BufferedWriter
//          FileOutputStream
//          PrintStream
//          BufferedOutputStream
//          DataOutputStream
//          ObjectOutputStream

          static String fileName = "C:\\Users\\EMAM\\Desktop\\123";


          public static void main(String[] args) throws FileNotFoundException , IOException {
//                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\EMAM\\Desktop\\123.abc")));
//                    bw.write("Hello world");
//                    bw.close();

//                    System.setOut(new PrintStream(fileName));
//                    for ( String i = "*" ; i.length() < 10 ; i += "*" ) {
//                              System.out.println(i);
//                    }
//                    DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName + ".dat"));
//                    for ( int i = 1 ; i <= 10 ; i++ ) {
//                    dos.writeInt(i);
//                    dos.writeInt(i*i);
//                    dos.writeUTF("\n");
//                    }
//                    System.out.println(dos.size());

//                    Student s = new Student("Ahmed" , "male" , 20 , 90);
//                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName + ".dat"));
//                    oos.writeObject(s);
                    
          }

}

class Student implements Serializable {

          String name;
          String gender;
          int age;
          int grade;


          public Student(String name , String gender , int age , int grade) {
                    this.name = name;
                    this.gender = gender;
                    this.age = age;
                    this.grade = grade;
          }


          public int getAge() {
                    return age;
          }


          public void setAge(int age) {
                    this.age = age;
          }


          public String getGender() {
                    return gender;
          }


          public void setGender(String gender) {
                    this.gender = gender;
          }


          public int getGrade() {
                    return grade;
          }


          public void setGrade(int grade) {
                    this.grade = grade;
          }


          public String getName() {
                    return name;
          }


          public void setName(String name) {
                    this.name = name;
          }

}
