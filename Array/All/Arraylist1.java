package Array.All;
 import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        //List interface
        ArrayList<Integer> list = new ArrayList();
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(9);
        list.add(100);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(9));
        System.out.println(list.indexOf(100));

    }

}
