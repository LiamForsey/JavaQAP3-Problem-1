

public class CollegeStudent extends Student {
    private String myMajor;
    private int myYear; // 1 = Freshman, 2 = Sophomore, etc.

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call the superclass constructor
        myYear = year;
        myMajor = major;
    }

    // Getter and Setter methods
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}
