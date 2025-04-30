public class GcdOfANumber {
    // public static int gcd(int a, int b) {
    // if (a == 0) {
    // return b;
    // }
    // return gcd(b % a, a);
    // }

    // public static void main(String[] args) {
    // int a = 35, b = 15;
    // System.out.printf("The GCD of %d and %d is: %d", a, b, gcd(a, b));
    // }

    public static void main(String[] args) {
        System.out.println(hcf(35, 49));
    }

    public static int hcf(int a, int b) {
        if (b == 0)
            return a;

        return hcf(b, a % b);
    }
}
