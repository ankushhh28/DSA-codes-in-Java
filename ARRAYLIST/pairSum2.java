import java.util.ArrayList;

public class pairSum2 {

    // * Two-pointer Approach on Rotated Sorted Array

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // * find pivot(break point)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i + 1;
            }
        }

        // * check pivot is updated or not if not it means sorted list
        pivot = pivot == -1 ? 0 : pivot;

        int left = pivot, right = (pivot - 1 + n) % n; // & concept-> (n+r-1) % n= r-1

        while (left != right) {
            if (list.get(left) + list.get(right) == target)
                return true;
            else if (list.get(left) + list.get(right) < target)
                left = (left + 1) % n;
            else
                right = (n + right - 1) % n;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        System.out.println(list);
        System.out.println(pairSum(list, 9));
    }
}
