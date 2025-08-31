import java.util.ArrayList;

public class multiDimensionalList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(6);

        list2.add(3);
        list2.add(6);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);
    }
}
