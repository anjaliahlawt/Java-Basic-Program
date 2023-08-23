import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        switch(fruit){
            case "mango":
            System.out.println("king of fruit");
            break;
            case "grapes":
            System.out.println("small fruit");
            break;
            case "orange":
            System.out.println("round fruit");
            break;
            default:
            System.out.println("please entr valid fruit");

        }
input.close();
    }
  
}