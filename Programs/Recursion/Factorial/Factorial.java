import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Factorial of " + num + " is: " + factorial(num));
        sc.close();
    }
}
