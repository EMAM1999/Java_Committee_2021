/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.calculator;

import calculator.Calculator;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class Main extends Application {

          Button[] buttons = new Button[20];
// 0-9 +, -, *, /, =


          public Button creatButton(String text , String id , double w , double h , double x , double y) {
                    Button btn = new Button(text);
                    btn.setId(id);
                    btn.setPrefSize(w , h);
                    btn.setTranslateX(x);
                    btn.setTranslateY(y);
                    
                    btn.setOnMousePressed((e) -> {
                              String s = inputField.getText();
                              inputField.setText(s + text);
                    });
                    return btn;
          }

          Label inputField = new Label("");


          @Override
          public void start(Stage primaryStage) {
                    inputField.setPrefSize(400 , 100);
                    inputField.setTranslateX(50);
                    Object[][] data = {
                              { "=" , "equal" , 100 , 50 , 250 , 350 } ,
                              { "C" , "ClearButton" , 100 , 50 , 250 , 150 } ,
                              { "<<" , "<<" , 100 , 50 , 350 , 150 } ,
                              { "(" , "(" , 100 , 50 , 50 , 150 } ,
                              { ")" , ")" , 100 , 50 , 150 , 150 } ,
                              { "7" , "7" , 100 , 50 , 50 , 200 } ,
                              { "8" , "8" , 100 , 50 , 150 , 200 } ,
                              { "9" , "9" , 100 , 50 , 250 , 200 } ,
                              { "/" , "/" , 100 , 50 , 350 , 200 } ,
                              { "4" , "4" , 100 , 50 , 50 , 250 } ,
                              { "5" , "5" , 100 , 50 , 150 , 250 } ,
                              { "6" , "6" , 100 , 50 , 250 , 250 } ,
                              { "*" , "*" , 100 , 50 , 350 , 250 } ,
                              { "1" , "1" , 100 , 50 , 50 , 300 } ,
                              { "2" , "2" , 100 , 50 , 150 , 300 } ,
                              { "3" , "3" , 100 , 50 , 250 , 300 } ,
                              { "-" , "-" , 100 , 50 , 350 , 300 } ,
                              { "." , "." , 100 , 50 , 50 , 350 } ,
                              { "0" , "0" , 100 , 50 , 150 , 350 } ,
                              { "+" , "+" , 100 , 50 , 350 , 350 }, };

                    for ( int i = 0 ; i < data.length ; i++ ) {
                              buttons[i] = creatButton(
                                      data[i][0].toString() ,
                                      data[i][1].toString() ,
                                      Double.parseDouble(data[i][2].toString()) ,
                                      Double.parseDouble(data[i][3].toString()) ,
                                      Double.parseDouble(data[i][4].toString()) ,
                                      Double.parseDouble(data[i][5].toString()));
                    }
                    buttons[0].setOnMousePressed((e) -> {
                              double res = Calculator.calculate(inputField.getText());
                              inputField.setText(res+"");
                    });
                    buttons[1].setOnMousePressed((e) -> {
                              inputField.setText("");
                    });
                    buttons[2].setOnMousePressed((e) -> {
                              String s = inputField.getText();
                              s = s.substring(0 , s.length() - 1);
                              inputField.setText(s);
                    });

                    Group root = new Group(buttons);
                    root.getChildren().add(inputField);
                    Scene scene = new Scene(root , 500 , 450);
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

}
