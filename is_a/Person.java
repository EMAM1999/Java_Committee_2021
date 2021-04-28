/*
 To change this license he/**
 ader, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package is_a;

/**
 @author EMAM
 */
public class Person extends Object{


          private String name;
          int age;
          protected String phone;
          public String email;
          double rate;
          boolean male;



          public Person(String name , int age , String phone , String email , double rate , boolean male) {
                    this.name = name;
                    this.age = age;
                    this.phone = phone;
                    this.email = email;
                    this.rate = rate;
                    this.male = male;
          }






          protected void setName(String name) {
                    this.name = name;
          }

}
