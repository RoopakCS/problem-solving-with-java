import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum) {
            System.out.print(num + " is a perfect number");
        } else {
            System.out.print(num + " is not a perfect number");
        }
        sc.close();
    }
}
