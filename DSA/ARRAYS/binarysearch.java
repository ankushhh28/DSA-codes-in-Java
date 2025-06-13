public class binarysearch {
    public static int binarysearchmethod(int num[],int key){
    
        int start= 0;
        int end= num.length-1;
        
        while(start<=end){
            int mid= (start+end)/2;
            //comparisons
            if(num[mid]==key)
                return mid;
            else if(num[mid]<key){  //right side search
                start= mid+1;
            }
            else if(num[mid]>key)
            {  //left side search
                end=mid-1;
            } 
        }

        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 7, 9, 14, 15, 17, 19, 23, 27 };
        int key = 15;
        int index=binarysearchmethod(num, key);
        if(index==-1)
        System.out.println("Element not Found in Array");
        else
        System.out.println("Element found at index: "+index);
    }

}
