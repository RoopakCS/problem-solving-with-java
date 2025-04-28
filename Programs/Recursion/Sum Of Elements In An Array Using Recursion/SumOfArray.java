public class SumOfArray {
    public static int sum(int[] arr, int size) {
        if (size < 0) {
            return 0;
        }
        return sum(arr, size - 1) + arr[size];
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 6, 3, 3 };
        int size = arr.length - 1;
        System.out.println("Sum of the array is: " + sum(arr, size));
    }
}
 