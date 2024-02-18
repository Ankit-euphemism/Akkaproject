package com;

public class Species {
    public static void main(String[] args) {
        Cat ct=new Cat();
        ct.call();
        ct.makesound("Meow-Meow:Cat Soun heard");
    }
}
 class Animal{
    
    public void makesound(String sound){
      System.out.println("Animal sound:-" +sound);
    }
}
class Cat extends Animal{
    void call(){
        System.out.println("Sound Heared");
    }
}
