import java.util.Scanner;

/*
 Problem 7: Write a Java program that takes a number as input and
            prints its multiplication table up to 10.
 Test Data:
    Input a number: 8

 Expected Output :
    8 x 1 = 8
    8 x 2 = 16
    8 x 3 = 24
    ...
    8 x 10 = 80
*/

public class jvEx7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
