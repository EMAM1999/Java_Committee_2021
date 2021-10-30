/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JXML_Game;

import Code_Game.time;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author AsmaaTharwtAhmedFahm
 */
public class JXml_main extends Application {
Stage stage;
time time;
    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Main_page.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       

    }
//public void switchScenes(String url) throws IOException{
//    Parent root = FXMLLoader.load(getClass().getResource(url));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//}
    public static void main(String[] args) {
        launch(args);
    }

}
