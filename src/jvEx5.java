import java.util.Scanner;

/*
 Problem 5: Write a Java program that takes two numbers as input and displays
            the product of two numbers.
 Test Data:
    Input first number: 25
    Input second number: 5
Expected Output : 25 x 5 = 125
*/

public class jvEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scan.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
    }
}
