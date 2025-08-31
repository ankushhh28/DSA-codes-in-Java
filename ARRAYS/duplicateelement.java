import java.util.Arrays;
// ARRAY ASSIGNMENT QUESTION 1
public class duplicateelement {

    public static boolean checkduplicate(int nums[]) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(checkduplicate(nums));

    }

}
