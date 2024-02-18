package com;
public class Menu {
    public static void main(String[] args) {
        System.out.println("Taj Hotel:-");
       TajHotel tj=new TajHotel();
         tj.Drink();
         tj.chickenBiryani();
         tj.masalaDosa(); 
         System.out.println();
         System.out.println("Road side hotel:-");
         RoadSideHotel rh=new RoadSideHotel();
         rh.chickenBiryani();
         rh.masalaDosa();
    }
}
 
  interface Hotel{
    void chickenBiryani();
    void masalaDosa();
  
 }
  class TajHotel implements Hotel{
    void Drink(){
        System.out.println("Welocne Drink from Taj Hotel");
    }
    @Override
    public void chickenBiryani(){
        for(int variety=1; variety<3;variety++){
            System.out.println("Chicken Briyani Meal"+variety);
        }
    }
    @Override
    public void masalaDosa(){
     for(int variety1=1;variety1<3;variety1++){
     System.out.println("Masala Dosa Meal"+variety1);
     }
    }
}
class RoadSideHotel implements Hotel{
    @Override
    public void chickenBiryani(){
        for(int variety2=1; variety2<3;variety2++){
            System.out.println("Chicken Biryani Meal"+variety2);
        }
    }
       
    @Override
    public void masalaDosa(){
     for(int variety3=1;variety3<3;variety3++){
     System.out.println("Masala Dosa Meal"+variety3);
     }
    }
}