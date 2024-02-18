package Array.All;
import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row size:");
        int n=sc.nextInt();
        System.out.println("Enter the coloumn size:");
        int m=sc.nextInt();
        int[][] arr2= new int[n][m];
        //input loop
        //rows
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print("Enter the array value at "+"arr"+"["+i+"]"+"["+j+"]");
               arr2[i][j]=sc.nextInt();
               
            
            }
            
            System.out.println();
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 sum+=arr2[i][j]; 
              System.out.print(sum+" ");
            }
            System.out.println();
        }


    }
}
