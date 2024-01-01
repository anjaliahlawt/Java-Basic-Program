 class student
{
   int rollno;
   String name;
   int marks;
}

public class arrayobject 
{
   public static void main(String[] args)
   {
       student s1=new student();
       s1.rollno=1;
       s1.name="anjali";
       s1.marks=99;

       student s2=new student();
       s2.rollno=2;
       s2.name="vishal";
       s2.marks=90;

       student []students=new student[2];
       students[0]=s1;
       students[1]=s2;

       for(int i=0;i<students.length;i++)
       {
         System.out.println("rollno"+" "+students[i].rollno+" "+"name"+" " +students[i].name+" "+"marks"+students[i].marks+";");
        
       }
   }
    
}