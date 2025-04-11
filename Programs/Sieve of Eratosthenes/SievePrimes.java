import java.util.Scanner;

public class SievePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int input = sc.nextInt();

        boolean[] primes = new boolean[input];

        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < primes.length; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}