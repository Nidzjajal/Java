class Student {

    String enrollmentNo;
    String name;
    String gender;
    int marks;
    static int count = 0;

    Student() {
        this("SAL01", "Newmem", "Female", 100); // constructor chainning use this key word to call another constructor
    }

    public Student(String enrollmentNo, String name, String gender, int marks) {
        this.enrollmentNo = enrollmentNo;// use of this this.name = name; this.gender = gender; this.marks = marks;
        count++;
    }

    void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name         : " + name);
        System.out.println("Gender       : " + gender);
        System.out.println("Marks        : " + marks);
        System.out.println();
    }

    static int getCount() {
        return count;
    }
}

public class Ex13 {

    public static void main(String[] args) {

        Student s1 = new Student("SAL02", "vishva", "Female", 85);
        Student s2 = new Student("SAL03", "krish", "Male", 92);
        Student s3 = new Student(); // Use default values

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total number of students: " + Student.getCount());
    }
}
