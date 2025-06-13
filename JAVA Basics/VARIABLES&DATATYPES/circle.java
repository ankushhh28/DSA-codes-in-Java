import java.util.*;

//AREA OF CIRCLE TAKING USER'S INPUT

public class circle {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        float r, area;
        System.out.print("Enter Value of radius:");
        r = obj.nextFloat();

        area = 3.14f * r * r; // in case if f is not written with 3.14 then it gives error bcz it assumes it
                              // as double

        System.out.print("Area of Circle is :");
        System.out.print(area);
        obj.close();
    }
}