import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int num, rem, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while (res < num) {
            rem = num % 10;
            res = res * 10 + rem;
            num /= 10;
        }
        if (res == num || res / 10 == num) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}
