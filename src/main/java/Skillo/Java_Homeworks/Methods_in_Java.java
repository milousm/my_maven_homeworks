package Skillo.Java_Homeworks;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class Methods_in_Java {

    public static void main(String[] args) {

        int[] arr = {2, 8, 6, 8, 9, 5, 4, 2};
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        int evenNumber = 8;
        int unevenNumber = 7;

        findSmallestNumber(2, 5, 7);
        computeAverageNumber(5, 7, 8);
        displayMiddleCharacter(string);
        countAllWords(string);
        findSecondLargest(arr);
        removeDuplicateNumbers(arr);
        displayLastCharacter(string);
        isEven(evenNumber);
        isPalindrome();


    }

    public static double findSmallestNumber(double num1, double num2, double num3) {
        //Write a Java method to find the smallest number among three numbers

        double smallestNumber = num1;
        if (smallestNumber > num2) {
            smallestNumber = num2;
        }

        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }

    public static double computeAverageNumber(double num1, double num2, double num3) {
        //Write a Java method to compute the average of three numbers

        return (num1 + num2 + num3) / 3;
    }

    public static void displayMiddleCharacter(String value) {
        // Write a Java method to display the middle character of a string
        int position;
        int length;

        //a) if the length of the string is even there will be two middle characters.
        if (value.length() % 2 == 0) {
            position = value.length() / 2 - 1;
            length = 2;

        } else {
            //b) if the length of the string is odd there will be one middle character.
            position = value.length() / 2;
            length = 1;
        }

        System.out.println(value.substring(position, position + length));
    }

    public static int countAllWords(String text) {
        // Write a Java method to count all words in a string.

        text = text.trim();
        int count = 0;
        int textLength = text.length();

        if (textLength > 1) {
            count++;
            for (int i = 1; i < textLength; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }


    public static int findSecondLargest(int[] numbers) {
        // Write a Java method to find the second largest number in an array of integers.

        int secondLargest = -1;
        if (numbers.length < 2) {
            return secondLargest;
        }

        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int[] removeDuplicateNumbers(int[] numbers) {
        // Write a Java method to remove duplicate elements from an array of numbers
        // and return a new array with only unique elements.

        if (numbers == null) {
            System.out.println("Array can't be null");
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        int[] uniqueArray = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void displayLastCharacter(String text) {
        // Write a Java method to display the last character of a string. If the string is empty,
        // display a message indicating that there is no last character.
        if (text == null || text.isEmpty()) {
            System.out.println("String is empty, there is no last character!");
        } else {
            char lastChar = text.charAt(text.length() - 1);
            System.out.println("Last character of string is: " + lastChar);
        }
    }

    public static boolean isEven(int num) {
        // Write a method named isEven that accepts an int argument.
        // The method should return true if the argument is even, or false otherwise

        return num % 2 == 0;
    }

    public static boolean isPalindrome() {
        // A takes as input a non-negative integer and returns true if the number is a palindrome

        int remainder;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");

        int num = scanner.nextInt();

        if (num >= 0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        } else {
            System.out.println("The integer must be a positive number!");
            return false;
        }
    }
}
