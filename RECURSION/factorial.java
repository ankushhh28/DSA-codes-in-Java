public class factorial {
    public static int fact(int n){
        if(n==0) // Base case
            return 1;

        int factorial= n*fact(n-1);
        return factorial;
    }
    public static void main(String args[]){
        int n=6;
        System.out.println("Factorial of Number= "+fact(n));
    }
}
