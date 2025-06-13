import java.util.*;

public class switchcase {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any No.-\n1. For Samosa\n2. For Cold-drink\n3. For Burger" );
        num= sc.nextInt();
        switch(num){
            case 1: 
            System.out.println("ORDER SAMOSA");
            break;
            case 2:
            System.out.println("ORDER COLD-DRINK");
            break;
            case 3:
            System.out.println("ORDER BURGER");
            break;
            default:
            System.out.println("Dream over Hua");

        }

    }

}
