/*
 Problem 15: Write a Java program to swap two variables.
*/

public class jvEx15 {
    public static void main(String[] args) {
        int firstNumber = 1, secondNumber = 2, temp;

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
    }
}
