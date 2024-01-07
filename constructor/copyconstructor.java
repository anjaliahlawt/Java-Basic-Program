//whenever we pass object refernce to the constructor 

class a
{
  int a; String b;
  a()
  {
     a=12;b="anjali";

  }
  a(a ref)
  {
     a=ref.a;
     b=ref.b;
     System.out.println(a+" "+b);
  }
}

public class copyconstructor
{
    public static void main(String[] args) 
    {
        a obj=new a();
        a obj1=new a(obj);
    }
}
