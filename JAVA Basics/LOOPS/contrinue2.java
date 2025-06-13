import java.util.*;

// display all numbers entered by user except multiples of 10...
public class contrinue2{

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do{  
            num= sc.nextInt();
            if(num%10==0)
            continue;
            System.out.println(num);
            
        }while(true);
        
    }
}
