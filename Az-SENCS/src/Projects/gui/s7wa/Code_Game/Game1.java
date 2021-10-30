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
public class Game1 {
    

    enum Level {
        ROOKIE, PREMIUM, EXPERT, SUPER
    }
    private static String level;
    private boolean isPlayed;
    private int score = 0;
    private int total = 0;
    private static Level highLevel;
    private static int highScore = 0;

    //opject of tinme class(minute of game , seconds)
    private time t = new time(3, 0);

    private sea sea;
    sea Sea = new sea();
    MyFish myFish = new MyFish();

    /*
we have to score numbers of fishes,
so when hero fish eat small fishes we will count it
     */
    public int Score() {
        if (Sea.Fishs.eat()) {
            System.out.println(score++);
        }
       return total = total + score;
    }
// to statrt game , it will be linked with button later :)

    public void play(boolean kay) {
        if (kay) {
            t.seTime();
            sea.sea();

            for (OtherFish fish : sea.getFishes()) {
                fish.move();
            }

        }
    }

    /*
    method to show what is the level of this player and it will be linked with total Score;
    
     */
    public void eatFish(Fish fish) {
        total++;
        score++;
        if (score < 50) {
            highLevel = Level.ROOKIE;
        } else if (score < 100) {
            highLevel = Level.PREMIUM;
        } else if (score < 150) {
            highLevel = Level.EXPERT;
        } else {
            highLevel = Level.SUPER;
        }
        sea.deleteFish(fish);
        sea.getMyFish().increaseSize();
    }


    /*we want to stop any moving,actions in sea 
and show the total score you get it
     */
    public void stop() {
        isPlayed = false;
        sea = null;
        t.stop();
        System.out.println("The total score of game is: " + total);
        if (highScore <= total) {
            highScore = total;
        }
        System.out.println("Wow!,HighScore you can get it: " + highScore);

    }

    public void pause() {
        isPlayed = false;
        t.seTime();
        for (OtherFish fish : sea.getFishes()) {
            fish.stop();
        }
    }

    public void move() {
        myFish.moveUp();
        myFish.moveLeft();
        myFish.moveRight();
        myFish.moveDown();
    }

    void finish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
