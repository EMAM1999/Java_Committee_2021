package Projects.oop.M39M;
import java.util.Scanner;

public class Library {

      public static void main(String[] args) { // score = 90%
            Scanner x = new Scanner(System.in);
            System.out.println("Enter max number of Books and Auther may You add");
            int a = x.nextInt();
            int b = x.nextInt();
            Library_Class L1 = new Library_Class(b, a);
            boolean cont = true;
            while ( cont ) {
                  //choose the operation
                  System.out.println("If you want to add new auther press 1");
                  System.out.println("If you want to add new Book press 2");
                  System.out.println("If you want to print auther information press 3");
                  System.out.println("If you want to print Book information press 4");
                  System.out.println("If you want to Exit press 0");
                  int choose = x.nextInt();
                  switch ( choose ) {
                        case 1:
                              System.out.println("enter the name of Auther");
                              String name = x.next();
                              System.out.println("enter the phone number of Auther");
                              String phone = x.next();
                              System.out.println("enter the email of Auther");
                              String email = x.next();
                              Auther newAuther = new Auther(name, phone, email);
                              L1.add_auther(newAuther);
                              break;
                        case 2:
                              System.out.println("the exist authers is :");
                              L1.printAllAuthers();
                              System.out.println("Enter id of Auther");
                              int id = x.nextInt();
                              Auther auther = L1.getAuthers(id);
                              System.out.println("enter the title of the book");
                              String title = x.next();
                              System.out.println("enter the version of the book");
                              int version = x.nextInt();
                              Book book = new Book(title, version, auther);
                              L1.AddBook(book);
                              break;
                        case 3:
                              System.out.println("enter the id of Auther that you want");
                              int id2 = x.nextInt();
                              L1.printAuther(id2);
                              break;
                        case 4:
                              System.out.println("enter the id of Book that you want");
                              int id3 = x.nextInt();
                              L1.PrintBook(id3);
                              break;
                        case 0:
                              cont = false;
                              break;

                  }

            }

      }

}
