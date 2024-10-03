
import java.util.Scanner;


public class LogicalAlgorithm {
    public static void main(String[] args) {
        LogicalOr();
        LogicalAnd();
        LogicalNot();
        
    }
    static void LogicalOr(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Q or q to quit.");
        
        String response = scanner.next();
        if (response.equals("Q") && response.equals("q")){
            System.out.println("You quit the game.");
        }else{
            System.out.println("You are still playing the game. *pew pew*");
        }
    }
    
    static void LogicalAnd(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("rate 1 to 10 out of 10 for this code:");
        
        int response = scanner.nextInt();
        
        
        if (response>=1 && response<=10){
            System.out.println("You rated :"+response);
        }else{
            System.out.println("invalid rating");
        }
    }
    static void LogicalNot(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press A");
        
        String response = scanner.next();
        if (!response.equals("A")){
            System.out.println("You pressed a wrong key.");
        }else{
            System.out.println("Congratulation You leaned a new letter: A");
        }
    }
}
