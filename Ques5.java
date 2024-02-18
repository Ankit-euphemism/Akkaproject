public class Ques5{
         public static void main(String args[]){
        int n=5;
        //upper half
        for(int i=0;i<=n;i++){
          //spaces
          for(int j=0;j<=n-i;j++){
           System.out.print(" ");
          }
          //First part
          for(int j=0;j<=i;j++){
           System.out.print(j);
        }
        //Second part
          for(int j=i-1;j>=0;j--){
           System.out.print(j);
          }
        System.out.println();
        }
      //lower half
        for(int i=n-1;i>=0;i--){
          //spaces
          for(int j=0;j<=n-i;j++){
           System.out.print(" ");
          }
          //First part
          for(int j=0;j<=i;j++){
           System.out.print(j);
        }
        //Second part
          for(int j=i-1;j>=0;j--){
           System.out.print(j);
          }
        System.out.println();
        }
    }
}