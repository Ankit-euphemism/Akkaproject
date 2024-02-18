package com.ANkit.Ob;

import java.util.*;
public class Vehicle {
   //datafields
  String name;
  String brand;
  int no;

     //methods
     void VehicleInfo( ){
       System.out.println("Vehicle Name:-"+this.name);
      System.out.println( "Vehicle Brand:-"+this.brand);
       System.out.println( "Vehicle Number:-"+this.no);
       
     }
    void start(){
      System.out.println("Car started...");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vehicle Name:-");
        String nam=sc.nextLine();
        System.out.println("Enter Vehicle Brand:-");
        String bran=sc.nextLine();
        System.out.println("Enter Vehicle Number:-");
        int n=sc.nextInt();
        // v1.name=nam;
        // v1.brand=bran;
        // v1.no=n;
        Vehicle v1=new Vehicle();
        v1.name=nam;
        v1.brand=bran;
        v1.no=n;
       
        v1.VehicleInfo();
       v1.start();

    }
  } 

