import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("The sum of natutals numbers till " + num + " is: " + sum(num));
    }
}
