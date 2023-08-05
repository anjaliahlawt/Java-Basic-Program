import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = input.nextLine();
    System.out.println("Username is: " + userName);
    input.close();
  }
}
/*
 * 
 * import java.util.Scanner;
 * public class input {
 * public static void main(String[] args){
 * Scanner input=new Scanner(System.in);
 * System.out. print(" please,enter the integer input value");
 * int rollno=input.nextInt();
 * System.out.println("your roll no is" + rollno);
 * input.close();
 * }
 * 
 * }
 */
