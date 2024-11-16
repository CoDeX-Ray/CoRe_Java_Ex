
import java.util.Scanner;

/*
 Problem 6: Write a Java program to print the sum (addition),
 multiply, subtract, divide and remainder of two numbers.

 Test Data:
    Input first number: 125
    Input second number: 24

 Expected Output :
    125 + 24 = 149
    125 - 24 = 101
    125 x 24 = 3000
    125 / 24 = 5
    125 mod 24 = 5
*/

public class jvEx6 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Input second number: ");
            int secondNumber = scan.nextInt();

            int sum = firstNumber + secondNumber;
            int difference = firstNumber - secondNumber;
            int product = firstNumber * secondNumber;
            int quotient = firstNumber / secondNumber;
            int modulus = firstNumber % secondNumber;

            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
            System.out.println(firstNumber + " x " + secondNumber + " = " + product);
            System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
            System.out.println(firstNumber + " % " + secondNumber + " = " + modulus);
        }
    }
}
