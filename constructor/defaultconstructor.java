//a constructoir which does  not have any parmeter .





class a
{ 
    int a;String name;boolean c;
//    a()
//    {
//       a=10;
//       name="anjali";
//       c=true;
//    }
    void display()
   {
      System.out.println(a+" "+name+" "+c);
   }
}

public class defaultconstructor 
{
    public static void main(String[] args)
    {
        a obj=new a();
        obj.display();
    }
}
