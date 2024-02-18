package Array.All;
import javax.lang.model.util.TypeKindVisitor14;

class Gen<T1,T2>{
  private int val;
  private T1 t1;
  private T2 t2;
    public Gen(int value,T1 t1,T2 t2){
     this.val=value;
     this.t1=t1;
     this.t2=t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Generics {
    public static void main(String[] args){
      //  ArrayList<Integer> arrayList = new ArrayList();
    //arrayList.add("Sensational");
//        arrayList.add(34);
//        arrayList.add(67);
      // arrayList.add(new Scanner(System.in));

      // int a= arrayList.get(0);
      //  System.out.println(a);
        Gen<String,Character> g1= new Gen(21,"Hey, I am Ankit Kumar",'A');
        String str=g1.getT1();
        int v= g1.getVal();
        char c= g1.getT2();
        try {
            c = g1.getT2();
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
        System.out.println (str + "\nMy rollno. is:- " + v + "\nMy code:- " + c);

    }
}
