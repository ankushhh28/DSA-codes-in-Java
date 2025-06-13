public class typepromotion2 {
    public static void main(String args[]) {
        int a = 20;
        float b = 30.06f;
        long c = 25;
        double d = 40;

        int ans = (int) (a + b + c + d); // lossy converion from double to int
        System.out.println(ans);

    }

}
