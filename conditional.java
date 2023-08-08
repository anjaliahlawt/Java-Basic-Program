/*public class conditional {
    public static void main(String[] args) {
        int a=40,b=50;
        if(a>b)
        {
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
        else{
            System.out.print("error");
        }
    }
    
}*/
//logical operator AND
/*public class conditional{
    public static void main(String[] args) {
        int a=20,b=30;
        if(a==20&&b==30){
            System.out.println("hello world");
        }
    }
}
*/
//LOGICAL OPERATOR OR
/*public class conditional{
    public static void main(String[] args){
        int a=20,b=10;
        if(a==20||b==30){
            System.out.println("hey");
        }
    }
}*/
//logical operator NOT
/*public class conditional{
    public static void main(String[] args) {
        int a=30;
        if(a!=20){
            System.out.println("hey");
        }
    }
}*/
 //find the largest of 3 number
 import java.util.Scanner;
 public class conditional{
    public static void main(String[] args){
        System.out.println("enetr the 3 number");
        Scanner input= new Scanner(System.in);
        
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b){
           
            System.out.println("max value is a" + a);
        }
        else if(b>c)
        {
          
         System.out.println("max value is b" + b);
        }
        else
        {
         
         System.out.println("max value is c " + c);
        }
        input.close();
    }
 }
 