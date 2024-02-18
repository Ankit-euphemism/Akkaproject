import java.util.*;

public class Array4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the size:");
        int size= sc.nextInt ();
        int i;
        String[] names=new String[size];

        for(i=0;i<size;i++){
           System.out.println ("Enter the name["+i+"]");
            names[i] = sc.next ();
        }
        //output
        for( i=0;i<names.length;i++){
            System.out.println("names"+(i+1)+" is:"+names[i]);
        }
        
    }
}
