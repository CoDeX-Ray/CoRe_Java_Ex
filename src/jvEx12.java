import java.util.Scanner;

/*
 Problem 12: Write a Java program that takes three numbers as input
 to calculate and print the average of the numbers.
*/

public class jvEx12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a first number: ");
            int firstNumber = scan.nextInt();
            System.out.println("Enter a second number: ");
            int secondNumber = scan.nextInt();
            System.out.println("Enter a third number: ");
            int thirdNumber = scan.nextInt();
            System.out.println("Average of three numbers: " + (firstNumber + secondNumber + thirdNumber) / 3);
        }
    }
}
