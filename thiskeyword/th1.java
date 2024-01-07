// 1.this keyword refers to the current object inside a method or constructor


//package thiskeyword
/*class a
 {
    void show()
    {
       System.out.println(this);

    }
 }
public class th1
{
    public static void main(String[] args) 
    {
        a obj=new a();
        System.out.println(obj);
        obj.show();
    }
}
*/


// 2. whenever the name of instance and local variable both are same then our runtime env.jvm gets confused that which one is local variable and which one is instance variable to avoid this problem we should use this keyword 

/* 
class b
{
   int a;
   b(int a)
   {
      this.a=a;
   }
   void show()
   {
     System.out.println(a);
   }
}

public class th1
{
    public static void main(String[] args) 
    {
        b obj=new b(10);
       
        obj.show();
    }
}
*/

// 3.it is also used  when we want to call the default constructor of its own class.
 /* 
class c
{
    c()
    {
       System.out.println("anjali");
    }

    c(int a)
    {
        this();
        System.out.println(a);
    }
}
public class th1
{
   public static void main(String[] args) 
    {
      c obj=new c(12);
    }
}
*/
//4.it is also parameterized constructor of its own class.

class d
{
   d()
   {
      this(10);
   }
   d(int a)
   {
      System.out.println(a);
   }
}
public class th1
{
  public static void main(String[] args)
  {
     d obj=new d() ;
  }
}



