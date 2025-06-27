import java.util.Scanner;

class Student {
    protected int rollNumber;
    protected String name;
    protected String branch;

    public Student(int rollNumber, String name, String branch) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }
}

class Exam extends Student {
    protected int[] subjectMarks;

    public Exam(int rollNumber, String name, String branch, int[] subjectMarks) {
        super(rollNumber, name, branch);
        this.subjectMarks = subjectMarks;
    }

    public void displayExamDetails() {
        displayStudentDetails();
        System.out.println("Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
    }
}

class Result extends Exam {
    private int totalMarks;
    private String result;

    public Result(int rollNumber, String name, String branch, int[] subjectMarks) {
        super(rollNumber, name, branch, subjectMarks);
        calculateResult();
    }

    private void calculateResult() {
        totalMarks = 0;
        for (int i = 0; i < subjectMarks.length; i++) {
            totalMarks += subjectMarks[i];
        }
        result = (totalMarks >= 150) ? "Pass" : "Fail";
    }

    public void displayResult() {
        System.out.println("Result:");
        displayExamDetails();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Result: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        int[] marks = new int[3];
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Result result = new Result(rollNumber, name, branch, marks);
        result.displayResult();
    }
}
