
import java.util.*;
public class divisible {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,8,9,10,11,12,21,27};
        int max=0;
        List<Integer> number=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1){
                continue;
            }
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%arr[i]==0)
                count++;
            }
            if(count>max){
            max=count;
            number.add(i);
        }
        else if(count==max)
        {
            number.add(i);
        }
        }
        for(int index:number)
        System.out.println("index: "+arr[index]+" count: "+max);
    }
}
