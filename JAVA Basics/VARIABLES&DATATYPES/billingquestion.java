import java.util.*;



public class billingquestion{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        float a,b,c;
        System.out.print("Cost of First Item:");
        a = obj.nextFloat();
        
        System.out.print("Cost of Second Item: ");
        b = obj.nextFloat();

        System.out.print("Cost of Third Item: ");
        c = obj.nextFloat();

       float total = a+b+c;

        System.out.println("Total Cost of Items " +total);
        

        float newtotal= total+(0.18f*total);
        System.out.print("Total bill(incl. gst) " +newtotal);
        
        
    }
}