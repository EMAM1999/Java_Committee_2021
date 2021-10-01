/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.data_manager;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class Register extends Application {

          @Override
          public void start(Stage primaryStage) {
                    Text fnText = new Text("first name");
                    TextField fnField = new TextField();

                    Text lnText = new Text("last name");
                    TextField lnField = new TextField();

                    Text genderText = new Text("Gender");
                    RadioButton maleBtn = new RadioButton("male");
                    maleBtn.setSelected(true);
                    RadioButton femaleBtn = new RadioButton("female");

                    ToggleGroup toggleGroup = new ToggleGroup();
                    toggleGroup.getToggles().add(maleBtn);
                    toggleGroup.getToggles().add(femaleBtn);

                    Text birthdayText = new Text("birthday");
                    DatePicker date = new DatePicker();

                    Text unText = new Text("username");
                    TextField unField = new TextField();

                    Text passText = new Text("password");
                    PasswordField passField = new PasswordField();
                    Text conPassText = new Text("confirm");
                    PasswordField conPassField = new PasswordField();

                    Button cancel = new Button("Cancel");
                    Button ok = new Button("OK");

                    GridPane root = new GridPane();
                    root.setAlignment(Pos.CENTER);
                    root.setHgap(20);
                    root.setVgap(20);
                    root.addRow(0 , fnText , fnField);
                    root.addRow(1 , lnText , lnField);
                    root.addRow(2 , genderText , new HBox(30 , maleBtn , femaleBtn));
                    root.addRow(3 , birthdayText , date);
                    root.addRow(4 , unText , unField);
                    root.addRow(5 , passText , passField);
                    root.addRow(6 , conPassText , conPassField);
                    root.addRow(7 , ok , cancel);

                    Scene scene = new Scene(root , 400 , 550);

                    primaryStage.setResizable(false);
                    primaryStage.setTitle("Registration");
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
