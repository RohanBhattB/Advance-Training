class maxsubarray{
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,-4};
        int product = subarr(arr);
        System.out.println(product);
        
    }
    public static int subarr(int[] nums)
    {
        int max=0;
        int prod;
        for (int i=0;i<nums.length;i++)
        {
            prod=1;
            for(int j=i;j<nums.length;j++)
            {
                
                prod*=nums[j];
                if(prod>max)
                {
                  max=prod;      
                }
            }
        }
        return max;
    }
}