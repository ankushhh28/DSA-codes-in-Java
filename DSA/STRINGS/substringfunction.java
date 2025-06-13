public class substringfunction {

    public static String findsubstring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println("Substring--> " + findsubstring(str, 0, 5));
        // in-built function for finding substring
        System.out.println("Substring--> " + str.substring(0, 5)); // ei(non-inclusive)
    }
}
