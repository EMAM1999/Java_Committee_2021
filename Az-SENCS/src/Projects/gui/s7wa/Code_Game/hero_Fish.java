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
public class hero_Fish {
    
    Game1 game =new Game1();
otherFish fish=new otherFish();
    sea sea = new sea();

    public hero_Fish(int x, int y) {
        super(x = 250, y = 100);
        size=30;
    }
    public void size()
    {
        if(eatFish(fish))
        {
           size++; 
        }
        else
        {
            game.finish();
        }
    }

    public void moveUp() {
        if (y == sea.getHight()) {
            stop();
        } else {
            y++;
        }

    }

    public void moveDown() {
        if (y == 0) {
            stop();
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
        if (x == 0) {
            stop();
        } else {
            x--;
        }
    }

    public boolean eatFish(otherFish fish) {
return size>=fish.size();
    }

}
