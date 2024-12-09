//12) Create a class “Student” that would contain enrollment No, name, and gender andmarks as instance variables and count as static variable which stores the count of the objects; constructors and display(). Implement constructors to initialize instance variables. Also demonstrate constructor chaining. Create objects of class “Student” and displays all values of objects 

class Student {

    String enrollmentNo;
    String name;
    String gender;
    int marks;

    static int count = 0;

    Student() {
        this("SAL01", "abhira", "Female", 100); // constructor chainning use this key word to call another constructor
    }

    Student(String e, String n, String g, int m) {
        enrollmentNo = e;
        name = n;
        gender = g;
        marks = m;
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

public class Q12 {

    public static void main(String[] args) {

        Student s1 = new Student("SAL02", "vishva", "Female", 85);
        Student s2 = new Student("SAL03", "Nidhi", "Female", 82);
        Student s3 = new Student(); // Use default values

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total number of students: " + Student.getCount());
    }
}
