
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

import java.util.ArrayList;

public class array
{
    public static void main(String[] args) 
    {
        int []arr={2,3,4,5};
        int n =arr.length;
          int max=arr[0];
          int min=arr[0];
          ArrayList<Integer> primeArray=new ArrayList<Integer>();
          int sumofArray=0;
          int MultiplyofArray=1;
          int sumOfEvenNumber=0;
          int sumOfOddNumber=0;
        for(int i=0;i<n;i++)
        { 
            sumofArray=sumofArray+arr[i];
            MultiplyofArray=MultiplyofArray*arr[i];
            boolean isPrime=true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                     isPrime=false;
                     break;
                }

            }
            if(isPrime){
                primeArray.add(arr[i]);
            }
            if(arr[i]>max)
            {
               max=arr[i];
            }
            if(arr[i]<min)
            {
               min=arr[i];
            }
            if(i%2==0)
            {
               sumOfEvenNumber=sumOfEvenNumber+arr[i];
            }
            else
            {
                sumOfOddNumber=sumOfOddNumber+arr[i];
            }
        }
        System.out.println("sum of number"+sumofArray);
        System.out.println("multiplyof number"+MultiplyofArray);
        System.out.println("maximum number"+max);
        System.out.println("minimunm number "+min);
        System.out.println("sum of even number"+sumOfEvenNumber);
        System.out.println("sum of odd number"+sumOfOddNumber);
         System.out.println("Prime Number Array"+primeArray);
    }
}

