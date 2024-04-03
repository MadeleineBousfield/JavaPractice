import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int assignmentTotal = 40;
        int examTotal = 200;
        int assignmentGrade;
        int examGrade;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total assignments grade: ");
        assignmentGrade = input.nextInt();
        System.out.println("Please enter your final exam grade: ");
        examGrade = input.nextInt();

        int totalGrade = assignmentTotal + examTotal;
        int studentGrade = assignmentGrade + examGrade;
        float studentFinalGrade = (float) studentGrade/totalGrade * 100;

        System.out.println("Your total grade is: " + studentFinalGrade);
    }
}
