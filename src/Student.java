public class Student {
    private String name;
    private int heightInches;
    private double gpa;

    public Student(String studentName, int studentHeightInches, double studentGPA) {
        name = studentName;
        heightInches = studentHeightInches;
        gpa = studentGPA;
    }
    public void introduce() {
        System.out.println("Hi I am " + name);
    }
    public void showInfo() {
        System.out.println("Height(inches): " + heightInches);
        System.out.println("GPA: " + gpa);

    }
}
