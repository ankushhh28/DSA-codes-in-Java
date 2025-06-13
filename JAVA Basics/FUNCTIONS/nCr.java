import java.util.*;

public class nCr{
    public static int FACT(int num) { // parameters or formal parameters

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter r: ");
        r= sc.nextInt();

        int nfactorial = FACT(n);
        int rfactorial = FACT(r);
        int n$r = FACT(n-r);
        System.out.print("nCr = " + nfactorial/(rfactorial*n$r));
    }

}
