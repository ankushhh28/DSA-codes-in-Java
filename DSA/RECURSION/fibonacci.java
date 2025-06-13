public class fibonacci {
    public static int nthfibonacci(int n) {
        if (n == 0 || n == 1) { //base cases
            return n;
        }

        int fnm1 = nthfibonacci(n - 1);
        int fnm2 = nthfibonacci(n - 2);
        int fn = fnm1 + fnm2;

        return fn;
    }

    public static void main(String args[]){
        int n= 6;
        System.out.println(n+"th fibonacci number is "+nthfibonacci(n));
    }
}
