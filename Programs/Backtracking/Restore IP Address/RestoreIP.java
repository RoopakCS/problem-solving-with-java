import java.util.ArrayList;

public class RestoreIP {
    private static boolean isValid(String current) {
        if (current.isEmpty() || current.length() > 3 || Integer.parseInt(current) > 255
                || (current.startsWith("0") && current.length() > 1)) {
            return false;
        }
        return true;
    }

    private static void restore(ArrayList<String> list, String input, String addr, int segments, int start) {
        if (segments > 3) {
            if (start == input.length())
                list.add(addr);
            return;
        }

        for (int i = start; i < input.length(); i++) {
            String current = input.substring(start, i + 1);
            if (isValid(current)) {
                if (segments == 3) {
                    restore(list, input, addr + current, segments + 1, i + 1);
                } else {
                    restore(list, input, addr + current + ".", segments + 1, i + 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        String input = "25525511132", addr = "";
        int start = 0, segments = 0;
        ArrayList<String> list = new ArrayList<>();
        restore(list, input, addr, segments, start);
        System.out.println(list);
    }
}
