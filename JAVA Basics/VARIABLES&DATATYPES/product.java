import java.util.*;

//PRODUCT OF TWO NUMBERS TAKING USER'S INPUT

public class product {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, product;
        System.out.print("Enter Value of a=");
        a = obj.nextInt();
        System.out.print("Enter Value of b=");
        b = obj.nextInt();

        product = a*b;

        System.out.print("Product of a & b is :");
        System.out.print(product);
        obj.close();
    }
}