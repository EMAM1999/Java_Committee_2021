/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package has_A;

/**

 @author EMAM
 */
public class Laptop {


          private String compony;
          private int model;
          private double length;
          private double width;
          private String color;
          private processor p;



          public Laptop(String compony , int model , processor p) {
                    this(compony , model , 20 , 30 , "black" , p);
          }



          public Laptop(String compony , int model , double length , double weight , String color , processor p) {
                    setCompony(compony);
                    setModel(model);
                    setLength(length);
                    setWidth(width);
                    setColor(color);
                    setP(p);
          }



          public String getColor() {
                    return color;
          }



          public void setColor(String color) {
                    this.color = color;
          }



          public String getCompony() {
                    return compony;
          }



          public void setCompony(String compony) {
                    this.compony = compony;
          }



          public double getLength() {
                    return length;
          }



          public void setLength(double length) {
                    if ( length <= 0 ) {
                              System.out.println("error");
                    } else {
                              this.length = length;
                    }
          }



          public int getModel() {
                    return model;
          }



          public void setModel(int model) {
                    this.model = model;
          }



          public processor getP() {
                    return p;
          }



          public void setP(processor p) {
                    this.p = p;
          }



          public double getWidth() {
                    return width;
          }



          public void setWidth(double width) {
                    this.width = width;
          }

          public static class processor {


                    private String name;
                    private String type;
                    private double hertez;
                    private int cores;
                    private int threads;



                    public processor(String name , String type , double hertez , int cores) {
                              this.name = name;
                              this.type = type;
                              this.hertez = hertez;
                              this.cores = cores;
                              this.threads = 2 * cores;
                    }



                    public int getCores() {
                              return cores;
                    }



                    public void setCores(int cores) {
                              this.cores = cores;
                    }



                    public double getHertez() {
                              return hertez;
                    }



                    public void setHertez(double hertez) {
                              this.hertez = hertez;
                    }



                    public String getName() {
                              return name;
                    }



                    public void setName(String name) {
                              this.name = name;
                    }



                    public int getThreads() {
                              return threads;
                    }



                    public void setThreads(int threads) {
                              this.threads = threads;
                    }



                    public String getType() {
                              return type;
                    }



                    public void setType(String type) {
                              this.type = type;
                    }

          }

}
