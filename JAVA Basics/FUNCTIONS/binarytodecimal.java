public class binarytodecimal {

    public static void binaryconvertor(int num) {
        int binary = num;
        int last_digit;
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            last_digit = binary % 10;
            decimal = decimal + (last_digit * (int) Math.pow(2, power)); // power function returns always value in
                                                                         // double so typecaste it...
            power++;
            binary = binary / 10;
        }
        System.out.print("Decimal form of " + num + ": " + decimal);

    }

    public static void main(String[] args) {
        binaryconvertor(101);

    }

}
