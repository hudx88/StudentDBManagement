import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.next();
        System.out.println(firstName + " " + lastName + " " + gradeYear);

        setStudentID();
    }

    private void setStudentID() {
        studentID = 1000 + (int) (Math.random() * 9000);
    }

    
    public void enroll() {
    Scanner in = new Scanner(System.in);

    while (true) {
        System.out.print("Enter course to enroll (Q to quit): ");
        String course = in.nextLine();

        if (course.equalsIgnoreCase("Q")) {
            break;
        } else {
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
    }

    System.out.println("ENROLLED IN: " + courses);
    System.out.println("TUITION BALANCE: " + tuitionBalance);
}


    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;

        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public void viewBalance() {
        System.out.println("Balance: $" + tuitionBalance);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.enroll();
        student.payTuition();
    }
}
