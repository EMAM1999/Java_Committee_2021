/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package gui.birthday_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 FXML Controller class

 @author mohas
 */
public class FXMLController implements Initializable {

          @FXML
          private Button btn;

          @FXML
          private Label year;

          @FXML
          private Label month;

          @FXML
          private Label day;

          @FXML
          private Label dayOfWeek;

          @FXML
          private DatePicker date;


          @FXML
          void calculateAge(ActionEvent event) {
                    CalculateAge.calculate();
                    year.setText("22");
                    month.setText("8");
                    day.setText("9");
                    dayOfWeek.setText("monday");
          }


          /**
           Initializes the controller class.

           @param url
           @param rb
           */
          @Override
          public void initialize(URL url , ResourceBundle rb) {
                    // TODO
          }

}
