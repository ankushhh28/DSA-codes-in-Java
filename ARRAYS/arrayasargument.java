public class arrayasargument {

    public static void update(int marks[]) { // arrays always pass as an argument by call by refrence
        marks[0] = 5;
        marks[1] = 6;
        marks[2] = 7;
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3 };
        System.out.println("Marks before function call: ");
        System.out.println("marks[0]=" + marks[0] + ",marks[1]=" + marks[1] + ",marks[2]=" + marks[2]);
        update(marks);

        System.out.println("Marks after function call: ");
        System.out.print("marks[0]=" + marks[0] + ",marks[1]=" + marks[1] + ",marks[2]=" + marks[2]);
    }

}
