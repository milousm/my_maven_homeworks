package Skillo.Java_Homeworks;

import java.util.Scanner;

public class Operators_Expression_Conditional_Statements {
    public static void main(String[] args) {
        possibleTriangle();
        daysOfTheWeek();
        workingAge();
        revenueCalculator();
        destinationAdvisor();
        leapYearCheck();
        temperatureConverter();
    }

    public static void possibleTriangle() {

        // ask the user to enter all 3 angels
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle 'a' for triangle (max 7 decimal digits)");
        float a = scanner.nextFloat();

        System.out.print("Enter angle 'b' for triangle (max 7 decimal digits)");
        float b = scanner.nextFloat();

        System.out.print("Enter angle 'c' for triangle (max 7 decimal digits)");
        float c = scanner.nextFloat();

        // create a variable that later will help us calculate triangle type
        boolean possibleTriangle = false;

        // check if triangle is possible, if not we display error message to user
        if (a + b + c != 180) {
            System.out.print("Triangle is not possible");
        }
        else {
            // once establish the triangle is possible check its type according to its angles
            possibleTriangle = true;
            if (a == 90 || b == 90 || c == 90) {
                System.out.print("Triangle is right-angled");
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.print("Triangle is Obtuse");
            } else {
                System.out.print("Triangle is Acute");
            }
        }

        // after finding the triangle's type by its angles check its type by sides
        if (possibleTriangle == true) {
            if (a == b && b == c) {
                System.out.print(" and  equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.print(" and isosceles");
            } else {
                System.out.print(" and multifaceted");
            }

        }
    }

    public static void daysOfTheWeek() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7");
        byte day = scanner.nextByte();

        // we check the input number and compare it to the days of the week
        switch (day) {
            case 1:
                System.out.print("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.print("The " + day + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.print("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.print("The " + day + "-th day of the week is Thursday");
                break;
            case 5:
                System.out.print("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.print("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.print("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.print("The week has only 7 days");
        }

    }

    public static void workingAge() {

        //prompt the user to enter their age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        // check if the use is between 16 and 65 (eligible working age)
        if (age >= 16) {
            if (age > 65) {
                System.out.print("You are above the working age");
            } else {
                System.out.print("You are eligible to work");
            }
        } else {
            System.out.print("You are below the working age");
        }
    }

    public static void revenueCalculator() {

        //prompt the user to enter unit price and quantity
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter unit quantity: ");
        int quantity = scanner.nextInt();

        // create variables that calculate and store total price and discounts
        double total = (price * quantity);
        double discountRate1 = 0.15;
        double discountRate2 = 0.20;
        double discountTotal = 0;

        if (quantity < 100) {
            // checking if quantity is below required for discount
            System.out.print("The revenue from sale:" + " " + (total - discountTotal) + " and discount:" + " " + discountTotal + "(0%)" );
        } else if (quantity >= 100 && quantity <= 120) {
            // checking if quantity fall in first discount rate and apply the discount
            discountTotal = (total * discountRate1);
            System.out.print("The revenue from sale:" + " " + (total - discountTotal) + " and discount:" + " " + discountTotal + "(15%)"  );
        } else {
            // apply the second discounted rate
            discountTotal = (total * discountRate2);
            System.out.print("The revenue from sale:" + " " + (total - discountTotal) + " and discount:" + " " + discountTotal + "(20%)" );
        }
    }

    public static void destinationAdvisor(){

        //prompt the user to enter budget, days, number of people and vacation type

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vacation budget: ");
        double budget = scanner.nextFloat();

        System.out.print("Enter vacation days: ");
        int days = scanner.nextInt();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        System.out.print("Enter vacation type (Mountain or Beach): ");
        String type = scanner.next();

        // calculating the budget per day from input values
        double budgetPerDay = budget / (days * people);

        // there are two ways to show the user the required information
        // first way with "if"
        if (budgetPerDay < 50 && type.equals("Beach")) {
            System.out.print("Ideal destination: Bulgaria");
        } else if (budgetPerDay >= 50 && type.equals("Beach")) {
            System.out.print("Ideal destination: Outside Bulgaria");
        } else if (budgetPerDay < 30 && type.equals("Mountain")) {
            System.out.print("Ideal destination: Bulgaria");
        } else if (budgetPerDay >= 30 && type.equals("Mountain")) {
            System.out.print("Ideal destination: Outside Bulgaria");
        } else {
            System.out.print("No information on this type of vacation");
        }

        //second way with switch case
        switch (type) {
            case "Beach":
                if (budgetPerDay < 50) {
                    System.out.println("Ideal destination: Bulgaria");
                } else {
                    System.out.println("Ideal destination: Outside Bulgaria");
                }
                break;
            case "Mountain":
                if (budgetPerDay < 30) {
                    System.out.println("Ideal destination: Bulgaria");
                } else {
                    System.out.println("Ideal destination: Outside Bulgaria");
                }
                break;
            default:
                System.out.println("No information on this type of vacation");
        }
    }

    public static void leapYearCheck() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // creating a variable that will hold the value if the year is leap or not
        boolean leapYear = false;

        // check if year in divisible by 4, 100 and 400
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                leapYear = true;
            }
        }

        // display message for user if year is leap or not
        if (leapYear == true) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }

    public static void temperatureConverter() {

        // prompt user to enter year and choose way of conversion

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to Fahrenheit or  Celsius?: ");
        String temp = scanner.next();

        // perform the conversion based on the user's choice using a switch statement
        switch (temp){
            case ("Fahrenheit"):
                // convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case ("Celsius"):
                // convert Fahrenheit to Celsius
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
