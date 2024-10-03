package javabasics;
public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Mueid Hasan";
        System.out.println(name);
        int number = 10 + 20;
        double myDouble = number;
        System.out.println(number);
        System.out.println(myDouble);
        System.out.println("The length of the string is :" + name.length());
        
        //pattern(30);
    }
    static void pattern(int a){
        for(int i = 0 ; i <= a ; i++){
            for(int j = 1; j<=i ; j++){                
                System.out.print(j+"\s");
            }
            System.out.println();
        }
    }
}