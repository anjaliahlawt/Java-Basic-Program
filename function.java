/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        int num1,num2,sum;
        num1=input.nextInt();
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println(sum);
        input.close();
    }
}
*/
//pass the value of number when you are calling the method main
public class function{
    public static void main(String[] args) {
        int ans=sum1(3,4);
        System.out.println(ans);
        
    }
    static int sum1(int a,int b){
     int sum=a+b;
     return sum;
    }
}