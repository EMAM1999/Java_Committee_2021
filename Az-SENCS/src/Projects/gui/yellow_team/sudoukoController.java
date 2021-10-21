/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.gui.yellow_team;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

/**

 @author EMAM
 */
public class sudoukoController implements Initializable {

          @FXML
          private Label l00;
          @FXML
          private Label l01;
          @FXML
          private Label l02;
          @FXML
          private Label l03;
          @FXML
          private Label l04;
          @FXML
          private Label l05;
          @FXML
          private Label l06;
          @FXML
          private Label l07;
          @FXML
          private Label l08;
          @FXML
          private Label l10;
          @FXML
          private Label l11;
          @FXML
          private Label l12;
          @FXML
          private Label l13;
          @FXML
          private Label l14;
          @FXML
          private Label l15;
          @FXML
          private Label l16;
          @FXML
          private Label l17;
          @FXML
          private Label l18;
          @FXML
          private Label l20;
          @FXML
          private Label l21;
          @FXML
          private Label l22;
          @FXML
          private Label l23;
          @FXML
          private Label l24;
          @FXML
          private Label l25;
          @FXML
          private Label l26;
          @FXML
          private Label l27;
          @FXML
          private Label l28;
          @FXML
          private Label l30;
          @FXML
          private Label l31;
          @FXML
          private Label l32;
          @FXML
          private Label l33;
          @FXML
          private Label l34;
          @FXML
          private Label l35;
          @FXML
          private Label l36;
          @FXML
          private Label l37;
          @FXML
          private Label l38;
          @FXML
          private Label l40;
          @FXML
          private Label l41;
          @FXML
          private Label l42;
          @FXML
          private Label l43;
          @FXML
          private Label l44;
          @FXML
          private Label l45;
          @FXML
          private Label l46;
          @FXML
          private Label l47;
          @FXML
          private Label l48;
          @FXML
          private Label l50;
          @FXML
          private Label l51;
          @FXML
          private Label l52;
          @FXML
          private Label l53;
          @FXML
          private Label l54;
          @FXML
          private Label l55;
          @FXML
          private Label l56;
          @FXML
          private Label l57;
          @FXML
          private Label l58;
          @FXML
          private Label l60;
          @FXML
          private Label l61;
          @FXML
          private Label l62;
          @FXML
          private Label l63;
          @FXML
          private Label l64;
          @FXML
          private Label l65;
          @FXML
          private Label l66;
          @FXML
          private Label l67;
          @FXML
          private Label l68;
          @FXML
          private Label l70;
          @FXML
          private Label l71;
          @FXML
          private Label l72;
          @FXML
          private Label l73;
          @FXML
          private Label l74;
          @FXML
          private Label l75;
          @FXML
          private Label l76;
          @FXML
          private Label l77;
          @FXML
          private Label l78;
          @FXML
          private Label l80;
          @FXML
          private Label l81;
          @FXML
          private Label l82;
          @FXML
          private Label l83;
          @FXML
          private Label l84;
          @FXML
          private Label l85;
          @FXML
          private Label l86;
          @FXML
          private Label l87;
          @FXML
          private Label l88;


          @Override
          public void initialize(URL url , ResourceBundle rb) {
                    Label[][] board = new Label[][] {
                              { l00 , l01 , l02 , l03 , l04 , l05 , l06 , l07 , l08 } ,
                              { l10 , l11 , l12 , l13 , l14 , l15 , l16 , l17 , l18 } ,
                              { l20 , l21 , l22 , l23 , l24 , l25 , l26 , l27 , l28 } ,
                              { l30 , l31 , l32 , l33 , l34 , l35 , l36 , l37 , l38 } ,
                              { l40 , l41 , l42 , l43 , l44 , l45 , l46 , l47 , l48 } ,
                              { l50 , l51 , l52 , l53 , l54 , l55 , l56 , l57 , l58 } ,
                              { l60 , l61 , l62 , l63 , l64 , l65 , l66 , l67 , l68 } ,
                              { l70 , l71 , l72 , l73 , l74 , l75 , l76 , l77 , l78 } ,
                              { l80 , l81 , l82 , l83 , l84 , l85 , l86 , l87 , l88 } };
                    Sudoku s = new Sudoku(Level.EASY);
                    int[][] b = s.getUnSolvedBoard();
                    for ( int i = 0 ; i < board.length ; i++ ) {
                              for ( int j = 0 ; j < board[i].length ; j++ ) {
                                        board[i][j].setText(b[i][j] == 0 ? "" : "" + b[i][j]);
                              }

                    }

          }


          @FXML
          void entered(MouseEvent event) {
//                    ((Label) event.getSource()).setBackground(new Background(new BackgroundFill(Color.web("#123654") , CornerRadii.EMPTY , Insets.EMPTY)));
          }


          @FXML
          void exited(MouseEvent event) {
//                    ((Label) event.getSource()).setBackground(null);
          }
          @FXML
          void clicked(MouseEvent event) {
                    Label l = ( (Label) event.getSource() );
                    l.setBackground(new Background(new BackgroundFill(Color.web("#123654") , CornerRadii.EMPTY , Insets.EMPTY)));
                    l.setTextFill(Color.WHITE);
                    thisLabel = l;
          }
          Label thisLabel;


          @FXML
          void write(ActionEvent event) {
                    if ( thisLabel != null ) {
                              String s = ((Button) event.getSource()).getText();
                              thisLabel.setText(s);
                    }
          }

}
