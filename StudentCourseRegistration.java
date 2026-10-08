import java.util.Scanner;

class Student {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String name, int roll, double m,
            String course, int credits) {

        studentName = name;
        rollNumber = roll;
        marks = m;
        courseName = course;
        courseCredits = credits;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }
  boolean checkEligibility() {
    if (marks >= 50) {
        return true;
    } else {
        return false;
    }
}

    

    double calculateScholarship() {
        if (marks >= 85) {
            return 20;
        } 
        else if (marks >= 70) {
            return 10;
        } 
        else {
            return 0;
        }
    }

    double calculateFinalFee() {

        double fee = calculateFee();
        double scholarship = calculateScholarship();

        double scholarshipAmount = fee * scholarship / 100;

        return fee - scholarshipAmount;
    }

    void displayDetails() {

        double fee = calculateFee();
        double scholarship = calculateScholarship();
        double scholarshipAmount = fee * scholarship / 100;

        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Course Fee: Rs. " + fee);
        System.out.println("Scholarship: " + scholarship + "%");
        System.out.println("Scholarship Amount: Rs. " + scholarshipAmount);
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        double m = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, m, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } 
        else {
            System.out.println("Student is not eligible for registration.");
        }

        sc.close();
    }
}