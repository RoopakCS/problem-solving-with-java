import java.util.Scanner;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1, num2, choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            if (choice == 5)
                return;
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The answer is: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("The answer is: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("The answer is: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("The answer is: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
