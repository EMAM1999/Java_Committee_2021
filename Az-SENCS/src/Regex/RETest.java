/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Regex;

import java.util.Scanner;

/**

 @author EMAM
 */
public class RETest {

          public static void main(String[] args) throws InterruptedException {
                    Scanner in = new Scanner(System.in);
//                    String regex = "^(\\+2){0,1}(01[0125])([0-9]{8})$";
//                    String str = "01234567899";
////                    System.out.println(str.matches(regex));
//                    Pattern pattern = Pattern.compile(regex);
//                    Matcher matcher = pattern.matcher(str);
//                    while ( matcher.find() ) {
//                              System.out.print(matcher.start() + " ");
//                              System.out.print(matcher.end() + "\n");
//                              System.out.println(matcher.group(0));
//                    }
                    String re = "\\b[iI]s\\b";
                    String str = " Is this jison ? Yes, He is. With his new wife isapel.<br>";
                    System.out.println(str.replaceAll(re , "isnot"));
          }

}

class Quantifiers {
//          a{3}
//          a{3,6}
//          a{3,}
/* ---------------------- */
//          a?
//          a+
//          a*
/* ---------------------- */
//          a+?
//          a*?
/* ---------------------- */
//          a++
//          a*+
}

class MetaSequences {
//          .
//          A|B
//          ^
//          $
/* ---------------------- */
//          \s      \S
//          \d      \D
//          \w      \W
//          \x..    \x{...}
/* ---------------------- */
//          \A      \Z        \z
//          \b      \B
//          \K
/* ---------------------- */
//          \#  ->   \number
//          \k<name>
}

class Groups {
//          Comment group (?#)
//          Capture every thing inclose (...)
//          Match every thing in close (?:...)
//          Named captured group (?<>...)
//          Conditional Statment (?|...)
//          Conditional Statment (...)?(?(1)yes|no)
/* ---------------------- */
//          Positive lookahead (?=...)
//          Negative lookahead (?!...)
//          Positive lookbehind (?<=...)
//          Negative lookbehind (?<!...)
/* ---------------------- */
//          Positive lookahead Condition (?(?=...)yes|no)
//          Negative lookahead (?!...)
//          Positive lookbehind (?<=...)
//          Negative lookbehind (?<!...)
/* ---------------------- */
//          Inline modifiers (?imsxu)
//          Localized inline modifiers (?imxsu:...)
}
