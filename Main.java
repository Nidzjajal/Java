import student.Student;
import exam.Result;

public class Main {
    public static void main(String[] args) {
    
        Student student1 = new Student("John Doe", 101);
        Result result1 = new Result(student1, 85, 90, 78);
        result1.displayMarkSheet();
    }
}
