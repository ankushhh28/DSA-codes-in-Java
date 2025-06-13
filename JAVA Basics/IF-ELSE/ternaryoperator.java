import java.util.*;

// CHECK EVEN ODD NO. USING TERNARY OPERATOR(?:)
public class ternaryoperator {

    public static void main(String[] args){
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Number: ");
        number = sc.nextInt();

        String type= (number%2==0)?"Even Number":"Odd Number";  // TERNARY OPERATOR USED
        System.out.println(type);
    }
    
}
