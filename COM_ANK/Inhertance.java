package COM_ANK;
public class Inhertance {
    public static void main(String[] args) {
     Parent p=new Parent();
       p.setNo(12);
       p.Yes();
       System.out.println(p.getNo());
        Child w=new Child();
       w.setNo1(24);
       System.out.println(w.getNo1());
       w.Yes1();
    }
}
 class Parent{
   public int number;
       public void setNo(int i){
        System.out.println("my number");
        number=i;
       }
       public int getNo(){
        return number;
       }
   public void Yes(){
      System.out.println("I am a constructor");
    }
 }
 class Child extends Parent{
   public int number1;
       public void setNo1(int a){
  
        number1=a;
       }
       public int getNo1(){
        return number1;
       }
   public void Yes1(){
      System.out.println("I am a constructor");
    }
 }
