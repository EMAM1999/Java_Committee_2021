package Projects.A38M;

public class Principal extends Employee {

      private double PrincipalBonus;
      private Gender s;

      public Principal(double PrincipalBonus1, String Name1, int id1, int Address1, double PhoneNumber1, String Email1, double basicSalary1) {
            super(Name1, id1, Address1, PhoneNumber1, Email1, basicSalary1);
            setPrincipalBonus(PrincipalBonus1);
      }

      public Principal() {
      }

      public Principal(Principal c) { // copying constructor 
            Principal p1 = new Principal(c.PrincipalBonus, c.getName(), c.getId(), c.getAddress(), c.getPhoneNumber(), c.getEmail(), c.getBasicSalary());
      }

      public void setPrincipalBonus(double PrincipalBonus) {
            this.PrincipalBonus = PrincipalBonus;
      }

      public double getPrincipalBonus() {
            return PrincipalBonus;
      }

      public Gender getGender() {
            return s;
      }

      public void setGender(Gender s) {
            this.s = s;
      }

      @Override
      public String toString() {
            String details = "The Principal Name is " + getName() + "\n"
                    + "The Principal Gender is " + s + "\n"
                    + "The Principal id is " + getId() + "\n"
                    + "The Principal Address is " + getAddress() + "\n"
                    + "The Principal PhoneNumber is " + getPhoneNumber() + "\n"
                    + "The Principal Email is " + getEmail() + "\n"
                    + "The Principal basicSalary is " + getBasicSalary() + "\n"
                    + "The Principal Bonus is " + PrincipalBonus + "\n"
                    + "The Principal Salary is " + getSalary() + "\n";
            return details;
      }

      @Override
      public double getSalary() {
            return (getBasicSalary() + PrincipalBonus + getLiveExpensive());
      }
}
