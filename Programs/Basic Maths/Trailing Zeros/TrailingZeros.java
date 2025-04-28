import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        int count = 0, i = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n / i > 0) {
            count += n / i;
            i *= 5;
        }
        System.out.printf("The trailing zeros of %d! is %d", n, count);
        sc.close();
    }
}
