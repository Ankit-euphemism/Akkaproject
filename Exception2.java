public class Exception2 {
    public static double perimeter(double a,double b) throws NegativeDimensionException{
       if(a<0||b<0){
           throw new NegativeDimensionException();
       }
        double p= 2*(a+b);
        return p;
    }
    public static void main(String[] args) {
        try {
            double res=perimeter(4,5);
            System.out.println(res);
        }
        catch (NegativeDimensionException e) {
            System.out.println(e.getMessage());
        }
    }
}
class NegativeDimensionException extends Exception{

    public String toString() {
        return "dimensions can not be negative";
    }
    public String getMessage() {
        return "dimensions can not be negative";
    }
}