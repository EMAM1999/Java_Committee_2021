/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.purple_team;

/**

 @author EMAM
 */
public abstract class Fish {

      protected double x;
      protected double y;
      protected double size;

      public Fish(double _x, double _y, double _size) {
            this.x = _x;
            this.y = _y;
            this.size = _size;
      }

      public double getSize() {
            return size;
      }

      public double getX() {
            return x;
      }

      public double getY() {
            return y;
      }

      public void move() {
      }

      public void stop() {
      }
}
