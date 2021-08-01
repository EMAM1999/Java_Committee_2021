package Projects.A38M;

import java.util.ArrayList;

public class Subject {

      private String SubjectName;
      Teacher teacher;
      ArrayList<Student> student;

      public Subject() {
      }

      public Subject(String SubjectName) {
            setSubjectName(SubjectName.toLowerCase().trim());
      }

      public String getSubjectName() {
            return SubjectName;
      }

      public void setSubjectName(String SubjectName) {
            this.SubjectName = SubjectName.toLowerCase().trim();
      }

      public Teacher getT1() {
            return teacher;
      }

      public void setT1(Teacher teacher) {
            this.teacher = teacher;
      }

      public ArrayList<Student> getS1() {
            return student;
      }

      public void setStudent(ArrayList<Student> student) {
            student = new ArrayList<Student>(student.size());
            this.student = student;
      }

      @Override
      public String toString() {
            String details = "The SubjectName is " + SubjectName + "\n"
                    + teacher.toString()
                    + student.toString();
            return details;
      }
}
