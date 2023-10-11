public class linearSearch
 {
    public static void main(String[] args) {
        int []nums={1,2,4,5};
        int target=2;
        int ans=search(nums,target);
        System.out.println(ans);
    }
    static int search(int[]arr,int target)
    {
       if(arr.length==0)
       {
        return -1;
       }
       for(int i=0;i<arr.length;i++)
       {
       
        if(arr[i]==target)
        {
            return i;
        }
       }
       return -1;
    }
}
