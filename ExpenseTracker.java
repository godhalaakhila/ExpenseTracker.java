import java.util.Scanner;

public class ExpenseTracker {

    static double[] expenses = new double[10];  // Array to hold expenses (can store up to 10 expenses)
    static int expenseCount = 0;  // Number of expenses entered
    static Scanner scanner = new Scanner(System.in);  // Scanner object to get user input

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    viewTotalExpenses();
                    break;
                case 4:
                    System.out.println("Exiting the Expense Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\nExpense Tracker Menu:");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. View Total Expenses");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add an expense
    public static void addExpense() {
        if (expenseCount >= expenses.length) {
            System.out.println("Expense list is full. Cannot add more expenses.");
        } else {
            System.out.print("Enter the expense amount: $");
            double expense = scanner.nextDouble();
            scanner.nextLine();  // Clear the buffer

            expenses[expenseCount] = expense;
            expenseCount++;
            System.out.println("Expense added successfully.");
        }
    }

    // Method to view all expenses
    public static void viewExpenses() {
        if (expenseCount == 0) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.println("\nList of Expenses:");
            for (int i = 0; i < expenseCount; i++) {
                System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
            }
        }
    }

    // Method to view the total of all expenses
    public static void viewTotalExpenses() {
        if (expenseCount == 0) {
            System.out.println("No expenses recorded yet.");
        } else {
            double total = 0;
            for (int i = 0; i < expenseCount; i++) {
                total += expenses[i];
            }
            System.out.println("Total Expenses: $" + total);
        }
    }
}
 
    

