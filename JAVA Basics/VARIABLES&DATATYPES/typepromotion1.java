public class typepromotion1 {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        // char c= b-a; lossy conversion from int to char
        System.out.println((int) (a)); // ASCII of a
        System.out.println((int) (b)); // ASCII of b
        System.out.println(b - a); // b-a is an expression and thus it can be treated as int not char

        char ch = 'A';
        byte B = 56;
        short s = 50;
        byte k = (byte) (ch + B + s ); // lossy conversion from int to byte
        System.out.println(k);
    }

}
