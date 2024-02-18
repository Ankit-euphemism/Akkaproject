import java.util.*;
public class Calculate{
   
public static Double calculateCircumference(Double radius){

   Double Circumference=2 * 3.14 * radius;
   return Circumference;
}
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 Double radius =sc.nextDouble();

Double Circumference = calculateCircumference(radius);
System.out.println(Circumference);
}
}
