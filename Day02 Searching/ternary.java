

public class ternary{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        ty(arr,key);
    }
    public static void ty(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid1=low+(high-low)/3;
            int mid2=high-(high-low)/3;

            if(arr[mid1]==key)
            {
                System.out.println("Target Found at: "+mid1);
                break;
            }
            else if(arr[mid2]==key)
            {
                System.out.println("Target Found at"+mid2);
            }
            else if(arr[mid1]>key)
            {
                high=mid1-1;
            }
            else if(arr[mid2]<key)
            {
                low=mid2+1;
            }
            else{
                low=mid1+1;
                high=mid2-1;
            }
        }
    }
}