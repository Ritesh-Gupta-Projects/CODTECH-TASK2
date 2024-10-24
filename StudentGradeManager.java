import java.util.Scanner;

public class StudentGradeManager {

    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static double getGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects/assignments: ");
        int numSubjects = scanner.nextInt();

        double[] grades = new double[numSubjects];
        double total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        double average = total / numSubjects;

        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + getLetterGrade(average));
        System.out.println("GPA: " + getGPA(average));
    }
}
