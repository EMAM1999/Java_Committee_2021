/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package is_a;

/**

 @author EMAM
 */
public class Student extends Person {


          public int GPA;



          public Student(String name , int age , String phone , String email , double rate , boolean male , int GPA) {
                    super(name , age , phone , email , rate , male);
                    this.GPA = GPA;
          }



          public Student() {
                    super(null , 0 , null , null , 0 , false);
          }

}
