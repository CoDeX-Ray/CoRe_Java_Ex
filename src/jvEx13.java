/*
 Problem 13: Write a Java program to print the area and perimeter of a rectangle.
 Test Data: Width = 5.6 Height = 8.5
 Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

public class jvEx13 {
    public static void main(String[] args) {
        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2 * (width + height), area = width * height;

        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);
    }
}
