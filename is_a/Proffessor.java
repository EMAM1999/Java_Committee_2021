/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package is_a;

/**

 @author EMAM
 */
public class Proffessor extends Person{


          double salary;
          String subjectName;



          public Proffessor(String name , int age , String phone , String email , double rate , boolean male) {
                    super(name , age , phone , email , rate , male);
          }



          public Proffessor() {
                    super(null , 0 , null , null , 0 , false);
          }

}
