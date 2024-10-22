package Skillo.Java_Homeworks;

import java.util.Scanner;

public class Introduction_To_Programming {
    public static void main(String[] args) {
        printName();
        trianglePerimeter();
        triangleArea();
        pineTree();
        trianglePerimeterInput();
        triangleAreaInput();
        minutesCalculator();

    }

    public static void printName()

    {
        String firstName = "Jane";
        String middleName = "Alexander";
        String lastName = "Doe";
        String fullName = firstName + " " + middleName + " " + lastName;

        //There are two ways you can print out the full name
        System.out.println("Full name = " + fullName);
        System.out.println("Full name = " + firstName + " " + middleName + " " + lastName);
    }

    public static void trianglePerimeter()
    {
        // creating three variables for each side of the triangle
        double a = 2.5;
        double b = 4.6;
        double c = 7.9;
        // creating a variable that calculates the sum (perimeter) of a triangle
        double trnglPerimeter = a + b + c;

        System.out.println("Triangle parameter = " + trnglPerimeter);

    }

    public static void triangleArea()
    {
        // creating three variables for each side of the triangle
        double a = 6.5;
        double b = 7.6;
        double c = 4.4;

        // creating a variable that will help calculate the area of a triangle
        double s = (a + b + c) / 2;

        // calculating the area of the triangle
        double trnglArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle Area = " + trnglArea);
    }

    public static void pineTree()
    {
        char top = '@';
        char pine = '*';
        char trunk = '︳';
        System.out.println("     " + top);
        System.out.println("    " + pine + pine + pine);
        System.out.println("   " + pine + pine + pine + pine + pine);
        System.out.println("  " + pine + pine + pine + pine + pine + pine + pine);
        System.out.println(" " + pine + pine + pine + pine + pine + pine + pine + pine + pine);
        System.out.println("    " + trunk + trunk);
    }

    public static void trianglePerimeterInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate triangle parameter enter triangle sides below:");
        System.out.println("Enter triangle side a");
        float a = scanner.nextFloat();
        System.out.println("a = " + a);

        System.out.println("Enter triangle side b");
        float b = scanner.nextFloat();
        System.out.println("b = " + b);

        System.out.println("Enter triangle side c");
        float c = scanner.nextFloat();
        System.out.println("c = " + c);

        // creating a variable that calculates the perimeter of the triangle
        float trnglPerimeter = a + b + c;

        System.out.println("Triangle perimeter = " + trnglPerimeter);

    }

    public static void triangleAreaInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate triangle area enter triangle sides below:");
        System.out.println("Enter triangle side a");
        double a = scanner.nextDouble();
        System.out.println("a = " + a);

        System.out.println("Enter triangle side b");
        double b = scanner.nextDouble();
        System.out.println("b = " + b);

        System.out.println("Enter triangle side c");
        double c = scanner.nextDouble();
        System.out.println("c = " + c);

        // creating a variable that will help calculate the area of a triangle
        double s = (a + b + c) / 2;

        // calculating the area of the triangle
        double trnglArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle Area = " + trnglArea);

    }

    public static void minutesCalculator() {

        // creating constants that will help in the calculations
        final int minutesInHour = 60;
        final int hoursInDay = 24;
        final int daysInYear = 365;
        final int minutesInDay = minutesInHour * hoursInDay;
        final int minutesInYear = minutesInDay * daysInYear;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes (max.2,147,483,648):");
        int minutesInput = scanner.nextInt();

        if (minutesInput < minutesInYear) {
            // calculating if the entered minutes are less than a year
            int totalDays = minutesInput / minutesInDay;
            System.out.println("Answer: " + totalDays + " " + "days approximately");
        } else {
            // calculating if the entered minutes are more than a year
            int totalDays = minutesInput / minutesInDay;
            int years = totalDays / daysInYear;
            int days = totalDays % daysInYear;
            System.out.println("Answer : " + minutesInput + " minutes is approximately " + years + " years and " + days + " days.");
        }

    }
}
