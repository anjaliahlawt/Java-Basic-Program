// 1.this keyword refers to the current object inside a method or constructor






//package thiskeyword;
 class a
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
