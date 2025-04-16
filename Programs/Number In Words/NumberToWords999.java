public class NumberToWords999 {

    private static final String[] BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String numberToWords(int num) {
        if (num < 0 || num > 999) {
            return "Number out of range (0-999)";
        }
        if (num == 0) return "Zero";

        StringBuilder words = new StringBuilder();

        if (num >= 100) {
            words.append(BELOW_20[num / 100]).append(" Hundred");
            num %= 100;
            if (num != 0) words.append(" ");
        }

        if (num < 20) {
            words.append(BELOW_20[num]);
        } else {
            words.append(TENS[num / 10]);
            if (num % 10 != 0) {
                words.append(" ").append(BELOW_20[num % 10]);
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        int number = 342;
        System.out.println(numberToWords(number));  // Output: Three Hundred Forty Two
    }
}
