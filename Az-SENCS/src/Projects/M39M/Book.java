package Projects.M39M;

public class Book {

      private static int NumberOfObject = 0;
      final int id;
      private String title;
      private int version;
      private Auther a;
      private boolean isDeleted;

      public Book(String title, int version, Auther a) {
            NumberOfObject++;
            isDeleted = false;
            this.id = NumberOfObject;
            this.title = title;
            this.version = version;
            this.a = a;

      }

      public boolean isIsDeleted() {
            return isDeleted;
      }

      public void setIsDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
      }

      public int getId() {
            return id;
      }

      public Auther getA() {
            return a;
      }

      public String getTitle() {
            return title;
      }

      public int getVersion() {
            return version;
      }

      public void setA(Auther a) {
            this.a = a;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public void setVersion(int version) {
            this.version = version;
      }

      public static int getNumberOfObject() {
            return NumberOfObject;
      }

}
