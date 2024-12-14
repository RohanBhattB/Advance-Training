public class jumpsearch {
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,12,13,14,16,18,19,20,21,22,23,26,29,33,36,39};
        int n=arr.length;
        int key=23;
        int jump=(int)Math.sqrt(n);

        for(int i=0;i<n;i+=jump)
        {
            if(arr[i]==key)
            {
                System.out.println("THE KEY IS FOUND AT THE INDEX: "+i);
            }
            else if(arr[i]>key)
            {
                linearsearch(i-jump, i,key,arr);
                // for(int j=i-jump;j<i;j++)
                // {
                //     if(arr[j]==key)
                //     {
                //         System.out.println("THE KEY IS FOUND AT THE INDEX: "+j);
                //         System.exit(0);
                //     }
                // }
            }
            else if((i+jump)>=n)
            {
                linearsearch(i, n-1,key,arr);
            }

        }


    }
    public static void linearsearch(int start,int end,int key,int arr[])
    {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found at index"+i);
                System.exit(0);
            }
        }
        System.out.println("NOthing Found");
    }

    
}
