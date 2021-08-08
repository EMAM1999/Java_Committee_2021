/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**

 @author EMAM
 */
public class Passenger {

      private String firstName;
      private String lastName;
      private String gender;
      private long passportNumber;
      private String nationality;
      private boolean hasVisa;
      private static int passengersNumber;

      public Passenger(String _firstName, String _lastName, String _gender, long _passNumber, String _nationality, boolean _hasVisa) {
            setFirstName(_firstName);
            setLastName(_lastName);
            setGender(_gender);
            setPassportNumber(_passNumber);
            setNationality(_nationality);
            setHasVisa(_hasVisa);
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

      public void setGender(String _gender) {
            this.gender = _gender;
      }

      public String getLastName() {
            return lastName;
      }

      public void setLastName(String _lastName) {
            this.lastName = _lastName;
      }

      public String getNationality() {
            return nationality;
      }

      public void setNationality(String _nationality) {
            this.nationality = _nationality;
      }

      public long getPassportNumber() {
            return passportNumber;
      }

      public void setPassportNumber(long _passNumber) {
            this.passportNumber = _passNumber;
      }

      public boolean hasVisa() {
            return hasVisa;
      }

      public void setHasVisa(boolean _hasVisa) {
            this.hasVisa = _hasVisa;
      }

      public void printInfo() {
            System.out.println("the first name is: " + getFirstName());
            System.out.println("the last name is: " + getLastName());
            System.out.println("the gender is: " + getGender());
            System.out.println("the passport number is: " + getPassportNumber());
            System.out.println("the Nationality :" + getNationality());
            System.out.println("if has visa or not: " + hasVisa());
      }

      public static int getPassengersNumber() {
            return passengersNumber;
      }

}
