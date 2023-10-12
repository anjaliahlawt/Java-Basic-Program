
import java.util.*;
public class SearchIn2dArray 
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
        int target=72;
        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
       
    }
    static int[] search(int[][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
