import java.util.Scanner;

public class CubeRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextInt();
        double start = 1;
        double end = num;
        double mid;
        double ans = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            double cube = mid * mid * mid;

            if (cube > num) {
                end = mid;
            } else if (cube < num) {
                start = mid;
            } else if (cube == num) {
                ans = mid;
                break;
            }
        }

        System.out.print("The cube root of " + (int) num + " is " + ans);
        sc.close();
    }
}
