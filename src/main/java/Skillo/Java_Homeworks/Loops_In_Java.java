package Skillo.Java_Homeworks;

import java.util.Random;
import java.util.Scanner;

public class Loops_In_Java {

    public static void main(String[] args) {

        largestNumber();
        divisibleByFiveAndSmallerThan150();
        reverseList();
        multipleOfFive();
        skipMultiplesOf3();
        averageCalculator();
        guessRandomNumber();

    }

    public static void largestNumber() {

        //create and array with random numbers
        int[] arr = {10, 3, 74, 5, 95, 17, 17, 80, 102};

        //create a variable that holds the largest number encountered (starts with the first number of the array)
        int largestNumber = arr[0];

        //for loop that compares the largest encountered number with the current number
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            if (largestNumber < currentNumber) {
                largestNumber = currentNumber;
            }
        }
        //print the result in the console
        System.out.println("Largest number is " + largestNumber);
    }

    public static void divisibleByFiveAndSmallerThan150() {

        int[] arr = {1, 2, 5, 9, 10, 14, 15, 16, 80, 85, 150, 175, 155, 152};

        for (int number : arr) {
            //check if the number is divisible by 5, if it is print it
            if ((number % 5) == 0) {
                System.out.println("Number " + number);
                //if number is higher than 150 exit the cycle
                if (number > 150) {
                    break;
                }
            }
        }
    }

    public static void reverseList() {

        int[] list1 = {10, 20, 30, 40, 50};

        System.out.println("Reversed list : ");
        //for loop that starts with the last index of the array and reduces with one each loop until it reaches index 0
        for (int i = list1.length - 1; i >= 0; i--) {
            System.out.println(list1[i] + " ");
        }
    }

    public static void multipleOfFive() {

        int[] arr = {1, 2, 9, 5, 10, 14, 15, 16, 80, 85};

        //create variable that will hold each number
        int number = 0;

        //for each loop that checks each number if it is divisible by 5
        for (int num : arr) {
            number = num;
            //if it is divisible exit the cycle
            if ((number % 5) == 0) {
                break;
            }
        }
        System.out.println("First number that is multiple to 5 is " + number);
    }

    public static void skipMultiplesOf3() {

        int[] arr = {1, 3, 5, 6, 8, 9, 12, 15, 16, 20, 21};

        // crate a variable that will store each number
        int number = 0;

        //for each loop that checks each number if it is divisible by 3
        for (int num : arr) {
            number = num;
            if ((number % 3) == 0) {
                continue;
                //if it is divisible skip that number and continue to check the rest
            }
            System.out.println(number);
        }
    }

    public static void averageCalculator() {

        int[] arr = {1, 4, 6, 7, 24, 65, 67};

        //take the length of the array
        int listLength = arr.length;
        //create a variable that will hold the sum of all the numbers
        int sum = 0;

        //calculate the sum of all numbers
        for (int num : arr) {
            sum += num;
        }
        //calculate the average
        double average = (double) sum / listLength;

        //print the average result in the console
        System.out.println("The average of the list is: " + average);
    }

    public static void guessRandomNumber() {

        //create  a variable that will generate a random number between 1 and 100 using Random method
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        //create a variable that will hold the user input
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Enter a random number between 1 and 100 to play the game");

        //while loop that prompts user to start game and enter number
        while (userInput != randomNumber) {
            // prompt the user to enter a guess
            System.out.print("My number: ");
            userInput = scanner.nextInt();

            //check if input is higher, lower or equal to random number
            if (userInput > randomNumber) {
                System.out.println("Number is too high. Try again!");
            } else if (userInput < randomNumber) {
                System.out.println("Number is too low. Try again!");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
            }


        }


    }
}
