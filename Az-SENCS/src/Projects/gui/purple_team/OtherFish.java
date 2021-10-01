/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.purple_team;

/**

 @author EMAM
 */
public class OtherFish extends Fish {

      private boolean isRight;

      public OtherFish(boolean _isRight, double _y, double _size) {
            super(_isRight ? Sea.width : 0, _y, _size);
            this.isRight = _isRight;
      }

      /**
       change the value of x from 0 to max vice versa
       */
      @Override
      public void move() {
            if ( isRight ) {
                  x--;
            } else {
                  x++;
            }
      }

      @Override
      public void stop() {
      }
      

}
