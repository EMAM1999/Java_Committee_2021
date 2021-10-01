/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.data_manager;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**

 @author mohas
 */
public class Login extends Application {

          @Override
          public void start(Stage primaryStage) throws Exception {
                    Label userNameLabel = new Label("username");
                    TextField userNameField = new TextField();
                    userNameField.setPromptText("Enter username : ");
                    userNameField.setTooltip(new Tooltip("username"));
                    HBox userNameBox = new HBox(20 , userNameLabel , userNameField);
                    userNameBox.setAlignment(Pos.CENTER);

                    Label passwordLabel = new Label("password");
                    PasswordField passwordField = new PasswordField();
                    HBox passwordBox = new HBox(20 , passwordLabel , passwordField);
                    passwordBox.setAlignment(Pos.CENTER);

                    Button login = new Button("login");
                    Button register = new Button("register");
                    HBox btnsBox = new HBox(50 , login , register);
                    btnsBox.setAlignment(Pos.CENTER);

                    VBox root = new VBox(50 , userNameBox , passwordBox , btnsBox);
                    root.setAlignment(Pos.CENTER);
                    Scene scene = new Scene(root , 500 , 300);
                    primaryStage.setResizable(false);
                    primaryStage.setTitle("Login");
                    primaryStage.setScene(scene);
                    primaryStage.show();
          }


          public static void main(String[] args) {
                    launch(args);
          }

}
