/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Regex;

/**

 @author EMAM
 */
public class RETasks {

          /**
           (+2)01234567899
           */
          public static final String PHONE_NUMBER = "(\\+2)?01[0125]\\d{8}";
          /**
           29912301010101
           */
          public static final String NID = "(?<year>(?|2\\d\\d|3[01]\\d|32[01]))(?<month>0[1-9]|1[0-2])(?<day>0[1-9]|[12]\\d|3[01])(\\d{7})";
          /**
           15/10/2021<br>
           15-10-2021
           */
          public static final String DATE = "";
          /**
           <table>
           *****<thead>
           **********<tr><th style="text-align:left">12</th>     <th style="text-align:left">24</th>           </tr>
           *****</thead>
           *****<tbody>
           **********<tr<td>02:25:10 AM</td>      <td>15:30:10</td>           </tr>
           **********<tr<td>12:05 AM</td>      <td>00:25</td>           </tr>
           *****</tbody>
           </table>
           */
          public static final String TIME = "";
          /**
           4 Numbers password
           */
          public static final String SIMPLE_PASSWORD_1 = "\\d{4}";
          /**
           8 to 20 Numbers password
           */
          public static final String SIMPLE_PASSWORD_2 = "\\d{8,20}";
          /**
           8 to 20 Numbers-letters password (ASCII)
           */
          public static final String SIMPLE_PASSWORD_3 = "\\w{8,20}";
          /**
           8 to 20 Numbers-characters password
           */
          public static final String SIMPLE_PASSWORD_4 = "[\\w]{8,20}";
          /**
           8 to 20 Numbers-at least one character- password
           */
          public static final String HARD_PASSWORD = "";
          /**
           8 to 20 -at least <strong>one small letter</strong>, <strong>one capital letter</strong> and <strong>one number</strong>- password
           */
          public static final String COMPLEX_PASSWORD = "";
          /**
           <p style="font:bold 12px">input:</p>
           Is this jison ?<br>
           Yes, He is. With his new wife isapel.<br>
           <p style="font:bold 12px">output:</p>
           Isnot this jison ?<br>
           Yes, He isnot. With his new wife isapel.<br>
           */
          public static final String IS_TO_ISNOT = "";

}
