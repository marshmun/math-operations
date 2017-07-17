import java.util.Scanner;

/**
 * Created by marshallmunoz on 7/17/17.
 */
public class mathOperations {

    public static void main(String[] args) {
        double operand1 = getUserInput();
        double operand2= getUserInput();
        showResults(operand1, operand2);

    }
    private static void showResults( double operand1, double operand2) {
        double additon = operand1 + operand2;
        System.out.println("The sum of your two numbers is: " + additon);
        double subtraction = operand1 - operand2;
        System.out.println("The difference of your two numbers is: " + subtraction);
        double multiplication = operand1 * operand2;
        System.out.println("Your numbers Multiplied is: "+ multiplication);
        double division = operand1/operand2;
        System.out.println("Your numbers divided is: " + division);
        double remainder = operand1 % operand2;
        System.out.println("The remainder after dividing your two number is: " + remainder);
    }

    public static double getUserInput() {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter in one number");
        double userInput = Double.parseDouble(scanner.nextLine());
        return userInput;
    }

}
