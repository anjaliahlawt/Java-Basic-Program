
/*public class array {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        System.out.println(a[3]);
    }
    
}
*/
/*public class array{
    public static void main(String[] args){
        int[]a={2,3,4,5,6};
        a[3]=9;
        System.out.print(a[3]);
    }
}
*/
/*public class array{
    public static void main(String[] args){
        int []a={11,12,45,65};
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }
    }
}
*/
/*public class array{
    public static void main(String[] args){
        String[] a={"anjali","anju","sanju"};
        for(int i=0;i<=a.length;i++){
            System.out.print(" "+ a[i]+ " ");
        }
    }
}*/
/*public class array{
    public static void main(String[] args){
        int[]a={2,3,4,5};
        for(int i:a){
            System.out.println(i);
        }
    }
}
*/

/*public class array{
    public static void main(String[] args){
        String[]a={"anjali","anjau","sanju","imli"};
        for(String i:a){
            System.out.print(" "+ i + " ");

        }
    }
}
*/
/* 
public class array{
    public static void main(String[] args){
        int[][]a={{1,2,3},{4,5,6}};
        System.out.println(a[1][2]);

    }
}
*/
/* 
public class array{
    public static void main(String[] args){
        int[][]a={{1,2,3},{4,5,6}};
        a[0][1]=4;
        System.out.println(a[0][1]);
    }
}
*/
/*public class array{
    public static void main(String[] args){
        int[][]a={{1,2,3},{4,5,6}};
        int i,j;
        for( i= 0;i<a.length;i++){
            for( j=0;j<a [i].length;j++){
        System.out.print(a[i][j]);}
        System.out.println();
    }
        
    }
}*/
/*import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][]a = new int[3][3];
     
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=input.nextInt();
            }
        }
       for(int i=0;i< a.length;i++){
            for(int j=0;j< a[i].length;j++){
              System.out.print(a[i][j] +" ");
            }
            System.out.println();
        } 
        input.close();

    }
}*/
//swap a aaray index

/*import java.util.*;
public class array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int c = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=c;
    }
}*/

//maximum value of an aary
/*import java.util.*;
public class array{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,};
        System.out.println(max(arr,1,4));
    }
    static int max(int []arr,int start,int end){
        int maxvalue=start;
        for(int i=start;i<end;i++){
          if(arr[i]>maxvalue){
            maxvalue=arr[i];
          }
        
        }
           return maxvalue;
    }
}
*/

