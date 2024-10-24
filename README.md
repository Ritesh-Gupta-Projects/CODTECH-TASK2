
# Student Grade Manager

**Student Grade Manager** is a Java-based application that calculates and manages students' grades. The system computes the average grade, determines the letter grade based on the average, and calculates the GPA according to a standard grading scale.

## Project Objective

The objective of this project is to provide a simple system where users can input grades for multiple subjects or assignments, calculate the overall average, determine the corresponding letter grade, and compute the GPA. This project demonstrates Java concepts such as arrays, loops, user input, and conditional statements.

## Features

- **Grade Input**: Users can input grades for multiple subjects or assignments.
- **Average Calculation**: The program calculates the average grade of all the entered subjects.
- **Letter Grade**: Based on the average grade, the system assigns a letter grade (A, B, C, D, or F).
- **GPA Calculation**: The system also computes the GPA on a scale of 0.0 to 4.0.

## How It Works

1. The user is prompted to input the number of subjects or assignments.
2. The user inputs the grades for each subject/assignment.
3. The program calculates the average of the grades.
4. The program displays the average grade, corresponding letter grade, and GPA based on the entered grades.

## Prerequisites

To run this project, you will need:

- Java Development Kit (JDK) installed on your system.
- A text editor or an IDE such as IntelliJ IDEA, Eclipse, or VSCode.

## How to Run the Project

1. Clone this repository or download the code.
   ```bash
   git clone https://github.com/yourusername/student-grade-manager.git
   ```
2. Navigate to the project directory.
   ```bash
   cd student-grade-manager
   ```
3. Compile the Java file.
   ```bash
   javac StudentGradeManager.java
   ```
4. Run the compiled Java program.
   ```bash
   java StudentGradeManager
   ```

## Code Example

```java
public class StudentGradeManager {
    public static String getLetterGrade(double average) {
        // Grade calculation logic here
    }
    
    public static double getGPA(double average) {
        // GPA calculation logic here
    }
    
    public static void main(String[] args) {
        // Main code for input and output
    }
}
```

## Future Enhancements

- Add validation to ensure input grades are within a valid range (0-100).
- Implement the option to save student grade data to a file for future reference.
- Add functionality to handle multiple students and calculate class averages.
- Integrate a graphical user interface (GUI) using Java Swing or JavaFX for better user experience.

