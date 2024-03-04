import java.util.Scanner;

class Teachers {
    protected String type;

    // Constructor for Teachers class
    public Teachers(String type) {
        this.type = type;
    }

    // Method to display teaching information
    public void Teaches() {
        System.out.println("Teacher is teaching something.");
    }
}

class TeacherTeaches extends Teachers {
    private String name;

    // Constructor for TeacherTeaches class
    public TeacherTeaches(String type, String name) {
        super(type);
        this.name = name;
    }

    // Method to display the subject being taught
    public void Subjects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject the teacher is teaching: ");
        String subject = scanner.nextLine();
        System.out.println("The teacher is teaching " + subject + ".");
        scanner.close();
    }
}

public class TeachersDemo {
    public static void main(String[] args) {
        // Creating an instance of TeacherTeaches class
        TeacherTeaches mathTeacher = new TeacherTeaches("Mathematics", "Ms. Smith");

        // Calling the Teaches() method from Teachers class
        mathTeacher.Teaches();

        // Calling the Subjects() method from TeacherTeaches class
        mathTeacher.Subjects();
    }
}

