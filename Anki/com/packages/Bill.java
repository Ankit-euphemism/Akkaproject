package Anki.com.packages;
//bill-program
import java.util.*;
public class Bill {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the bill amount:-");
          int bill=sc.nextInt();
           int fix=80;
           int price =bill-fix;
           if (price <= 150||price<=750) {
                  int unit = (price / 3);
                  System.out.println("Unit:-"+unit);
           }
           if (price >= 750 && price<=1500) {
                  int unit = ((price - 150)/ 5);
                  unit+= 50;
                  System.out.println("Unit:-"+unit);
              }
           
           if(price>=1501){
                 int unit=(price-900)/10;
                 unit+=150+50;
              System.out.println("Unit:-"+unit);
       }
           }
       }
