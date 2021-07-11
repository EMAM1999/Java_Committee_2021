/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package interfaces;

/**

 @author EMAM
 */
public interface Paint {


          int c = 0;



          public void paint();

}

interface movable {


          public void move();

}

interface flyable extends movable {


          public void fly();

}

interface walkable extends movable {


          public void walk();

}

interface runnable extends movable {


          public void run();

}

interface talkable extends movable , sound {


          public void talk();

}

interface sound {


          public void sound();

}

interface remoteController {


          int w = 5;
          int h = 20;



          public void volumeUp();



          public void volumeDown();

}
