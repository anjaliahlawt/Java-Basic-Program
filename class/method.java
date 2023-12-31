// //call a method

// public class method 
// {
//     public static void name()
//     {
//       System.out.println("my name anjali");
//     }
  
//     public static void main(String[] args) 
//     {
//        name();
//     }
// }


//method parmeter 
/*public class method
{
  public static void name(String yourname)
  {
     System.out.println(yourname+"ahlawat");
  }

  public static void main(String[] args)
  {
    name("anjali");
    name("vishal");
  }
}*/

//method overloading
//With method overloading, multiple methods can have the same name with different parameters:

public class method
{
    public static  void name(String yourname)
    { 
       System.out.println(yourname+"ahlwat");
    }
    public static void name(int x)
    {
      System.out.println("i am "+x+"year old");
    }
     public static void main(String[] args) 
     {
        name("anjali");
        name(6);
     }
    }