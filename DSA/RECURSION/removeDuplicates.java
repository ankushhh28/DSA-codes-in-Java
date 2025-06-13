public class removeDuplicates {

    // ! Brute force approach...
    public static String removeDuplicatesFromStringWay1(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            int j = i - 1;
            while (j >= 0) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = false;
                    break;
                }
                j--;
            }
            if (flag) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //! Another Approach using Recursion...
    public static void removeDuplicatesFromStringWay2(String str, int idx, StringBuilder result, boolean map[]) {

        // * base case
        if (idx == str.length()) {
            System.out.println(result);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // * duplicate found
            removeDuplicatesFromStringWay2(str, idx + 1, result, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicatesFromStringWay2(str, idx + 1, result.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        // System.out.println(removeDuplicatesFromStringWay1(str));
        removeDuplicatesFromStringWay2(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
