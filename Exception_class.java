public class Exception_class {
    public static double divide(int a,int b) throws ArithmeticException{
        double result = a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double res=3.14*r*r;
        return res;
    }
    public static void main(String[] args) {
        try {
//            int c= divide (5,0);
//            System.out.println ("Division:-"+c);
            double a = area (-4);
            System.out.println ("Area:-" + a);
        }
        catch(Exception e){
            System.out.println (e.getMessage());
        }
        finally {
            System.out.println ("All done");
        }
        try{
            double c=divide(3,0);
            System.out.println ("Divide:-"+c);
        }
        catch(ArithmeticException e){
            System.out.println ("Exception Occurred");
            //e.printStackTrace();
        }
    }
}
class NegativeRadiusException extends Exception{

    public String toString() {
        return "Radius can not be negative";
    }
        public String getMessage() {
            return "Radius can not be negative";
        }
}
