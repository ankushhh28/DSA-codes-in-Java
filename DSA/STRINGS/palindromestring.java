public class palindromestring {
    
    public static boolean palindorme(String city) {
        int i = 0;
        int j = city.length() - 1;

        while (i <= j) {
            if (city.charAt(i) != city.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        String city = "moon";
        System.out.println("Palindrome or not-");
        System.out.println(palindorme(city));
    }
}
