/*
 Problem 11: Write a Java program to print the area and perimeter of a circle.
 Test Data: Radius = 7.5
 Expected Output:
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586
*/

public class jvEx11 {
    public static void main(String[] args) {
        final double radius = 7.5;
        double perimeter = 2 * Math.PI * radius, area = Math.PI * radius * radius;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
