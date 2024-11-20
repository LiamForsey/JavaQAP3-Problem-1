

public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call the superclass constructor
        mySubject = subject;
        mySalary = salary;
    }

    // Getter and Setter methods
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}
