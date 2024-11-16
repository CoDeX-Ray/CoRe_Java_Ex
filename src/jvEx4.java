/*
 Problem 4: Write a Java program to print the results of the following operations.
 Test Data:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3 
 Expected Output:
    43
    1
    19
    13
*/

public class jvEx4 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6;
        System.out.println((num1 = -5) + (num2 = 8) * (num3 = 6));
        System.out.println(((num1 = 55) + (num2 = 9)) % (num3 = 9));
        System.out.println((num1 = 20) + (num2 = -3) * (num3 = 5) / (num4 = 8));
        System.out.println((num1 = 5) + (num2 = 15) / (num3 = 3) * (num4 = 2) - (num5 = 8) % (num6 = 3));
    }
}
