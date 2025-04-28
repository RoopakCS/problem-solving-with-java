import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            ans += a;
        }

        System.out.println(a + " x " + b + " = " + ans);

        sc.close();
    }
}
