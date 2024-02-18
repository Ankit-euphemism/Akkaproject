package COM_ANK.ANkit.Ob;

import java.util.Scanner;

public class Register {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);//input
      String na=sc.nextLine();
       int co=sc.nextInt();
       Student s1=new Student();
        s1.name=na;
       
        s1.code=co;
         s1.student();
       
        }
}
