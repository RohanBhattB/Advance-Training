public class bubblesort
{
    public static void main(String[] args) {
        
        int arr[]={5,9,0,0,5,1,3,2};
        res(arr);

    }
    public static void res(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for(int nums=0;nums<arr.length-1;nums++)
        {
            if(arr[nums]==arr[nums+1])
            {
                continue;
            }
            else
            System.out.print(arr[nums]+" ");
        }
        
    }
}