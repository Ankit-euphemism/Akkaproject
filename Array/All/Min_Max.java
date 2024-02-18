 package Array.All;
import java.util.*;
public class Min_Max {
 public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
         int n=sc.nextInt();
         int[] numbers=new int[n];

         for(int i=0;i<n;i++){
            System.out.print("Enter the Value of arr["+i+"]");
             numbers[i]=sc.nextInt();
         }
         int min=numbers[0];
           // int max=Integer.MAX_VALUE;
         for(int i=0;i<numbers.length;i++){
             if(numbers[i]<min){
                min =numbers[i];
                System.out.println("The min value is:"+min);
             }
            //  else if(numbers[i]>max){
            //     max=numbers[i];
            //  }
            //   System.out.println("The minimum value is:"+min);
              
         }
    }
}
