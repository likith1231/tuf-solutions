import java.util.Scanner;

public class IfElseif {

    public static String getGrade(int marks) {
        String grade;
        if (marks < 0 || marks > 100) {
            grade = "Invalid";
        } else if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        String result = getGrade(marks);
        System.out.println("Grade: " + result);
        scanner.close();
    }
}
