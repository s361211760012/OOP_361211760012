package lab9;

public class Employee {
    private int empID;
    private String Name;
    private String position;
    private double salary;
    //constructor

    public Employee(int empID, String name, String position, double salary) {
        this.empID = empID;
        Name = name;
        this.position = position;
        this.salary = salary;
    }

    //

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", Name='" + Name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
