public class EvenNumberOfDigit {
    public static void main(String[] args)
     {
         int[]nums={2,2345,65,12345};
         int ans=0;
         for(int i=0;i<nums.length;i++)
         {
            int digit=0;
            while(nums[i]>0)
            {
              digit++;
             nums[i]/=10;
            }
            if(digit%2==0)
            {
                ans++;
            }
         }
         System.out.println(ans);
       
       
    }
  

    
}
