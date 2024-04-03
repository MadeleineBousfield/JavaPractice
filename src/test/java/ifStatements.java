import java.io.InputStream;
import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        //IF STATEMENTS
        /*
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        if (age > 13) {
            System.out.println("You are eligible to register.");
            System.out.println("You can register using the mobile app.");
        }
        else
            System.out.println("Sorry, you are not eligible to register.");
        */

        //IF ELSE STATEMENTS
/*
        System.out.println("Please enter your salary: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i>=0 && i<=4000)
            System.out.println("i will not receive a reduction.");
        else if(i<=6000)
            System.out.println("i will receive a 10% reduction.");
        else if (i>6001)
            System.out.println("i will receive a 20% reduction.");
        else
            System.out.println("Please enter a valid number.");
        input.close();
*/

        //NESTED IF ELSE STATEMENTS
        System.out.println("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age > 0)
            if (age > 18)
                System.out.println("You are eligible to register.");
            else
                System.out.println("You are not eligible to register.");
        else
            System.out.println("Invalid age value.");

        // && = AND. expression is true if BOTH conditions are true
        // || = OR. expression is true if EITHER condition is true
        // ! = NOT. expression is true if condition is reversed from true to false or vice versa.
    }
}