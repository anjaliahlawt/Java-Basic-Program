/*constructor is a special type of method whose name is same as a class name.
  the main purpose of constructor is intialized the object.
  every java class has a constuctor.
  a constructor is automaticaaly called at the time of object creation.
  a constuctor never a return type  including void.

*/







//package constructor;
class a
{
    int i;
    String name;
    a()
    {
       i=12;
       name="anjali";
       System.out.println(i+name);
    }

    void show ()
    {
        System.out.println(i+name);
    }
}

public class con1 
{
    public static void main(String[] args) 
    {
        a obj=new a();
        obj.show();
    }
}
