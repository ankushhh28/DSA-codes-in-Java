public class linearsearch {
    public static int linearsearchh(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 30, 40, 50};
        int key = 80;
        int index = linearsearchh(marks, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Number found at index " + index);
    }
}
