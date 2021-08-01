/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.Z42F;

public class Father extends Person {

      private String nameOfWife;
      private int countOfsons;

      public Father() { //default constructor.
      }

      public Father(String myName, int myAge, String name, int sons) {
            super(myName, myAge);
            this.nameOfWife = name;
            this.countOfsons = sons;
      }

      public String getNameOfWife() {
            return nameOfWife;
      }

      public void setNameOfWife(String nameOfWife) {
            this.nameOfWife = nameOfWife;
      }

      public int getCountOfsons() {
            return countOfsons;
      }

      public void setCountOfsons(int countOfsons) {
            this.countOfsons = countOfsons;
      }

}
