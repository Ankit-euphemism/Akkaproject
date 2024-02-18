package COM_ANK;
public class Main_Bank {
    public static void main(String[] args) {
      System.out.println();
     AxisBank ax=new AxisBank();
       ax.BankAddress("Near SRS mall,Gomti Nagar,Lucknow");
       ax.CustomerService();
       System.out.println();   
      ICICIBank ix=new ICICIBank();
      ix.BankAddress("Near International Airport,Transport Nagar,Lucknow");
      ix.CustomerService();
      System.out.println();
    }
}
 abstract class Bank{
   abstract void BankAddress(String Address);
    void CustomerService(){
        System.out.println("Always there for customer support");
    }
 }
  class AxisBank extends Bank{
    public void BankAddress(String Address){
           System.out.println("This is the Bank Address:-"+" "+Address);
    }
  }
  class ICICIBank extends Bank{
    public void BankAddress(String Address){
           System.out.println("This is the Bank Address:-"+" "+Address);
    }
  }