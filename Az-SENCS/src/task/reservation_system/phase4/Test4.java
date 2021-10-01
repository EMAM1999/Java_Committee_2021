package task.reservation_system.phase4;
import java.util.Calendar;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test4 extends Application {

      private double width = 850;
      private double height = 550;

      private StackPane[] pages = new StackPane[4];
      private Button[] btns = new Button[4];

      private void switchPages(int index) {
            for ( StackPane page: pages ) {
                  page.setVisible(false);
            }
            pages[index].setVisible(true);
      }

      private Button createButton(String text, double width, double height, String id, EventHandler e) {
            Button btn = new Button(text);
            btn.setPrefSize(width, height);
            btn.setId(id);
            btn.setOnMouseReleased(e);
            btn.setFont(Font.font(20));
            return btn;
      }

      private void initButtons() {
            btns[0] = createButton("Add New Trip", 0.25 * width, 0.125 * height, "add", (e) -> {
                  switchPages(0);
            });
            btns[1] = createButton("Reserve New Seat", 0.25 * width, 0.125 * height, "reserve", (e) -> {
                  switchPages(1);
            });
            btns[2] = createButton("Display Passengers", 0.25 * width, 0.125 * height, "display", (e) -> {
                  switchPages(2);
            });
            btns[3] = createButton("Save Trips", 0.25 * width, 0.125 * height, "save", (e) -> {
                  switchPages(3);
            });
      }

      public Label createLabel(String text, double width, double height) {
            Label l = new Label(text);
            l.setPrefSize(width, height);
            l.setFont(Font.font(20));
            return l;
      }

      public TextField createTextField(String text, double width, double height) {
            TextField t = new TextField(text);
            t.setPrefSize(width, height);
            t.setFont(Font.font(20));
            return t;
      }

      private void initPage1() {
            Label num = createLabel("Trip Number", 130, 30);
            Label from = createLabel("From", 130, 30);
            Label to = createLabel("To", 130, 30);
            Label date = createLabel("Date", 130, 30);

            TextField numField = createTextField("", 250, 30);
            TextField fromField = createTextField("", 145, 30);
            TextField toField = createTextField("", 145, 30);

            ObservableList daysList = FXCollections.observableArrayList();
            for ( int i = 1; i < 32; i++ ) {
                  daysList.add(i);
            }
            ObservableList monthsList = FXCollections.observableArrayList();
            for ( int i = 1; i < 13; i++ ) {
                  monthsList.add(i);
            }
            ObservableList yearsList = FXCollections.observableArrayList();
            for ( int i = 2050; i >= 1950; i-- ) {
                  yearsList.add(i);
            }
            ComboBox<Integer> dayBox = new ComboBox<>(daysList);
            ComboBox<Integer> monthBox = new ComboBox<>(monthsList);
            ComboBox<Integer> yearBox = new ComboBox<>(yearsList);
            HBox dateField = new HBox(10, dayBox, monthBox, yearBox);

            Button add = createButton("Add", 100, 25, "", e -> {
                  int day = dayBox.getValue();
                  int month = monthBox.getValue();
                  int year = yearBox.getValue();
                  Calendar d = Calendar.getInstance();
                  d.set(year, month, day);
                  Trip newTrip = new Trip(numField.getText(), fromField.getText(), toField.getText(), d);
                  Data.trips.add(newTrip);

                  numField.clear();
                  fromField.clear();
                  toField.clear();
            });
            add.setDefaultButton(true);
            Button cancel = createButton("Cancel", 100, 25, "", e -> {
                  numField.clear();
                  fromField.clear();
                  toField.clear();
            });

            VBox texts = new VBox(45, num, from, to, date);
            texts.setAlignment(Pos.CENTER);
            VBox fields = new VBox(35, numField, fromField, toField, dateField);
            fields.setAlignment(Pos.CENTER);
            HBox dataEntery = new HBox(20, texts, fields);
            dataEntery.setAlignment(Pos.CENTER);
            HBox btns = new HBox(100, add, cancel);
            btns.setAlignment(Pos.CENTER);
            VBox all = new VBox(75, dataEntery, btns);
            all.setAlignment(Pos.CENTER);
            pages[0].getChildren().add(all);

      }

      private void initPage2() {
            ObservableList<String> tripList = FXCollections.observableArrayList();
            for ( Trip trip: Data.trips ) {
                  tripList.add(trip.getTripNumber());
            }
            ComboBox<String> tripBox = new ComboBox<>(tripList);
            pages[1].getChildren().add(tripBox);

      }

      private void initPage3() {
      }

      private void initPage4() {
      }

      private void initPages() {
            for ( int i = 0; i < pages.length; i++ ) {
                  pages[i] = new StackPane();
                  pages[i].setPrefSize(3. / 4 * width, height);
            }
            initPage1();
            initPage2();
            initPage3();
            initPage4();

            pages[1].setVisible(false);
            pages[2].setVisible(false);
            pages[3].setVisible(false);

      }

      @Override
      public void start(Stage stage) throws Exception {
            Data.readTripsFile("trips.txt");
            Data.readPassengersFile("passengers.txt");
            initPages();
            initButtons();

            VBox btns = new VBox(35, this.btns);
            btns.setAlignment(Pos.CENTER);

            StackPane control = new StackPane();
            control.getChildren().addAll(pages);

            HBox root = new HBox(10, btns, control);
            root.setPadding(new Insets(20));
            Scene scene = new Scene(root, width, height);
            stage.setScene(scene);
            stage.setTitle("A320 Flight Trip Reservation System");
            stage.show();
      }

      public static void main(String[] args) {
            launch(args);
      }

}
