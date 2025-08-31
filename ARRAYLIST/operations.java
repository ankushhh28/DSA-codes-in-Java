import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // * add Element
        list.add(2);
        list.add(7);

        // * add Element at Index
        // list.add(1,6);
        // System.out.println(list);

        // * get Element
        // System.out.println(list.get(0));

        // * remove Element
        list.remove(0);
        // System.out.println(list.get(0));

        // * set Element at index n
        list.add(4);
        list.set(0, 5);
        System.out.println(list.get(0));

        // * contains Element
        System.out.println(list.contains(5));

    }
}