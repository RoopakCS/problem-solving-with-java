import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, res = 0, rem, digit;

        System.out.print("Enter a number: ");

        num = sc.nextInt();
        temp = num;
        digit = (int) (Math.log10(num) + 1);
        while (temp > 0) {
            rem = temp % 10;
            res += Math.pow(rem, digit);
            temp /= 10;
        }
        if (res == num) {
            System.out.print(num + " is an armstrong number");
        } else {
            System.out.print(num + " is not an armstrong number");
        }
        sc.close();
    }
}
