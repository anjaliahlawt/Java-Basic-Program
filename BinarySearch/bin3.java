//find the smallest letter greater thean the target
public class bin3 
{
    public static void main(String[] args)
    {

        char []letter={'c','d','f','j'};
        char target='j';
        char ans=smallest(letter,target);
        System.out.println(ans);

    }
     static char smallest(char[]letter,char target)
    {
       
        int start=0;
        int end =letter.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(letter[mid]<=target)
            {
                start=mid+1;
            }
            else 
            {
               end=mid-1;
            }
          
        }
         return letter[start % letter.length];
    }
 }
 