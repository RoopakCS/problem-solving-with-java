import java.util.*;

public class SetOperations {
    public static ArrayList<Integer> union(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>(arr1);
        for (int val : arr2) {
            if (!res.contains(val)) {
                res.add(val);
            }
        }
        return res;
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>(arr1);
        for (int val : arr1) {
            if (res.contains(val)) {
                res.add(val);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 5, 9, 33, 56));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(9, 5, 16, 33, 12));
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}
