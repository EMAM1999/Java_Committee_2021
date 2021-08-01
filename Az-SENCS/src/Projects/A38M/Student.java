package Projects.A38M;

public class Student {

      private int StudentId;
      private String StudentName;
      private int StudentLevel;

      public Student(int StudentId1, String StudentName1, int StudentLevel1) {
            setStudentId(StudentId1);
            setStudentName(StudentName1);
            setStudentLevel(StudentLevel1);
      }

      public Student() {
      }

      public Student(Student d) {
            this(d.StudentId, d.StudentName, d.StudentLevel);
      }

      public int getStudentId() {
            return StudentId;
      }

      public void setStudentId(int StudentId) {
            this.StudentId = StudentId;
      }

      public String getStudentName() {
            return StudentName;
      }

      public void setStudentName(String StudentName) {
            this.StudentName = StudentName.trim();
      }

      public int getStudentLevel() {
            return StudentLevel;
      }

      public void setStudentLevel(int StudentLevel) {
            this.StudentLevel = StudentLevel;
      }

      @Override
      public String toString() {
            String details = "The StudentName is " + StudentName + "\n"
                    + "The StudentId is " + StudentId + "\n"
                    + "The StudentLevel is " + StudentLevel + "\n";
            return details;
      }
}
