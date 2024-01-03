/*public class reversestring 
{
    public static void main(String[] args)
     {
        String name="anjali";
        String s="";
        int n =name.length();
        for(int i=0;i<n-1;i++)
        {
            s=name.charAt(i)+s;
        }
        System.out.println(s);
    }
}
*/


//2 method
public class reversestring
{
   public static void main(String[] args) 
   {
       String name="anjali";
       StringBuffer name1= new StringBuffer();
       name1.append(name);
       name1.reverse();
       System.out.println(name1);
   }
}