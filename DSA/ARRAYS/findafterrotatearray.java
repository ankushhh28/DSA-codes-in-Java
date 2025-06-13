public class findafterrotatearray {
    public static void reverse(int nums[], int i, int j) {
        // Reverse funcion
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int nums[], int k) {
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static int searchelement(int nums[], int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (num[mid] == key)
                return mid;
            else if (num[mid] < key) { // right side search
                start = mid + 1;
            } else if (num[mid] > key) { // left side search
                end = mid - 1;
            }
        }

        return -1;
    }

}

public static void main(String args[]) {
    int nums[] = { 0, 1, 2, 4, 5, 6, 7 };
    int k = 3;
    int target = 0;
    if (searchelement(nums, target) == -1) {
        System.out.println(searchelement(nums, target));
    } else {
        rotate(nums, k);
        System.out.println(searchelement(nums, target));
    }

}
