public class swappingusingXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        // swapp using XOR operator
        System.out.println("Before Swap> a= " + a + ", b= " + b);
        a = a ^ b; // a= a+b in binary
        b = a ^ b; // b= a-b in binary
        a = a ^ b; // a= a-b in binary
        System.out.println("After Swap> a= " + a + ", b= " + b);
    }

}
