//program 1.Write a program to print whether a number is even or odd, also take input from the user

/*import java.util.Scanner;
  public class assignments
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%2==0){
            System.out.println(n+"is an even number");
        }
        else{
            System.out.println( n+ "is odd number");
        }
        input.close();
    }
  }*/
//program 2.Take name as input and print a greeting message for that particular name.
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner input=new Scanner(System.in);
        String n=input.next();
        System.out.println("hello!"+ n);
         input.close();
    }
}
*/
// program.3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter the value P and R ,T");
        Scanner input=new Scanner(System.in);
        int p=input.nextInt();
        int r=input.nextInt();
        int t=input.nextInt();
        int SI=(p*r*t)/100;
        System.out.println(SI);
        input.close();
    }
}
*/
//program.4Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
/* 
import java.util.Scanner;

public class assignments {
    public static void main(String[] args) {
        System.out.println("enetr the operator");
        int a = 12, b = 3;
        
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);

        if (operator=='+') {
             System.out.print(a+b);
          
        }
        if (operator == '-') {
            System.out.print(a - b);
        }
        if (operator == '*') {
            System.out.print(a * b);
        }
        if (operator == '/') {
            System.out.print(a / b);
        }
        input.close();
        
    }
}
*/
//program 5.Take 2 numbers as input and print the largest number.
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enetr trhe two number");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
        input.close();
    }
}
*/
//program 6.Input currency in rupees and output in USD.
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enetr the rupees");
        Scanner input=new Scanner(System.in);
        double rup=input.nextInt();
        rup=rup*0.012;
        System.out.println(rup);
        input.close();
       
    }
}
*/
//program 7.To calculate Fibonacci Series up to n numbers.
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter the numeber");
        Scanner input=new Scanner(System.in);
        int a=0,b=1,c;
        int n=input.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(a);
        c=a+b;
        a=b;
        b=c;
        }
        input.close();
    }
}
*/
//program.8//To find out whether the given String is Palindrome or not

/*public class assignments{
    public static void main(String[] args) {
       String name="abba";
       int i=0,j=name.length()-1;
       while(i<j){
        if(name.charAt(i)!=name.charAt(j)){
            System.out.println("not a palindrome");
            System.exit(0);
        }
        i++;
        j--;
       }
       System.out.println("is a palindrome");


    }
}
*/
//program.9Fibonacci Series In Java Programs
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("eneter the digit");
        int a=0,b=1;
        Scanner input=new Scanner(System.in);  
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println(a);
        int c=a+b; 
        a=b;
        b=c;
    }
        input.close();     
    }
*/
//program 10.Input a number and print all the factors of that number (use loops).
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("this is the factors of"+ i);
            }
            input.close();
        }
        
    }
}
*/
//program 11.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("enter the number");
     int n=input.nextInt();
     int count=0;
     for(int i=1;i<=n;i++){
        count=count+i;
    }
    System.out.println(count);        
    }
}*/
//program 12.Addition Of Two Numbers
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter the two number");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=0;
        sum=num1+num2;
        System.out.println(sum);
    }
}
*/
//program 13.Factorial Program In Java
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            count=count*i;
        }
        System.out.println(count);
    }
}
*/
//program 14.Calculate Average Of N Numbers
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0,avg;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        avg=sum/n;
        System.out.println(avg);
    }
}
*/
//program 15.Calculate Discount Of Product
/*Uimport java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the origuinal price of the product");
        float n=input.nextFloat();
        System.out.println("enter the discount precntsge");
          float d=input.nextFloat();
        float discountamount=(d/100)*n;
        float finalprice=n-discountamount;
        System.out.println("discount amount is"+discountamount);
        System.out.println("final price is "+finalprice );
        
    }
}
*/
//program 16.Power In Java
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the digit");
        double d=input.nextInt();
        System.out.println("enter the powerof value");
        double p=input.nextInt();
        double result=Math.pow(d,p);
        System.out.println(d+"is raised to be the power"+p+"is"+result);
    }
}
*/
//program 17.Calculate CGPA Java Program
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         double english,hindi,math,science,gk,cgpa,result;
        hindi=6.7;
        english=8.9;
        math=9.5;
        science=9.7;
        gk=7.8;
        cgpa=(6.7+8.9+9.5+9.7+7.8)/5.0;
        
         double result=9.5*cgpa;
        System.out.println(result);
    }
}
 */
//program 18.Compound Interest Java Program
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter thevalue of every digit");
        double p=input.nextDouble();
        double r=input.nextDouble();
        double n=input.nextDouble();
        double a=p*(Math.pow((1+r/100),n));
        System.out.println(a);
    }
}
*/
//program 19.Calculate Average Marks
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the all values");
        int a=input.nextInt();
        int b=input.nextInt();
         int c=input.nextInt();
         int d=input.nextInt();
        int avg=(a+b+c+d)/4;
        System.out.println(avg);

    }
}
*/
//program 20.Armstrong Number In Java
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("eneter the number");
        int n =input.nextInt();
        int digits=0,temp;
        int sum=0;
       
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        System.out.println("numbrr of digit"+digits);
       temp=n;
        while(temp>0){
             int rem=temp%10;
            sum=(int)Math.pow(rem,digits)+sum;
           
             temp=temp/10;
             }
             
         if(sum==n){
         System.out.println("is an armstrong number"+sum);
         }
         else{
            System.out.println("is nnot an armstrong number"+sum);
         }

    }
 
}
*/
//program .Reverse A String In Java
/*public class assignments{
    public static void main(String[] args) {
        String name  ="anjali";
      String  rev=" ";
      char ch;
      System.out.println("original string is " + name);
      for(int i=0;i<name.length();i++){
        ch=name.charAt(i);
        rev=ch+rev  ;
      }
      System.out.println("reverse string is " + rev);

    }
}*/
//program .Find if a number is palindrome or not
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int rem,rev=0,c;
        c=n;
        while(n>0){
        rem=n%10;
          rev=(rev*10)+rem;
          n=n/10;
          
         }
         if(c==rev){
            System.out.println("is apalindrome number"+rev);
         }
         else{
            System.out.println("is not apalindrome number"+rev);
         }

         
        }
    }
    */
    //program.HCF Of Two Numbers Program
    /*import java.util.Scanner;
    public class assignments{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the first number");
            int a=input.nextInt();
            System.out.println("enter the seconfd number");
            int b=input.nextInt();
            int hcf=0;
            for(int i=1;i<a||i<b;i++){
                if(a%i==0&& b%i==0)
                 hcf=i;
            }
            System.out.println(hcf);

        }
    }
    */
    //program.Java Program Vowel Or Consonant
/*import java.util.Scanner;
public class assignments{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the character");
        char ch =input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("is vowels" +ch);
        }
         else {
            System.out.println("is consonont" +ch);
        }
        

        }
    }
}*/
//program .vowel or constant for uppercase and lowecase both
/*import java.util.Scanner;

public class assignments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);  

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Input is not a letter.");
        }
    }
}
*/

//program.Perfect Number In Java
/*  import java.util.Scanner;
 public class assignments{
   public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("entre the value");
        int n=input.nextInt();
      int rem=0;
      for(int i=1;i<=n/2;i++){
            if(n%i==0){
          rem=rem+i;
          }}
         if(rem==n){
         System.out.println("is an perfect number" +rem);
         }
           else{
            System.out.println("is not a perfect number" +rem);
           }
        
     }
    }*/
    //program.Check Leap Year Or Not
    /*import java.util.Scanner;
    public class assignments{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the year");
            int y=input.nextInt();
            if(y%100==0&&y%400==0||y%100!=0&&y%4==0){
              System.out.println("is a leap yera" + y);
            }
            else{
                System.out.println("is not a leap year" +y);
            }
        }
    }*/
    //program.Sum Of A Digits Of Number
   /*  import java.util.Scanner;
    public class assignments{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the number");
            int n=input.nextInt();
            int rem,sum=0;
            while(n>0)
            {
                
            rem =n%10;
            sum=sum+rem;
            n=n/10;
            }
            System.out.println(sum);
        }
    }*/
    //program.Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
   /* import java.util.Scanner;
    public class assignments{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the august month days");
            int n=input.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum=sum+1;
                }
            }
            System.out.println("it will go friend in " + sum +"days" );
        }
    }
    */