public class Matrix {
    public static boolean isDiagonal(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUpperTriangular(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j && arr[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isLowerTriangular(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j && arr[i][j] != 0) { 
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSymmetric(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[i][j] != arr4[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isTeoplitz(int[][] arr5) {
        return true;
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 3, 0, 0, 0, 0, }, { 0, 3, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 5 } };
        int[][] arr2 = { { 1, 7, 9 }, { 0, 3, 11 }, { 0, 0, 5 } };
        int[][] arr3 = { { 1, 0, 0 }, { 5, 3, 0 }, { 6, 9, 7 } };
        int[][] arr4 = { { 2, 3, 6 }, { 3, 4, 5 }, { 6, 5, 9 } };
        // int[][] arr5 = {{1, 2, 3, 4}, {5, 1, 2, 3}, {6, 5, 1, 2}, {7, 6, 5, 1}};
        System.out.println("Diagonal: " + isDiagonal(arr1));
        System.out.println("Upper Triangular: " + isUpperTriangular(arr3));
        System.out.println("Lower Triangular: " + isLowerTriangular(arr2));
        System.out.println("Symmentric: " + isSymmetric(arr4));
    }
}
