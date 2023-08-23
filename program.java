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
//program 6:take input of two numbers and print thr sum
/*import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        int num1.num2,sum;
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
         num1=input.nextInt();
         num2=input.nextInt();
        sum=num1+num2;
        System.out.println("the sum is" + sum);
        input.close();
    }
}
*/
//program7:swap two number
/*public class program{
    public static void main(String[] args){
       int a=2,b=3,c=0;
       c=a;
       a=b;
       b=c;
       System.out.println("a is" + a+ " "+ "b is" +
       b);
    }
}
*/
//program 8 swap number using function
/*public class program{
    public static void main(String[] args) {
        swap(2,3);
    }
    static void swap(int a,int b){
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("a is " + a + "b is"+ b);
    }
}
*/
// progra:9 prime  number
/*import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        System.out.println("entr the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for( int i=1;i<=n;i++)
        if(n%i==0){
            count++;
             }
         if(count==2){
            System.out.println("prime number");
         }
         else{
            System.out.println("not prime");
         }
         input.close();
    }
}
*/
// program 10 :armstrong number
/*import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        System.out.println("enetr the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rem,arm=0;
        int c=n;
        while(n!=0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("is an armstrong number");
        }
        else{
            System.out.println("is not an armstrong number");
        }
        input.close();
    }
}
*/