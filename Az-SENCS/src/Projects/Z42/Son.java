/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.Z42;

public class Son extends Person {

      String educationalLevel;
      String educationalYear;

      public Son() {//default constructor.
      }

      public Son(String myName, int myAge, String level, String year) {
            this.educationalLevel = level;
            this.educationalYear = year;
      }

      public String getEducationalLevel() {
            return educationalLevel;
      }

      public void setEducationalLevel(String educationalLevel) {
            this.educationalLevel = educationalLevel;
      }

      public String getEducationalYear() {
            return educationalYear;
      }

      public void setEducationalYear(String educationalYear) {
            this.educationalYear = educationalYear;
      }

}
