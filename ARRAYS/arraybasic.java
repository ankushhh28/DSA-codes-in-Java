import java.util.*;
public class arraybasic{

    public static void main(String[] args) {
        int marks[]= new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in Array-");
        for(int i=0;i<=2;i++)
        {
            marks[i]= sc.nextInt(); 
        }
        System.out.println("Array values are-");
        for(int i=0;i<=2;i++)
        {
            System.out.print(marks[i]+" ");
        }
        //System.out.println(marks.length);  for finding size of array
    }
}