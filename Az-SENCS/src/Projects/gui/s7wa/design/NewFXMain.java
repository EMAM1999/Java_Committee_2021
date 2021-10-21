package Projects.gui.s7wa.design;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**

 @author AsmaaTharwtAhmedFahm
 */
public class NewFXMain extends Application {

          static Stage stage;


          @Override
          public void start(Stage stage) throws IOException {

                    Parent root = FXMLLoader.load(getClass().getResource("Container.fxml"));

                    Scene scene = new Scene(root);

                    stage.setTitle("Fish Eat Fish!");
                    stage.setScene(scene);
                    stage.show();
          }


          public void switchStage(String name) throws IOException {
                    Parent root = FXMLLoader.load(getClass().getResource(name));
                    stage.setScene(new Scene(root));
          }


          /**
           @param args the command line arguments
           */
          public static void main(String[] args) {
                    launch(args);
          }

}
