public class continue_loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue; // its main funtion is to skip the iteration...
            System.out.println(i);
        }
    }

}
