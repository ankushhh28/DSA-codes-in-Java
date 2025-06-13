public class findAllPermutations {

    public static void findPermutations(String str, String ans) {

        // * Base case: when str gets empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.print("Total Permutations of (" + str + "): ");
        findPermutations(str, "");
    }
}
