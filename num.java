import java.util.*;
public class num{

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if((n/2)*2==n){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}