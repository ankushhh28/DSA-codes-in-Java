public class scope {

    public static void methodscope() {
        int s = 4;
    }

    public static void main(String[] args) {
        s = s + 5; // scope of s will be valid till methodscope function
        System.out.println(s);
        {
            int p = 4;
        }
        System.out.println(p); // scope of p will bevalid upto {} only

    }

}
