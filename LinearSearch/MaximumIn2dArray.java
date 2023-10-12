  
public class MaximumIn2dArray 
{
    
    public static void main(String[] args) 
    {
        int[][]arr =new int [][]
        {

            {2,4,5,6},
            {42,62,72},
           {80,50,40} ,
           {91,71,51,41}
        };
        System.out.println(max(arr));
      
    }
    static int max(int[][]arr)
    {    int ans;
        ans=arr[0][0];
        for(int i=0;i<arr.length;i++)
        { 
            for(int j=0;j<arr[i].length;j++)
            {    
                if(arr[i][j]>ans)
                {
                    ans=arr[i][j];
                
                }
            }
        }
   
      return ans;
    
    }
}
