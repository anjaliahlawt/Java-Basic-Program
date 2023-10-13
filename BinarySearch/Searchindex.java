
public class Searchindex 
{

    public static void main(String[] args)
     {
        int[]arr={2,3,4,5,6,11,12,13,14,16};
        int target=12;
        int ans=search(arr,target);
        System.out.println(ans);


    }
    static int search(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
           int mid=(start+end)/2;
           if(target<arr[mid])
           {
               end=mid-1;
           }
           else if(target>arr[mid])
           {
              start=mid+1;
           }
           else
           {
              return mid;
           }
        }
        return -1;
    }
}
