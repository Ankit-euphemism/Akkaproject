package com;

public class Mainclass2{
    public static void main(String[] args) {
        // Sports t1= new Sports();
        PLAYERS t3= new PLAYERS();
        t3.Tr();
    }
}
 class SPORTS{
     void Tr(){
     System.out.println("Sports are basic part of human development and technology");
    }
 }

 class CRICKET extends SPORTS{
   
    void Tr(){
      super.Tr();
     System.out.println("Cricket is most popular of the all the sports");
    }  
    
 }
  
 class PLAYERS extends CRICKET{
   
    void Tr(){
      super.Tr();
     System.out.println("Cricket Match consist of 11 players and 4 extras or we can say total of 15 players");
    }  
    
 }

