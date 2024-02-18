import java.util.*;
public class Array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Array Size");
        int size = sc.nextInt ();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println ("number["+i+"]");
            number[i] = sc.nextInt ();
        }
        for (int i = 0; i < size; i++) {
            System.out.println (number[i]);
        }

    }
}

