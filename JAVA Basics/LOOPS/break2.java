import java.util.Scanner;

// keep entering numbers till user enters a multiple of 10
public class break2 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            num= sc.nextInt();
            System.out.println(num);
            if(num%10==0)
            break;
        }while(true);
        System.out.println("Loop Ends");
        sc.close();
    }
}
