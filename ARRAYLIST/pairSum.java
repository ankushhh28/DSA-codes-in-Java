import java.util.ArrayList;
import java.util.HashSet;

public class pairSum {

    // * Brute Force [ Time complexity=> O(N^2)]
    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target)
                    return true;
            }
        }
        return false;
    }

    // ! this approach only works in case of sorted list
    // * Optimal Solution-> using Two-Pointer approach [ Time complexity=> O(N)]
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;

        while (left != right) {
            if (list.get(left) + list.get(right) == target)
                return true;
            else if (list.get(left) + list.get(right) < target)
                left++;
            else
                right--;
        }
        return false;
    }

    // ! no matter list is sorted or not works well for all cases
    // * Hashset approach-> using HashSet [ TC => O(N) , SC => O(N)]
    public static boolean pairSum3(ArrayList<Integer> list, int target) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : list) {
            int pair = target - num;
            if (set.contains(pair)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(20);
        list.add(28);

        System.out.println(pairSum1(list, 16));
        System.out.println(pairSum2(list, 18));
        System.out.println(pairSum3(list, 18));

    }
}