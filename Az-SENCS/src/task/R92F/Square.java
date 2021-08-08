/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package task.R92F;

/**

 @author REHAM
 */
public class Square extends Shape2D {


          int LengthOfTheSide;



          public Square(int LengthOfTheSide) {
                    this.LengthOfTheSide = LengthOfTheSide;
                    super.Area = LengthOfTheSide * LengthOfTheSide;
                    super.circumfrance = LengthOfTheSide * 4;
          }



          public int getLengthOfTheSide() {
                    return LengthOfTheSide;
          }



          public void setLengthOfTheSide(int LengthOfTheSide) {
                    this.LengthOfTheSide = LengthOfTheSide;
          }



          @Override
          public void getShapeType() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }



          @Override
          public void paint() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

}
