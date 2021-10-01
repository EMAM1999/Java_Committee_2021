package Projects.oop.A38M;

public class Teacher extends Employee {

      private int NumberOfClassesHeTeaches; // classes Number 
      private double TeacherBonus;
      private double SalaryDeduction;
      private Gender s;

      public Teacher(int NumberOfClassesHeTeaches1, String Name1, int id1, int Address1, double PhoneNumber1, String Email1, double basicSalary1, double TeacherBouns1, double SalaryDeduction1) {
            super(Name1, id1, Address1, PhoneNumber1, Email1, basicSalary1);
            setNumberOfClassesHeTeaches(NumberOfClassesHeTeaches1);
            setTeacherBonus(TeacherBouns1);
            setSalaryDeduction(SalaryDeduction1);
      }

      public Teacher() {
      }

      public Teacher(Teacher c) { // copying constructor 
            Teacher p1 = new Teacher(c.NumberOfClassesHeTeaches, c.getName(), c.getId(), c.getAddress(), c.getPhoneNumber(), c.getEmail(), c.getBasicSalary(), c.TeacherBonus, c.SalaryDeduction);
      }

      public int getNumberOfClassesHeTeaches() {
            return NumberOfClassesHeTeaches;
      }

      public void setNumberOfClassesHeTeaches(int NumberOfClassesHeTeaches) {
            this.NumberOfClassesHeTeaches = NumberOfClassesHeTeaches;
      }

      public double getTeacherBonus() {
            return TeacherBonus;
      }

      public void setTeacherBonus(double TeacherBonus) {
            this.TeacherBonus = TeacherBonus;
      }

      public double getSalaryDeduction() {
            return SalaryDeduction;
      }

      public void setSalaryDeduction(double SalaryDeduction) {
            this.SalaryDeduction = SalaryDeduction;
      }

      public void setGender(Gender s) {
            this.s = s;
      }

      @Override
      public String toString() {
            String details = "The Teacher Name is " + getName() + "\n"
                    + "The Teacher Gender is " + s + "\n"
                    + "The Teacher id is " + getId() + "\n"
                    + "The Teacher Address is " + getAddress() + "\n"
                    + "The Teacher PhoneNumber is " + getPhoneNumber() + "\n"
                    + "The Teacher Email is " + getEmail() + "\n"
                    + "The Teacher basicSalary is " + getBasicSalary() + "\n"
                    + "The Teacher Bonus is " + TeacherBonus + "\n"
                    + "The Teacher Number Of Classes He Teaches is " + NumberOfClassesHeTeaches + "\n"
                    + "The Teacher SalaryDeduction  is " + SalaryDeduction + "\n"
                    + "The Teacher Salary is " + getSalary() + "\n";
            return details;
      }

      @Override
      public double getSalary() {
            return (getBasicSalary() + TeacherBonus - SalaryDeduction + (20 * NumberOfClassesHeTeaches) + getLiveExpensive());
      }

}
