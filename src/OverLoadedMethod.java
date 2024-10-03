
public class OverLoadedMethod {
    public static void main(String[] args) {
        double x = add(3.0,2.0,9.3);
        System.out.println(x);
    }
    static int add(int a , int b, int c){
        System.out.println("This is method of 3 integers");
        return a+b+c;
    }
    static int add(int a , int b){
        System.out.println("This is method of 2 integers");
        return a+b;
    }
    static double add(double a , double b, double c){
        System.out.println("This is method of 3 doubles");
        return a+b+c;
    }
    static double add(double a , double b){
        System.out.println("This is method of 2 doubles");
        return a+b;
    }  
}
