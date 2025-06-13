import java.util.*;

public class timeconvertor {
    public static void main(String[] args) {
        int date, hour, minute;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date: ");
        date = sc.nextInt();
        System.out.print("Enter Hour: ");
        hour = sc.nextInt();
        System.out.print("Enter Minute: ");
        minute = sc.nextInt();
        // GMT--> IST rule- IST=GMT + 5hours & 30minutes
        hour += 5;
        minute += 30;

        if (minute > 60) {
            hour++;
            minute -= 60;
        }
        if (hour > 24) {
            date++;
            hour -= 24;
        }
        System.out.println("Time in IST is- ");
        System.out.println("date:"+date+" hour:"+hour+" minute:"+minute);
    }
}
