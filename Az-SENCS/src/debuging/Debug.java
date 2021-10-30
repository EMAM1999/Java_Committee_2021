/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package debuging;

/**

 @author EMAM
 */
public class Debug {

          public static void main(String[] args) {
                    myString string = new myString("Hello");
                    String s = string.addPrefex("Hello", " world");
                    System.out.println(s);
          }

}

class myString {

          private String myString;


          public myString(String line) {
                    this.myString = line;
          }


          public void addLine(String line) {
                    myString = line;
          }


          public String addPrefex(String myString , String pref) {
                    myString += pref;
                    return myString;
          }


          public static String toUpperCase(String myString) {
                    return myString.toUpperCase();
          }


          public char getFirstChar() {
                    return myString.charAt(1);
          }


          public String getMyString() {
                    return myString;
          }


          public void setMyString(String myString) {
                    myString = myString;
          }

}
