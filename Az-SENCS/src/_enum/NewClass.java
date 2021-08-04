/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _enum;
import _enum.person.genderEnum;

/**

 @author EMAM
 */
public class NewClass {

      public static void main(String[] args) {
            System.out.println(genderEnum.MALE);
            person p1 = new person("ahmed", 20, genderEnum.MALE);
            person p2 = new person("noha", 20, genderEnum.FEMALE);

            account a1 = new account(123, "Ahmed", account.saving);
      }
}

//   {
//                []
//                []
//                []
//                []
//   }
class person {

      String name;
      int age;
      genderEnum gender;

      static enum genderEnum {
            MALE, FEMALE
      }

      public person(String _name, int _age, genderEnum _gender) {
            this.name = _name;
            this.age = _age;
            this.gender = _gender;
      }

      @Override
      public String toString() {
            String gender = "";
            if ( this.gender == genderEnum.MALE ) {
                  gender = "male";
            } else if ( this.gender == genderEnum.FEMALE ) {
                  gender = "female";
            }
            return name + "  " + age + "  " + gender;
      }
}

class account {

      int id;
      String name;
      String type;
// saving , running

      static final String saving = "s";
      static final String running = "r";

      public account(int _id, String _name, String _type) {
            this.id = _id;
            this.name = _name;
            this.type = _type;
      }

}
