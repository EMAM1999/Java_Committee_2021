/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.purple_team;

/**

 @author EMAM
 */
public class MyFish extends Fish {

      public MyFish(double _x, double _y, double _size) {
            super(_x, _y, _size);
      }

      public void increaseSize() {
            super.size++;
      }

      @Override
      public void move() {
      }

      public void moveUp() {
            y--;
      }

      public void moveDown() {
            y++;
      }

      public void moveRight() {
            x++;
      }

      public void moveLeft() {
            x--;
      }
      
}
