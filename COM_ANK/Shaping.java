package COM_ANK;

public class Shaping {
    public static void main(String[] args) {
        CIRCLE cr=new CIRCLE();
        cr.Draw(4);
        System.out.println();
        Square sr=new Square();
        sr.Draw(5);
        }
}

interface Shape {
 
 void Draw(int a);
}
class CIRCLE implements Shape{
    @Override
    public void Draw(int a){
        System.out.println("Circle of Radius:-"+a);
    }
}
class Square implements Shape{
    @Override
    public void Draw(int a){
        System.out.println("Square of side:-"+a);
    }
}
