/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package io_nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**

 @author EMAM
 */
public class ReadFromFiles {
//          FileReader
//          BufferedReader
//          FileInputStream
//          BufferedInputStream
//          DataInputStream
//          ObjectInputStream

          static String fileName = "myfiles\\123";


          public static void main(String[] args) throws IOException , ClassNotFoundException {
//                    FileReader fr = new FileReader("myfiles\\123.txt");
//                    char c;
//                    while ( (c = (char) fr.read()) != (char)-1 ) {
//                              System.out.println(c);
//                    }
//
//                    BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
//                    String line = "";
//                    while ( true ) {
//                              line = br.readLine();
//                              if ( line == null ) {
//                                        break;
//                              }
//                              System.out.println(line);
//                    }
//
//                    DataInputStream dis = new DataInputStream(new FileInputStream(fileName + ".dat"));
//                    for ( ;; ) {
//                              try {
//                                        System.out.print(dis.readInt());
//                                        System.out.print(dis.readInt());
//                                        System.out.print(dis.readUTF());
//                              } catch ( EOFException e ) {
//                                        break;
//                              }
//                    }
//
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myFiles\\student.dat"));
                    Object o = ois.readObject();
                    if ( o instanceof Student ) {
                              System.out.println((Student)o);
                    }
          }

}
