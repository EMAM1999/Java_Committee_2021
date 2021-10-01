package Projects.oop.M39M;

public class Library_Class {

      private Book books[];
      private Auther authers[];

      public Library_Class(int a, int b) {
            books = new Book[a];
            authers = new Auther[b];
      }

      public void add_auther(Auther a) {
            this.authers[Auther.getNumOfObject()] = a;
      }

      public void printAuther(int id) {
            if ( authers[id].isIsDeleted() == false ) {
                  System.out.println("The information of the Auther number " + id + " :");
                  System.out.println("Name : " + authers[id].getName());
                  System.out.println("Email : " + authers[id].getEmail());
                  System.out.println("phone : " + authers[id].getPhone());
            } else {
                  System.out.println("not founded");
            }
      }

      public void printAllAuthers() {
            System.out.println("The information of All Authers is :");
            for ( int i = 1; i <= Auther.getNumOfObject(); i++ ) {
                  if ( authers[i] != null && authers[i].isIsDeleted() == false ) {
                        System.out.println("* " + authers[i].getName() + "(id : " + authers[i].getId() + ")");
                  }
            }
      }

      public void printAutherBooks(int id) {
            System.out.println("The books of Auther " + authers[id].getName() + " is :");
            for ( int i = 0; i < Book.getNumberOfObject(); i++ ) {
                  if ( books[i].getA().id == id && books[i].isIsDeleted() == false ) {
                        System.out.println(books[i].getTitle());
                  }
            }
      }

      public void AddBook(Book b) {
            this.books[Book.getNumberOfObject()] = b;
      }

      public void PrintBook(int id) {
            if ( books[id].isIsDeleted() == false && books[id] != null ) {
                  System.out.println("The information of the Book number " + id + " :");
                  System.out.println("Title : " + books[id].getTitle());
                  System.out.println("Version : " + books[id].getVersion());
                  System.out.println("Name of Auther : " + books[id].getA().getName());
            } else {
                  System.out.println("this book not founded");
            }
      }

      public void remove_Auther(int id) {
            authers[id].setIsDeleted(true);
      }

      public void remove_Book(int id) {
            books[id].setIsDeleted(true);
      }

      public Auther getAuthers(int id) {
            return authers[id];
      }

}
