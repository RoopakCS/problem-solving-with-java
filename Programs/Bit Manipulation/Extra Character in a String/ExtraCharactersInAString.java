public class ExtraCharactersInAString {
    public static void main(String[] args) {
        String str1 = "abce";
        String str2 = "abcde";

        char result = 0;

        String concat = str1 + str2;
        char[] chars = concat.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            result = (char) (result ^ chars[i]);
        }

        System.out.println("The extra character is: " + result);
    }
}
