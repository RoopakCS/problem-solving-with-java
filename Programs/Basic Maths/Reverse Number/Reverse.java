import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        int num, rem, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            res = res * 10 + rem;
            temp /= 10;
        }
        System.out.println("The reversed number is: " + res);
        sc.close();
    }
}
