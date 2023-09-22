public class StudentRunner {
    public static void main(String[] args)  {
        Student student1 = new Student("Bob", 69, 3.5);
        Student student2 = new Student("Joe", 63, 4.0);
        student1.introduce();
        student1.showInfo();
        student2.introduce();
        student2.showInfo();
    }
}
