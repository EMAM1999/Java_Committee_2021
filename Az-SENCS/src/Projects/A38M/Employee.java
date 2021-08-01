package Projects.A38M;

enum Gender {
    Male, Female
};

public abstract class Employee {

    private String Name;
    private int id;
    private int Address;
    private double PhoneNumber;
    private String Email;
    private double basicSalary;
    private double liveExpensive;

    public Employee(String Name1, int id1, int Address1, double PhoneNumber1, String Email1, double basicSalary1) {
        setName(Name1);
        setId(id1);
        setAddress(Address1);
        setPhoneNumber(PhoneNumber1);
        setEmail(Email1);
        setBasicSalary(basicSalary1);
        liveExpensive = (10 / 100) * basicSalary;
    }

    public Employee() {
        liveExpensive = (10 / 100) * basicSalary;

    }

    public String getName() {
        return Name.trim();
    }

    public void setName(String Name) {
        this.Name = Name.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddress() {
        return Address;
    }

    public void setAddress(int Address) {
        this.Address = Address;
    }

    public double getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(double PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getLiveExpensive() {
        return liveExpensive;
    }

    @Override
    public String toString() {
        String details = "The Employee Name is " + Name + "\n"
                + "The Employee id is " + id + "\n"
                + "The Employee Address is " + Address + "\n"
                + "The Employee PhoneNumber is " + PhoneNumber + "\n"
                + "The Employee Email is " + Email + "\n"
                + "The Employee basicSalary is " + basicSalary + "\n";

        return details;
    }

    public abstract double getSalary();
}
