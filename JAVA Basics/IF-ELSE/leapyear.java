v import java.util.*;

public class leapyear {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        year= sc.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("This is a Leap Year");
                }
                else
                {
                    System.out.println("This is not a Leap Year");
                }
            }
            else
            {
                System.out.println("This is a Leap Year");
            }
            
        }
        else
        {
            System.out.println("This is not a Leap Year");
        }
    }

}
