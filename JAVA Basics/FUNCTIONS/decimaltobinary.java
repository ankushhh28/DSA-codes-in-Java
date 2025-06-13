public class decimaltobinary {
    public static void decimalconvertor(int n) {
        int binary = 0;
        int number = n;
        int rem, power = 0;
        while (n > 0) {
            rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, power));
            power++;
            n = n / 2;
        }
        System.out.print("Binary form of " + number + ":" + binary);
    }

    public static void main(String[] args) {
        decimalconvertor(4);
    }

}
