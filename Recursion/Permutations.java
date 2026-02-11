public class Permutations {

    public static void printPerm(String str, String permutation) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        // Recursive Case
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            // Remove current character from original string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            printPerm(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPerm(str, "");
    }
}
