import java.util.*;

public class weekswitchcase {
    public static void main(String[] args) {
        int week_no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any Number to print week name-");
        System.out.println("1.Sunday\n2.Monday\n3.Tuesday\n4.Wednesday\n5.Thursday\n6.Friday\n7.Saturday");

        week_no = sc.nextInt();

        switch (week_no) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Inappropriate Number Selected");

        }
    }

}
