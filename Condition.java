import java.util.*;
public class Condition {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); 
         double a1=sc.nextDouble();
         double b1=sc.nextDouble();
         double a2=sc.nextDouble();
         double b2=sc.nextDouble();
         double rec1=a1*b1;
         double rec2=a2*b2;
        if(rec1>rec2){
            System.out.println("Area of"+rec1+"is greater");
        }
        else{
            System.out.println("Area of"+rec2+"is greater");
        }
    }
}
