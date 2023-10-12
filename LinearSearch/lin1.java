public class lin1 
{
    public static void main(String[] args) 
    {
        int[][]accounts={{1,2,3},{3,2,9}};
        int max=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
             sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                
                sum=sum+accounts[i][j];
            }
            System.out.println("the sum of value"+sum);
        
        }
        if(sum>max){
            max=sum;
            System.out.println("the greater number is"+max);
        }
    }
    
}
