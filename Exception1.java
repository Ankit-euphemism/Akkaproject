import java.util.*;
public class Exception1 {
    public static void main(String[] args){
       int[] marks = new int[3];

      marks[0]=78;
      marks[1]=89;
      marks[2]=95;
      
         Scanner sc= new Scanner(System.in);
          System.out.print("Enter the index:");
         int ind=sc.nextInt();
          System.out.print("Enter the number:");
         int number=sc.nextInt();
         
         String t="";
             //Exception
             try{
                System.out.println("The value of array at the index:"+ marks[ind]); 
                System.out.println("The value of array-value/number is:"+ marks[ind]/number); 
                System.out.println("The value of string"+t);
             }
             catch (IndexOutOfBoundsException e){
                 System.out.println("Out of box");

             }
             catch (ArithmeticException e){
                 System.out.println("Number can be divided by 0");

             }
            catch(NullPointerException e) {
                System.out.println("the value can't be null");

            }
             System.out.println("All is well");
        }
}
