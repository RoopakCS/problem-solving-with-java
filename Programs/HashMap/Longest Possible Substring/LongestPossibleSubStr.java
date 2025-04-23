import java.util.HashMap;

public class LongestPossibleSubStr {
    public static void main(String[] args) {

        String input = "abcabcbb";

        int max = 0;
        int left = 0;
        int right;

        HashMap<Character, Integer> position = new HashMap<>();

        for (right = 0; right < input.length(); right++) {
            char current = input.charAt(right);
            if (!position.containsKey(current)) {
                position.put(current, right);
            } else {
                left = Math.max(left, position.get(current) + 1);
                position.put(current, right);
            }
            max = Math.max(max, (right - left) + 1);
        }

        System.out.println("Max: " + max);
        System.out.println(input.substring(left, right));
        System.out.println(input.substring(right));
    }
}
