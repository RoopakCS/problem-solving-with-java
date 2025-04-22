import java.util.Arrays;

public class CommonPrefix {
    public static StringBuilder longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return sb;
            }
            sb.append(first.charAt(i));
        }
        return sb;
    }

    public static void main(String[] args) {
        String[] words = { "flower", "flow", "fly" };
        System.out.println("The longest common prefix is: " + longestCommonPrefix(words));
    }
}
