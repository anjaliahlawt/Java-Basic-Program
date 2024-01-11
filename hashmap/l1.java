// A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

//package linked list;
import java.util.*;

public class l1 
{
    public static void main(String[] args)
    {
        HashMap<String,String>capitalcities=new HashMap<String,String>();
        capitalcities.put("england","london");
        capitalcities.put("india","delhi");
        capitalcities.get("england");
        capitalcities.remove("england");
        System.out.println(capitalcities);

    }
}
