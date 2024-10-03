

public class MathClass {
    public static void main(String[] args) {
        math();
    }
    static void math (){
        
        double x = 4.24 , y = -23.73;
        double z = Math.max(x, y);
        double t = Math.min(x, y);
        double a = Math.abs(y);
        double b = Math.sqrt(a);
        double c = Math.round(y);
        
        System.out.println("max : "+z+"\nmin : "+t);
        System.out.println("absolute : "+a+"\nsquare root of : "+b);
        System.out.println("the round value  : "+c+"\nsquare root of : "+b);
        
    }
       
}