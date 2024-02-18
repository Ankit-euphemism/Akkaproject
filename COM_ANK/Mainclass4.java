package com;
import java.util.*;
public class Mainclass4 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.CalculateArea();
        Rectangle r=new Rectangle();
        r.CalculateArea();
    }
}
class SHAPE{
   void CalculateArea1(){
    System.out.println(" ");
   }
}
class Circle extends SHAPE{
    void CalculateArea(){
     super.CalculateArea1();
     System.out.println("Area of Circle is calculated below:");
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter the radius:");
      double radius=sc.nextDouble();
      double area=radius*radius*3;

      System.out.println("Area is calculated"+area);
   }
}
class Rectangle extends SHAPE{
    void CalculateArea(){
        super.CalculateArea1();
     System.out.println("Area of Rectangle is calculated below:");
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter the length:");
      float length=sc.nextFloat();
       System.out.print("Enter the breath:");
      float breath=  sc.nextFloat();
      float Area=length*breath;
      System.out.println("Area is calculated"+Area);
   }
}

