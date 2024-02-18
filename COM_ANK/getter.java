package COM_ANK;


  import java.util.*;
public class getter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=sc.nextInt();
        An a1= new An();
        a1.setX(n);
        System.out.println("Value is:"+a1.getX());
    }
}
//parentclass
   class An{
      private int x;

      public int getX() {
        return x;
      }

      public void setX(int x) {
        this.x = x;
      }
     
      
   }