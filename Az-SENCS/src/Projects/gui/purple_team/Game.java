/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.gui.purple_team;

/**

 @author Asmaa
 */
public class Game {

      enum Level {
            ROOKIE, PREMIUM, EXPERT, SUPER
      }
      private Level level;
      private boolean isPlayed;
      private int score = 0;
      private int total = 0;
      private static int highTotal;
      private static Level highLevel;
      private static int highScore;

      //opject of tinme class(minute of game , seconds)
      private time t = new time(3, 0);

      private Sea sea;
//      Sea Sea = new Sea();

      public void start() {
//            highLevel = readHighLevel();
//            highTotal = readHighTotal();
//            highScore = readHighScore();
            play();
      }

// to statrt game , it will be linked with button later :)
      public void play() {
            isPlayed = true;
            t.seTime();
            for ( OtherFish fish: sea.getFishes() ) {
                  fish.move();
            }
      }

      public void pause() {
            isPlayed = false;
            t.seTime();
            for ( OtherFish fish: sea.getFishes() ) {
                  fish.stop();
            }
      }

      public void eatFish(Fish fish) {
            total++;
            score++;
            if ( score < 50 ) {
                  level = Level.ROOKIE;
            } else if ( score < 100 ) {
                  level = Level.PREMIUM;
            } else if ( score < 150 ) {
                  level = Level.EXPERT;
            } else {
                  level = Level.SUPER;
            }
            sea.deleteFish(fish);
            sea.getMyFish().increaseSize();
      }


      /*we want to stop any moving,actions in Sea 
and show the total score you get it
       */
      public void stop() {
//            if ( score > highScore ) {
//                  saveScore(score);
//            }
//            if ( total > highTotal ) {
//                  saveTotal(total);
//            }
//            if ( level > highLevel ) {
//                  saveLevel(total);
//            }
            sea = null;
            t.stop();
      }

}
