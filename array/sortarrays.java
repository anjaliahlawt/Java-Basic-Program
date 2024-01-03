import java.util.Arrays;

public class sortarrays 
{
   
 
    public static void main(String[] args)
     {
        int []arr={1,5,2,4,6};
         int n =arr.length;
        // int temp=0;
        // for (int i = 0; i <n; i++) {     
        //     for (int j = i+1; j <n; j++) {     
        //        if(arr[i] > arr[j]) {    
        //            temp = arr[i];    
        //            arr[i] = arr[j];    
        //            arr[j] = temp;    
        //        }     
        //     }     
        // } 
        // System.out.println(Arrays.toString(arr));   
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            
        }
          System.out.println(Arrays.toString(arr));
       
    }
}

