public class selectionsort {
    public static void main(String[] args) {
        int arr[]={5,9,1,6,3,8,7};
        int sp=0;
        int min=0;
        for(int i=0;i<arr.length;i++)
        {
            int min_index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
    }
}
