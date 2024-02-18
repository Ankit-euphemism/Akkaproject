package com;

 class Sports{
     void Tr(){
     System.out.println("Sports are basic part of human development and technology");
    }
 }

 class Cricket extends Sports{
    void Tr(){
      super.Tr();
     System.out.println("Cricket is most popular of the all the sports");
    }  
    
 }
 
public class Mainclass {
    public static void main(String[] args) {
        /*Sports t1= new Sports();
           t1.Tr();*/
        Cricket t2= new Cricket();
         t2.Tr();
    }
}
