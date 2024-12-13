 // Find the missing numbers find missing
//  numbers in an sorted array with dublicates
public class missingnumber {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,8};
        for(int i=0;i<arr.length-1;i++){   
            int diff=arr[i+1]-arr[i];
            if(diff>1){
                int temp=arr[i];
                while(diff>1){
                    System.out.println(temp+1);
                    temp=temp+1;
                    diff--; 
                }
            }
        }
    }
}
