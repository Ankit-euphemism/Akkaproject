import java.util.*;
public class Week{

 public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   int n = sc.nextInt();
    //for(int i=1;i<=n;i++){
    switch(n){
    case 1: 
    System.out.println("Monday"); 
    break;
    case 2: 
    System.out.println("Tuesday");
    break;
    case 3: 
    System.out.println("wednesday");
    break;
    case 4: 
    System.out.println("thursday");
    break;
    case 5: 
    System.out.println("Friday");
    break;
    case 6: System.out.println("Saturday");
    break;
    case 7: 
    System.out.println("Sunday");
    break;
    default: System.out.println("invalid case"); 
    }
  }
}