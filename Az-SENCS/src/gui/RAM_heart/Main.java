/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.RAM_heart;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**

 @author mohas
 */
public class Main extends Application {

          @Override
          public void start(Stage stage) {
                    Heart myHeart = new Heart(100 , 0.1 , 60);
                    myHeart.beat();
                    OperatingSystemMXBean OS = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

                    new Thread(() -> {
                              while ( stage.isShowing() ) {
                                        double totalMemory = OS.getTotalPhysicalMemorySize();
                                        double freeMemory = OS.getFreePhysicalMemorySize();
                                        double ratio = freeMemory / totalMemory;
                                        myHeart.setRate(ratio * 100);
                              }
                    }).start();

                    StackPane root = new StackPane(myHeart);
                    Scene scene = new Scene(root , 300 , 250);
//                    scene.setFill(Color.TRANSPARENT);
//                    Stage stage = new Stage(StageStyle.TRANSPARENT);
                    stage.setTitle("Hello World!");
                    stage.setScene(scene);
                    stage.show();
          }


          /**
           @param args the command line arguments
           */
          public static void main(String[] args) {
                    launch(args);
          }

}
