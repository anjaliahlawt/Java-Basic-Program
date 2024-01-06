//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users

//declare the class variable as a private. // declara tha class method as a public beacuse we access the class variable

//the get method returns the variable value, and the set method sets the value.

//package encapsulation;
 
class student
{
   private int rollno;
  
   private String name;

   public void setRollno(int a)
    {
      rollno=a;
    }
    public void setName(String b)
    {
      name=b;
    }
   public int getRollno()
    {
     return rollno;
    }
    public String getName()
    {
     return  name;
    }
}
public class enc 
{
     public static void main(String[] args)
    {
        student obj=new student();
        obj.setRollno(2);
        obj.setName("anjali");
        System.out.println("roolno is"+" "+obj.getRollno()+" "+"and name is"+" "+obj.getName()) ;   
    }

}
