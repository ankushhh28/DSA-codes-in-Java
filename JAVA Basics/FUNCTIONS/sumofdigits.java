public class sumofdigits {

    public static void sumofdigit(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum = sum + last;
            n = n / 10;

        }
        System.out.println("Sum of Digits for " + num + " = " + sum);
    }

    public static void main(String[] args) {
        sumofdigit(789);
    }

}
