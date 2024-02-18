public class Palindron{

    public static void main(String args[]) {
        
        int n=5;
         //First half       
        for(int i=1;i<=n;i++){
            //sapces
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
            }
            //1st part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Second half
        for(int i=1;i<=n;i++){
            //sapces
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
            }
            //1st part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}