public class Increasing {
    public static boolean isIncreasing() {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        if (isIncreasing()) {
            System.out.println("The array is increasing");
        } else {
            System.out.println("The array is not increasing");
        }
    }
}
