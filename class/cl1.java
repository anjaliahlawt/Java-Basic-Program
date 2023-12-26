class calculator
{
    public int add(int n1,int n2)
    {
       int  result=n1+n2;
       return result;
    }
}
public class cl1 
{
    public static void main(String[] args)
    {
        calculator calc=new calculator();
        int r=calc.add(4,5);
        System.out.println(r);
    }
}
