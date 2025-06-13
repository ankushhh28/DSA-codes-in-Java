import java.util.*;

//TYPE CONVERSION --> LOSSY CONVERSION ERROR...

public class lossyconversion {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int a;
        float b;

        System.out.println("Enter Value of a=");
        a = obj.nextFloat();
        // size of float> size of int, that's why it can't be stored in int and gives
        // lossy conversion error
        
        
        System.out.println("Enter Value of b=");
        
        b = obj.nextInt();// here float converts to int that's why type conversion possible

        System.out.println("Vakue of a is :");
       System.out.print(a);

        System.out.print("Vakue of b is :");
        System.out.print(b);
    }
}