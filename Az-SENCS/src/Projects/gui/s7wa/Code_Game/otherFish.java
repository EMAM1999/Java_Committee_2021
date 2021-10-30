/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code_Game;

/**
 *
 * @author AsmaaTharwtAhmedFahm
 */
class otherFish {
    

    Game1 game = new Game1();
    sea sea = new sea();

    public otherFish(int x, int y) {
        super(x = (int) (Math.random() * (200) + 1), y = (int) (Math.random() * (500) + 1));
    }

    public void size() {

    }

    public void moveUp() {
        if (y == sea.getHight()) {
            hide();
        } else {
            y++;
        }

    }

    public void moveDown() {
        if (y < 0) {
            hide();
        } else {
            y--;
        }

    }

    public void moveRight() {
        if (x == sea.getWidth()) {
            stop();
        } else {
            x++;
        }

    }

    public void moveLeft() {
        if (x < 0) {
            stop();
        } else {
            x--;
        }

    }

}
