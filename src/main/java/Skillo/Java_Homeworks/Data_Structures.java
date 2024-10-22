package Skillo.Java_Homeworks;

import java.util.*;

public class Data_Structures {

    public static void main(String[] args) {

        sumOfArrayElements();
        printElements4RowsAnd3Columns();
        printElementsOfDynamicArray();
        findBiggestElement();
        toDoList();
        lotteryNumbers();
        contactList();
        coffeeShopLineManager();
        manageStackOfBooks();
        manageStackOfFiveBooks();

    }

    public static void sumOfArrayElements() {

        int[] arr = {2, 6, 889, 234, 4564, 433, 5665, 32, 0, 23, 0, 1, 45};

        //create a variable that will hold the sum of the elements
        int sum = 0;

        //loop through the array and add each number to the current sum
        for (int number : arr) {
            sum = sum + number;
        }

        //Print in the console the final sum
        System.out.println("Sum of array elements: " + sum);
    }

    public static void printElements4RowsAnd3Columns() {

        //create matrix with 4 rows and 3 columns
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // for each loop that cycles through the rows and the then columns and prints them out at the end
        for (int[] rows : matrix) {
            for (int columns : rows) {
                System.out.println(columns);
            }
        }
    }

    public static void printElementsOfDynamicArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns : ");
        int columns = scanner.nextInt();

        //declaring a new two-dimensional array with the inputted number of rows and columns
        int[][] matrix = new int[rows][columns];

        //ask the user to input all the elements of the array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("New array is : " + Arrays.deepToString(matrix));
    }

    public static void findBiggestElement() {

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

    public static void toDoList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println("Welcome to your To Do List!");
        System.out.println("Please enter the initial number of your To Do tasks for today: ");
        int numberOfTasks = scanner.nextInt();

        // consume the leftover newline character
        scanner.nextLine();

        // input tasks for the list
        System.out.println("Enter tasks: ");
        for (int i = 0; i < numberOfTasks; i++) {
            System.out.print((i + 1) + ". ");
            String task = scanner.nextLine();
            toDoList.add(task);
        }

        while (true) {
            // Provide user options for managing the list
            System.out.println();
            System.out.println("To Do List Manager:");
            System.out.println("1. Add a new task.");
            System.out.println("2. Mark task as completed. [Remove task]");
            System.out.println("3. Display current list.");
            System.out.println("4. Exit.");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // add new task
                    System.out.print("Enter task: ");
                    String addedTask = scanner.nextLine();
                    toDoList.add(addedTask);
                    System.out.println("Task has been added!");
                    System.out.println("Updated To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ": " + toDoList.get(i));
                    }
                    break;

                case 2:
                    // mark as completed
                    System.out.print("Enter task number to mark as completed: ");
                    int completedTask = scanner.nextInt();
                    if (completedTask > 0 && completedTask <= toDoList.size()) {
                        toDoList.remove(completedTask - 1); // Corrected index
                        System.out.println("Task marked as completed. [Removed from list]");
                        System.out.println("Updated To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ": " + toDoList.get(i));
                        }
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    scanner.nextLine();
                    break;

                case 3:
                    // display current list
                    System.out.println("Current To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ": " + toDoList.get(i));
                    }
                    break;

                case 4:
                    // exit the program
                    System.out.println("Exiting the To-Do List Manager...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");

            }
        }
    }

    public static void lotteryNumbers() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();

        System.out.println("Welcome to your Lottery Numbers Manager!");

        while (true) {
            // Provide user options for managing the list
            System.out.println();
            System.out.println("Please choose an option");
            System.out.println("1. Add new lottery number.");
            System.out.println("2. View list of winning numbers.");
            System.out.println("3. Check if specific number is winning");
            System.out.println("4. Exit.");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // add new lottery number
                    System.out.print("Enter new number: ");
                    Integer newNumber = Integer.valueOf(scanner.nextLine());
                    lotteryNumbers.add(newNumber);
                    System.out.println("Number has been added!");
                    break;

                case 2:
                    // view winning numbers
                    System.out.println("Winning numbers : ");
                    System.out.println(lotteryNumbers);
                    break;

                case 3:
                    // check if specific number is a winning number
                    System.out.println("Enter number to check :");
                    Integer userNumber = scanner.nextInt();
                    if (lotteryNumbers.contains(userNumber)) {
                        System.out.println(userNumber + " is a winning number ! ");
                    } else {
                        System.out.println(userNumber + " is not a winning number !");
                    }
                    break;
                case 4:
                    // exit the program
                    System.out.println("Exiting the Lottery Numbers Manager...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");

            }
        }
    }

    public static void contactList() {
        LinkedList<String> contactList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Contacts Manager!");

        while (true) {
            System.out.println("Please choose an option");
            System.out.println("1. Add a new contact.");
            System.out.println("2. View contact list.");
            System.out.println("3. Remove a contact");
            System.out.println("4. Exit Manager.");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    //add a contact
                    System.out.print("Enter contact details: ");
                    String contact = scanner.nextLine();
                    contactList.add(contact);
                    System.out.print("Contact has been added!");
                    break;

                case 2:
                    //view contact list
                    System.out.println("Contact List:");
                    for (int i = 0; i < contactList.size(); i++) {
                        System.out.println((i + 1) + ": " + contactList.get(i));
                    }
                    break;

                case 3:
                    //remove contact
                    System.out.println("Enter contact position to remove. Contact list: ");
                    for (int i = 0; i < contactList.size(); i++) {
                        System.out.println((i + 1) + ": " + contactList.get(i));
                    }
                    int position = scanner.nextInt() - 1;

                    if (position >= 0 && position < contactList.size()) {
                        String removedContact = contactList.remove(position);
                        System.out.println(removedContact + "has been removed");
                    } else {
                        System.out.println("Invalid contact. Please try again.");
                    }
                    break;
                case 4:
                    // exit the program
                    System.out.println("Exiting the Contacts Manager...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");

            }

        }
    }

    public static void coffeeShopLineManager() {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Queue manager!");

        while (true) {
            System.out.println("Please choose an option");
            System.out.println("1. A new customer has been added to the queue.");
            System.out.println("2. View queue.");
            System.out.println("3. Customer has been served.");
            System.out.println("4. Exit Manager.");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    //add a new customer to the queue
                    System.out.print("Enter customer details: ");
                    String customer = scanner.nextLine();
                    customerQueue.add(customer);
                    System.out.print("Customer has been added!");
                    break;

                case 2:
                    //view customer queue
                    System.out.println("Customer queue: ");
                    for (String queue : customerQueue) {
                        System.out.println(queue);
                    }
                    break;

                case 3:
                    //serve/remove a customer from the queue
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in the queue to get served...");
                    } else {
                        System.out.println("Serving customer: " + customerQueue.poll());
                        System.out.println("Customer has been served!");
                    }
                    System.out.println("Updated customer queue: ");
                    for (String queue : customerQueue) {
                        System.out.println(queue);
                    }
                    break;
                case 4:
                    // exit the program
                    System.out.println("Exiting the Queue Manager...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");

            }

        }


    }

    public static void manageStackOfBooks() {
        Stack<String> stackOfBooks = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Initial stack of books
        stackOfBooks.push("A Tale Of Two Cities");
        stackOfBooks.push("The Little Prince");
        stackOfBooks.push("The Hobbit");
        stackOfBooks.push("Atomic Habits");
        System.out.println("The initial stack of books consists of: " + stackOfBooks);


        //I wanted to try a different approach here and see if I can do it with if statements
        while (true) {
            System.out.print("Do you want to add a book? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the book title you want to add: ");
                String newBook = scanner.nextLine();
                stackOfBooks.push(newBook);
                System.out.println("Updated stack of books: " + stackOfBooks);

            } else if (response.equalsIgnoreCase("no")) {
                System.out.print("Do you want to remove a book from the stack? (yes/no): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    if (!stackOfBooks.isEmpty()) {
                        System.out.println("Removing book: " + stackOfBooks.pop());
                        System.out.println("Book has been removed!");
                    } else {
                        System.out.println("No books to remove. The stack is empty.");
                    }
                    System.out.println("Updated stack of books: " + stackOfBooks);

                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.print("Do you want to view the top book? (yes/no): ");
                    String viewAnswer = scanner.nextLine();

                    if (viewAnswer.equalsIgnoreCase("yes")) {
                        if (!stackOfBooks.isEmpty()) {
                            System.out.println("Top book: " + stackOfBooks.peek());
                        } else {
                            System.out.println("No books in the stack to view.");
                        }
                    } else if (viewAnswer.equalsIgnoreCase("no")) {
                        System.out.println("Returning to main menu.");
                    } else {
                        System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                    }
                } else {
                    System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                }

            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }

            // Optionally, you can add an option to exit the loop
            System.out.print("Do you want to continue managing the stack? (yes/no): ");
            String continueResponse = scanner.nextLine();
            if (continueResponse.equalsIgnoreCase("no")) {
                System.out.println("Exiting the program.");
                break;
            }
        }
    }

    public static void manageStackOfFiveBooks() {

        Stack<String> stackOfBooks = new Stack<>();
        Stack<String> tempStack = new Stack<>();
        String foundBook = null;
        Scanner scanner = new Scanner(System.in);

        stackOfBooks.push("Harry Potter And The Philosopher's Stone");
        stackOfBooks.push("Harry Potter And The Chamber of Secrets");
        stackOfBooks.push("Harry Potter And The Prisoner of Azkaban ");
        stackOfBooks.push("Harry Potter And The Goblet of Fire");
        stackOfBooks.push("Harry Potter And The Order of the Phoenix ");


        System.out.println("Initial stack of books : ");
        for (String book : stackOfBooks) {
            System.out.println(book);
        }

        System.out.print("Do you want to add another book or find and retrieve a book from current stack? (add/find): ");
        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("add")) {
            System.out.print("Enter the book title you want to add: ");
            String newBook = scanner.nextLine().trim();
            stackOfBooks.push(newBook);

            System.out.println("Updated stack of books:");
            for (String book : stackOfBooks) {
                System.out.println(book);
            }

        } else if (response.equals("find")) {
            System.out.print("Enter the title of the book you want to find: ");
            String bookToFind = scanner.nextLine().trim();

            while (!stackOfBooks.isEmpty()) {
                String book = stackOfBooks.pop();
                if (book.equalsIgnoreCase(bookToFind)) {
                    foundBook = book;
                    System.out.println("The book is found in the current stack.");
                    break;
                } else {
                    tempStack.push(book);
                }
            }

            while (!tempStack.isEmpty()) {
                stackOfBooks.push(tempStack.pop());
            }


            if (foundBook != null) {
                System.out.println("Retrieved book: " + foundBook);
            } else {
                System.out.println("Book not found in the stack.");
            }

            System.out.println("Updated stack of books:");
            for (String book : stackOfBooks) {
                System.out.println(book);
            }
        }

    }
}
