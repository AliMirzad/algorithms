// import the Scanner class
import java.util.Scanner;

// create a class named Calculator
public class Calculator {

    // create the main method
    public static void main (String [] args) {

        // declare variables to store the numbers and the result
        double num1, num2, result;

        // create a Scanner object to read user input
        Scanner sc = new Scanner (System.in);

        // prompt the user to enter the first number
        System.out.println ("Enter the first number:");
        // read and store the first number
        num1 = sc.nextDouble ();

        // prompt the user to enter the second number
        System.out.println ("Enter the second number:");
        // read and store the second number
        num2 = sc.nextDouble ();

        // prompt the user to enter the operator
        System.out.println ("Enter the operator (+, -, *, or /):");
        // read and store the operator as a char
        char op = sc.next ().charAt (0);

        // use a switch-case statement to perform the appropriate operation
        switch (op) {
            case '+':
                // add the numbers and store in result
                result = num1 + num2;
                break;
            case '-':
                // subtract the numbers and store in result
                result = num1 - num2;
                break;
            case '*':
                // multiply the numbers and store in result
                result = num1 * num2;
                break;
            case '/':
                // divide the numbers and store in result
                result = num1 / num2;
                break;
            default:
                // display an error message for invalid operator
                System.out.println ("Invalid operator");
                // set result to zero
                result = 0;
                break;
        }

        // display the result to the user
        System.out.println ("The result is: " + result);

        // close the Scanner object
        sc.close ();
    }
}
