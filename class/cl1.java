// class calculator
// {
//     public int add(int n1,int n2)
//     {
//        int  result=n1+n2;
//        return result;
//     }
// }
// public class cl1 
// {
//     public static void main(String[] args)
//     {
//         calculator calc=new calculator();
//         int r=calc.add(4,5);
//         System.out.println(r);
//     }
// }
class calculator
{
    int result=0;
   public int add (int n)
   {
      result=result+n;
      return result;
   }
   public int sub(int n)
   {
      result=result-n;
      return result;
   }
}
   public class cl1
   {
     public static void main(String[] args)
    {
         calculator calc=new calculator();
         int result=calc.add(5);
         int result1=calc.sub(4);
         System.out.println(result);
         System.out.println(result1);
    }
   }
