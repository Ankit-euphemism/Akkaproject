public class FInally {
    public static int greek(){
      try{ 
        int a=50;
        int b=2;
        int c=a/b;
        return c;
      }
      catch(Exception e){
        System.out.println("Arithmetic Exception");
      }
      finally{
        System.out.println("cleaning code");
      }
      return -1;
    }
    public String toString(){
        return "Cleaning of code is done";
    }
    public static void main(String[] args){
       FInally f=new FInally();
      int k= f.greek();
        System.out.println (k);
       int a=7;
       int b=9;
       while (true){
           try {
               System.out.println (a/b);
           } catch (Exception e) {
               System.out.println (e);
               break;
           }
           finally {
               System.out.println(f.toString());
           }
           b--;
       }
    }
}
