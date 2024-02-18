package COM_ANK.ANkit.Ob;
import java.util.*;
public class Construct {
    String modelname;
    int modelyear;
    public Construct(String name,int year){
       modelname=name;
       modelyear=year;

    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model name:-");
        String na=sc.next();
        System.out.println("Enter the model year:-");
        int yr=sc.nextInt();
       Construct nm= new Construct("na",yr);
  
        System.out.println("Model Name is:"+nm.modelname+" "+"\nYear:"+nm.modelyear);
    }

    
}   
