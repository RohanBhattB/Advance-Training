public class squarebinary {
    public static void main(String[] args) {
        
    
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int key=2;
        binarysearch(arr,key);
    }   
    public static void binarysearch(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
            {
                System.out.println("Found at the position: "+mid);
                key=key*key;
                binarysearch(arr, key);
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
        }
    }
}

