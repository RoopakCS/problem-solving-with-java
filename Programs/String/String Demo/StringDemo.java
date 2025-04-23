
public class StringDemo {
    public static void timeComparision() {
        // String Builder
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(" " + i);
        }
        long endSB = System.nanoTime();
        System.out.println("String Builder Time: " + (endSB - startSB));

        // String
        long startS = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long endS = System.nanoTime();
        System.out.println("String Time: " + (endS - startS));
    }

    public static void equalityCheck() {
        String name = "Roopak";
        String employee = "Roopak";
        System.out.println("Shallow Search: " + name == employee);

        String tenant = new String("Roopak");

        System.out.println("Shallow Comparision: " + (name == tenant));

        System.out.println("Deep Comparision: " + name.equals(tenant));
    }

    public static void stringBuiltInMethods() {
        String str = "lorem ipsum";

        System.out.println("Charater at index 0 is: " + str.charAt(0));
        System.out.println("Does str contains lorem: " + str.contains("lorem"));
        System.out.println("Is str equals to LOREM IPSUM: " + str.equalsIgnoreCase("LOREM IPSUM"));
        System.out.println("Conatinating lorem to str: " + str.concat(" lorem"));
        System.out.println("Index of i: " + str.indexOf("i"));
        System.out.println("Is str empty: " + str.isEmpty());
        System.out.println("Replacing lorem as Hello: " + str.replace("lorem", "Hello"));
        System.out.println("Creating ipsum as a new substring: " + str.substring(6));
        System.out.println("Trimming trailing and leading spaces of str: " + str.trim());
    }

    public static void stringBuilderBuiltInFunctions() {
        StringBuilder sb = new StringBuilder("lorem ipsum");
        System.out.println(sb);
        System.out.println("Deleting charater at 0: " + sb.deleteCharAt(0));
        System.out.println("Converting into string: " + sb.toString());
    }

    public static void main(String[] args) {
        timeComparision();
    }
}