import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        
        System.out.println("Enter 1 to 7 for the day:");
        
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch(day){
            case 1 -> System.out.println("This is Sunday");
            case 2 -> System.out.println("This is Monday");
            case 3 -> System.out.println("This is Tuesday");
            case 4 -> System.out.println("This is Wednesday");
            case 5 -> System.out.println("This is Thursday");
            case 6 -> System.out.println("This is Friday");
            default -> System.out.println("Invalid day input");
        }
    }
    
}
