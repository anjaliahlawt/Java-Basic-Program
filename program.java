//program 1: To find out the character is uppercase and lowercase
/*import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        System.out.println("enetr the charcter");
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if(ch>='a'&&ch<='z'){
            System.out.println(" the character is lowecase");
        }
        else{
            System.out.println("the character is uppercase");
        }
        input.close();
    }
    
}*/
//program 2.fibonacci series and print the nth value in fibonnaci series
/*import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        System.out.println("enetr the value");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {
           // System.out.println(a);
           if(i==n){
            System.out.println(a);
           }
         c=a+b;
         a=b;
         b=c;
        }
input.close();
    }
}
*/
//program 3:count the repeated number

/*public class program{
   public static void main(String[] args) {
  
    int a=12321,c=0;
     while(n!=0){
     int rem=a%10;
     
     if(rem==1){
        c++;
 }
  a=a/10;
}
  System.out.println(c);
}
}*/
// program 4:reverse the number
/*public class program{
    public static void main(String[] args) {
        int a=2345,rev=0;
        while(a!=0){
        int rem=a%10;
        rev=rev*10+rem;
         a=a/10;

        }
        
        System.out.println(rev);
    }
     
      
}
*/