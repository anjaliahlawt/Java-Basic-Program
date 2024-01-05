public class stringbuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer name= new StringBuffer("anjali");
        System.out.println(name);
        name.append("ahlwat");
        name.delete(0,2);
        name.insert(0,'s');
        name.replace(2,4,"nal");
        System.out.println(name);
    }
}