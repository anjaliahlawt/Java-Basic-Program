public class s1
{
    public static void main(String[] args) 
    {
        int n=153,rem,arm=0;
        rem=n%10;
        arm=rem*rem*rem+arm;
        n=n/10;
    int c=n;
    if(c==n)
    {
          System.out.println("is an armstrong number");
    }
    else
    {
       System.out.println("is not armstron");
    }

    }
}
