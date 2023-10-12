public class MaximumValue 
{
     public static void main(String []args)
   {
    int[]arr={2,4,5,1};
    System.out.println(max(arr));
   } 
   static int max (int []arr)
   {
        int ans;
        ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>ans)
           {
               ans=arr[i];
           }
   
        }
       return ans;
    }
}

