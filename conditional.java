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
            System.out.println(a);
        }
        else if(b>c)
        {
         System.out.println(b);
        }
        else
        {
         System.out.println(c);
        }
        input.close();
    }
 }
 