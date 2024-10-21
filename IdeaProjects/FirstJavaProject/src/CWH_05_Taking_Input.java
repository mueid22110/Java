import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_05_Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = sc.nextInt();

        System.out.println("Enter the number 2");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of the numbers are : " + sum);

        boolean b1 = sc.hasNextInt(); // scannner object. hasnextliteral is used to check the literal is the actual data type or not.
        System.out.println(b1);
    }
}
