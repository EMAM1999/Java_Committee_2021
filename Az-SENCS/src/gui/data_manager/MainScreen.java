/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.data_manager;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**

 @author mohas
 */
public class MainScreen extends Application {

          @Override
          public void start(Stage primaryStage) throws IOException {
                    Button back = new Button("<<");
                    ComboBox<String> box = new ComboBox<>();
                    box.getItems().addAll("mohamed" , "Ahmed" , "Ali" , "Samir" , "Omar");
                    box.setEditable(true);

                    ObservableList list = FXCollections.observableArrayList();
                    list.addAll("mohamed" , "Ahmed" , "Ali" , "Samir" , "Omar");
                    ChoiceBox<String> cb = new ChoiceBox<>(list);
                    cb.setValue("mohamed");

                    Pane controlPane = new Pane(new HBox(100 , back , box , cb));

                    ImageView image = new ImageView(getClass().getResource("123.png").toExternalForm());
                    image.setTranslateX(50);
                    image.setTranslateY(50);
                    image.setFitHeight(180);
                    image.setFitWidth(180);

                    Text name = new Text(300 , 50 , "Mohamed");
                    Text age = new Text(300 , 100 , "22");
                    Text phone = new Text(300 , 150 , "0123456789");
                    Text email = new Text(300 , 200 , "Mohamed@gmail.com");

                    TextArea bio = new TextArea("blah blah");
                    bio.setPrefSize(600 , 200);
                    bio.setEditable(false);
                    bio.setTranslateX(50);
                    bio.setTranslateY(250);

                    Group g = new Group(name , age , phone , email , bio,image);
                    Pane detailsPane = new Pane(g);

                    VBox root = new VBox(controlPane , detailsPane);

                    Scene scene = new Scene(root , 700 , 500);

                    primaryStage.setResizable(false);
                    primaryStage.setTitle("Main Screen");
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
