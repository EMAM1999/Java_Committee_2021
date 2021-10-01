/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.weights_reading;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**

 @author EMAM
 */
public class NewClass {

      public static double[] list;

      public static double convertPoundToKG(double w) {
            return (int)((w * 0.45359237) * 100) / 100.;
      }

      public static void readFile(String fileName) throws FileNotFoundException {
            Scanner in = new Scanner(new File(fileName));
            int size = 0;
            while ( in.hasNextLine() ) {
                  in.nextLine();
                  size++;
            }
            list = new double[size];
            in = new Scanner(new File(fileName));
            for ( int index = 0; in.hasNextLine(); index++ ) {
                  String line = in.nextLine();
                  double w = Double.parseDouble(line);
                  w = convertPoundToKG(w);
                  list[index] = w;
            }
      }

      public static void main(String[] args) throws IOException {
//            FileWriter f = new FileWriter(new File("weights.txt"));
//            for ( int i = 0; i < 20; i++ ) {
//                  double w = (int)((Math.random()*200+100)*100)/100.;
//                  f.write(w+"\n");
//            }
//            f.close();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of the file :: ");
            String fileName = in.next();
            try {
                  readFile(fileName);
            } catch ( FileNotFoundException ex ) {
                  System.out.println("The file is not exist");
                  System.exit(0);
            }
            String c = "";
            do {
                  displayMenu();
                  c = takeChoise();
                  switch ( c ) {
                        case "P":
                        case "p": displayArray(list);
                              break;
                        case "D":
                        case "d":
                              double[] copy = copyList(list);
                              copy = sort(copy);
                              displayArray(copy);
                              break;
                        case "S":
                        case "s":
                              System.out.println("Enter the weight :: ");
                              double weight = in.nextDouble();
                              boolean founded = search(weight, list);
                              System.out.println(founded ? "Found" : "Not Found");
                              break;
                        case "Q":
                        case "q":
                              break;
                        default:
                              displayError();
                  }
            } while ( !c.equalsIgnoreCase("Q") );
      }

      private static double[] copyList(double[] _list) {
            double[] copy = new double[_list.length];
            for ( int i = 0; i < _list.length; i++ ) {
                  copy[i] = _list[i];
            }
            return copy;
      }

      private static void displayArray(double[] _list) {
//            System.out.println(_list);
            for ( double ele: _list ) {
                  System.out.println(ele);
            }
      }

      private static void displayError() {
            System.out.println("Wrong Input !!");
      }

      private static void displayMenu() {
            System.out.println("==============");
            System.out.println("P. print the file\n"
                    + "D. display sorted list\n"
                    + "S. search\n"
                    + "Q. quit");
            System.out.println("==============");
      }

      private static boolean search(double _weight, double[] _list) {
            for ( double ele: _list ) {
                  if ( ele == _weight ) {
                        return true;
                  }
            }
            return false;
      }

      /*
      array.length - 1 -0
      array.length - 1 -1
      array.length - 1 -2
      array.length - 1 -3
       */
      private static double[] sort(double[] array) {
            for ( int i = 0; i < array.length; i++ ) {
                  for ( int j = 0; j < array.length - 1 - i; j++ ) {
                        if ( array[j] > array[j + 1] ) {
                              double tem = array[j];
                              array[j] = array[j + 1];
                              array[j + 1] = tem;
                        }
                  }
            }
            return array;
      }

      private static String takeChoise() {
            Scanner in = new Scanner(System.in);
            System.out.println("Take a choice :: ");
            return in.next();
      }
}
