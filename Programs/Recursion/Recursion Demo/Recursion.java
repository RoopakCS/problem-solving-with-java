public class Recursion {
    public static void usingLoop() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void usingRecursion(int num) {
        if (num > 100) {
            return;
        }
        System.out.print(num + " ");
        usingRecursion(num + 1);
    }

    public static void main(String[] args) {
        System.out.println("Using Loop");
        usingLoop();
        System.out.println();
        System.out.println("Using Recursion");
        usingRecursion(1);
    }
}
