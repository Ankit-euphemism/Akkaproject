package com;

 class Sports1{
     void Tr(){
     System.out.println("Sports are basic part of human development and technology");
    }
 }

 class Cricket1 extends Sports1{
   
    void Tr(){
      super.Tr();
     System.out.println("Cricket is most popular of the all the sports");
    }  
    
 }
  
 class Football extends Sports1{
   
    void Tr(){
      super.Tr();
     System.out.println("Football consist of 11 players as in cricket and has a rectangular playground");
    }  
    
 }
public class Mainclass3{
    public static void main(String[] args) {
        // Sports t1= new Sports();
        //    t1.Tr();
        Cricket1 t2= new Cricket1();
         t2.Tr();
         Football t3= new Football();
         t3.Tr();
    }
}
