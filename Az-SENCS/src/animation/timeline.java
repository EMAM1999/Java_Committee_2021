/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package animation;

import javafx.animation.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.util.*;

/**

 @author EMAM
 */
public class timeline extends Application {

          @Override
          public void start(Stage stage) throws Exception {
                    Label[] labels = {
                              makeLabel("1" , 50 , 50 , Color.ANTIQUEWHITE) ,
                              makeLabel("2" , 50 , 50 , Color.ANTIQUEWHITE) ,
                              makeLabel("3" , 50 , 50 , Color.ANTIQUEWHITE) ,
                              makeLabel("4" , 50 , 50 , Color.ANTIQUEWHITE) ,
                              makeLabel("5" , 50 , 50 , Color.ANTIQUEWHITE) ,
                              makeLabel("6" , 50 , 50 , Color.ANTIQUEWHITE), };
                    HBox box = new HBox(20 , labels);
                    box.setAlignment(Pos.CENTER);
                    StackPane root = new StackPane(box);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setMaximized(true);
                    stage.show();
          }


          public static void main(String[] args) {
                    launch(args);
          }


          private Label makeLabel(String title , double w , double h , Color color) {
                    Label l = new Label(title);
                    l.setAlignment(Pos.CENTER);
                    l.setBorder(new Border(new BorderStroke(Color.BLACK , BorderStrokeStyle.SOLID , new CornerRadii(20) , new BorderWidths(2))));
                    l.setPrefSize(w , h);
                    l.setBackground(new Background(new BackgroundFill(color , CornerRadii.EMPTY , Insets.EMPTY)));
                    l.setCursor(Cursor.HAND);
                    l.setOnMouseEntered((e) -> {
                              new Timeline(
                                      new KeyFrame(Duration.seconds(1) ,
//                                              new KeyValue(l.prefHeightProperty() , h * 2) ,
//                                              new KeyValue(l.prefWidthProperty() , w * 2) ,
//                                              new KeyValue(l.backgroundProperty() , new Background(new BackgroundFill(Color.YELLOW , CornerRadii.EMPTY , Insets.EMPTY)))
                                              ($)->{
                                                        l.setPrefSize(w*2, h*2);
                                              }
                                      )
                              ).play();
                    });
                    l.setOnMouseExited((e) -> {
                              new Timeline(
                                      new KeyFrame(Duration.seconds(1) ,
                                              new KeyValue(l.prefHeightProperty() , h) ,
                                              new KeyValue(l.prefWidthProperty() , w) ,
                                              new KeyValue(l.backgroundProperty() , new Background(new BackgroundFill(color , CornerRadii.EMPTY , Insets.EMPTY)))
                                      )).play();
                    });
                    return l;
          }

}
