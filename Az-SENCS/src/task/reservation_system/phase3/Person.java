/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;
import java.util.Date;

/**

 @author EMAM
 */
public abstract class Person {

      public static final String MALE = "M";
      public static final String FEMALE = "F";

      private String firstName;
      private String lastName;
      // M/F
      private String gender;
      private Date dateOfBirth;

      public Person(String _firstName, String _lastName, String _gender, Date _dateOfBirth) {
            this.firstName = _firstName;
            this.lastName = _lastName;
            this.gender = _gender;
            this.dateOfBirth = _dateOfBirth;
      }

      public Date getDateOfBirth() {
            return dateOfBirth;
      }

      public String getFirstName() {
            return firstName;
      }

      public void setFirstName(String _firstName) {
            this.firstName = _firstName;
      }

      public String getGender() {
            return gender;
      }

      public String getLastName() {
            return lastName;
      }

      public void setLastName(String _lastName) {
            this.lastName = _lastName;
      }

      @Override
      public String toString() {
            return "Person {"
                    + "name :: " + (firstName + " " + lastName) + ", "
                    + "gender :: " + gender + ", "
                    + "date of birth " + dateOfBirth + " }";
      }

}
