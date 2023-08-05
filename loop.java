/*
//print the counting using for loop
  public class loop
  {
  public static void main(String[] args){
  for(int i=1;i<=5;i++){
  System.out.println(i);
 }
 } 
 }*/

/*
//print the counting using for loop and value without declatre value
  import java.util.Scanner;
  public class loop{
  public static void main(String[] args){
  System.out.println("enter the value");
  Scanner input=new Scanner(System.in);
 int n=input .nextInt();
 for(int i=1;i<=n;i++){
  System.out.println(i);
  }
  input.close();

  }
 }

/*
//print the counting using while loop
  public class loop{
  public static void main(String[] args){
 int i=1;
 while(i<=5){
  System.out.println(i);
  i=i+1;
  }
 }
  }
 */
//print the counting using do -while loop
public class loop{
    public static void main(String[] args){
       int i=1;
       do{
        System.out.println(i);
        i++;
       }
       while(i<=6);
    }
}