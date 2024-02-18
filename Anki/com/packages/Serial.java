package Anki.com.packages;

import java.io.*;

public class Serial {
    public static void main(String[] args) {
        //serialization
       Test st1=new Test();
        st1.setLucknow("Gomti Nagar");
        st1.setName("Ankit");

        st1.setRoll(23);
        try {
            FileOutputStream fo=new FileOutputStream("Some.text");
            try {
                ObjectOutputStream oo=new ObjectOutputStream(fo);
                oo.writeObject(st1);
                oo.close();
                fo.close();
                System.out.println("Object is converted to byte stream");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Deserialization
        try {
            FileInputStream fi=new FileInputStream("Some.text");
            try {
                ObjectInputStream oi=new ObjectInputStream(fi);
                Test st2=(Test)oi.readObject();
                oi.close();
                fi.close();
                System.out.println("Converted to Object");
            } catch (IOException e) {
                throw new RuntimeException(e);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
   class Test implements Serializable {
    private int roll;
    private String name;
    private String lucknow;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getRoll() {
           return roll;
       }

       public void setRoll(int roll) {
           this.roll = roll;
       }

       public String getLucknow() {
           return lucknow;
       }

       public void setLucknow(String lucknow) {
           this.lucknow = lucknow;
       }

   }