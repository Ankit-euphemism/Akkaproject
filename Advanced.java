import java.util.*;

public class Advanced{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter te number:-");
        int n=sc.nextInt();
         
        //upper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
              System.out.print(j);
            }
            //spaces
            int spaces = 2*(n-i);
            for( int j=1;j<=spaces;j++){

                System.out.print(" ");
            }

            //2nd part
            for(int j=i;j>=1;j--){
              System.out.print(j);
            }
            System.out.println();
        }


 //lower half
        for(int i=n-1;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
             System.out.print(j);
            }
            //spaces
            int spaces = 2*(n-i);
            for( int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}