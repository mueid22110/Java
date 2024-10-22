import java.util.Scanner;

public class CWH_Ch01_Practice01 {
    public static void main(String[] args) {
        // Question 1: Write a java program to add the integer numbers
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(short i = 1; i <= 3; i++){
            System.out.print("Enter the number " + i + ": ");
            sum += sc.nextInt();
        }
        System.out.println("The sum of the numbers : " + sum);
    }
}
