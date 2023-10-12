public class duplicate 
{
    public static void main(String[] args) 
    {
       int[]arr={2,5,7,6,5,2,3,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    
}
