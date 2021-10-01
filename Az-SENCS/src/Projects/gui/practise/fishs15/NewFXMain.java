/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.practise.fishs15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**

 @author EMAM
 */
public class NewFXMain extends Application {

          private static final Fishs15 f = new Fishs15();


          public static Label createLabel(String text , double w , double h) {
                    Label l = new Label(text);
                    l.setId("l");
//                    l.setBackground(new Background(new BackgroundFill(Color.CADETBLUE , new CornerRadii(2) , Insets.EMPTY)));
                    l.setPrefSize(w , h);
                    l.setOnMouseClicked((e) -> {
                              l.setDisable(true);
                              pick(Integer.parseInt(l.getText()));
                              allCards.getChildren().remove(l);
                              int player = f.getPlayer();
                              if ( player > 0 ) {
                                        System.out.println("1");
                                        player1Cards.getChildren().add(l);
                                        ComboBox c = new ComboBox();
                              } else {
                                        System.out.println("2");
                                        player2Cards.getChildren().add(l);
                              }
                    });
                    return l;
          }
          static VBox player1Cards = new VBox(20);
          static VBox player2Cards = new VBox(20);
          static VBox allCards = new VBox(20);


          @Override
          public void start(Stage primaryStage) {
                    Label[] labels = new Label[] {
                              createLabel("1" , 100 , 50) ,
                              createLabel("2" , 100 , 50) ,
                              createLabel("3" , 100 , 50) ,
                              createLabel("4" , 100 , 50) ,
                              createLabel("5" , 100 , 50) ,
                              createLabel("6" , 100 , 50) ,
                              createLabel("7" , 100 , 50) ,
                              createLabel("8" , 100 , 50) ,
                              createLabel("9" , 100 , 50), };
                    allCards.getChildren().addAll(labels);

                    HBox all = new HBox(50);
                    all.setAlignment(Pos.CENTER);
                    all.getChildren().addAll(player1Cards , allCards , player2Cards);
                    StackPane root = new StackPane(all);
                    Scene scene = new Scene(root , 300 , 250);
                    scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                    primaryStage.setTitle("Hello World!");
                    primaryStage.setScene(scene);
                    primaryStage.show();
          }


          /**
           @param args the command line arguments
           */
          public static void main(String[] args) {
                    launch(args);
          }


          private static void pick(int num) {
                    Alert a = new Alert(AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("winner");
                    if ( f.pick(num) ) {
                              if ( f.getWinner() == 0 ) {
                                        a.setContentText("Draw");
                              } else if ( f.getWinner() > 0 ) {
                                        a.setContentText("Player 1");
                              } else {
                                        a.setContentText("Player 2");
                              }
                              a.showAndWait();
                    }
          }

}
