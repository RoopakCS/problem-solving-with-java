public class ReverseString {
    public static String reverse(String str, String result, int length) {
        if (length < 0) {
            return result;
        }
        result = result + str.charAt(length);
        return reverse(str, result, length - 1);
    }

    public static void main(String[] args) {
        String str = "Recursion";
        String result = "";
        int length = str.length() - 1;
        System.out.println(reverse(str, result, length));
    }
}
