/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package is_a;

/**

 @author EMAM
 */
public class NewClass {


          public static void main(String[] args) {
                    a a = new a();
                    b b = new b();
                    c c = new c();

          }

}

class c extends b {


          int cNum;

}

class b extends a {


          int bNum;

}

class a {


          int aNum ;

}
