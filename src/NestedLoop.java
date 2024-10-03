
import java.util.Scanner;


public class NestedLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int row, coloumn;
        
        System.out.println("Enter the row number :");
        row = scanner.nextInt();
        
        System.out.println("Enter the row number :");
        coloumn = scanner.nextInt();
        
        String symbol = "";
        System.out.println("Enter the symbol:");
        symbol = scanner.next();
        
        for(int i = 0; i<row; i++){
            for(int j = 0 ; j<coloumn ; j++){
                System.out.print(symbol +" ");
            }
            
            System.out.println("");
        }
        
    }
    
}
