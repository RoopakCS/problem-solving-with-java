import java.util.ArrayList;
import java.util.Scanner;

public class MaintainingTheSortedOrder {
    public static void main(String[] args) {
        // int[] arr = {3, 5, 7, 24, 63};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(24);
        arr.add(63);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // for (int i = 0; i < arr.size(); i++) {
        //     if (num < arr.get(i)) {
        //         arr.add(i, num);
        //         break;
        //     }
        // }

        int left = 0;
        int right = arr.size()-1;
        int pos = arr.size();

        while(left <= right) {
            int mid = (left+right) / 2;
            if (num > arr.get(mid)) {
                left = mid + 1;
            } else {
                pos = mid;
                right = mid - 1;
            }
        }

        arr.add(pos, num);

        System.out.println(arr);
    }
}