package ADTDemo;
public class ADT {
    static int size = 10;
    static int idx = 0;

    public static void add(int arr[], int num) {
        if (idx <= size) {
            arr[idx] = num;
            idx++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static void remove(int arr[]) {
        if(size > 0) {
            size--;
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void get(int arr[], int idx) {
        System.out.println(arr[idx]);
    }

    public static int getSize() {
        return size;
    }

    public static void main(String[] args) {
        int[] arr = new int[size];
        add(arr, 1);
        add(arr, 2);
        add(arr, 3);
        add(arr, 4);
        add(arr, 5);
        add(arr, 6);
        add(arr, 7);
        add(arr, 8);
        add(arr, 9);
        add(arr, 10);
        remove(arr);
        remove(arr);
        remove(arr);
        remove(arr);
        remove(arr);
        get(arr, 2);
        System.out.println("The size of the array is: " + getSize());
        getSize();
        for (int i=0; i<=size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}