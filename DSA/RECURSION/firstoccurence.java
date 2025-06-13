public class firstoccurence {
    public static int Firstoccurence(int arr[], int key, int i) {
        if (i == arr.length) // not found case
            return -1;
        if (arr[i] == key)
            return i;

        return Firstoccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        int index= Firstoccurence(arr, 5, 0);
        if(index==-1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index: "+index);
    }
}
