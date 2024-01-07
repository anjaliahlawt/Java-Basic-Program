// a constructor through which we can pass one or more 



class a
{ int x, y;
    a(int a,int b)
    {
       x=a;y=b;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}

public class prametrizedconstructor 
{
    public static void main(String[] args) 
    { 
       a obj=new a(10,2);
       obj.show();

    }
}
