import java.util.Scanner;

public class CWH_Ch01_PRactice02 {
    public static void main(String[] args) {
        // Question 2 : Write a java program to calculate the cgpa of three subjects using there marks
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for(short i = 1; i<=3 ; i++){
            System.out.print("Enter the number of subject " + i + ": ");
            sum += (float) sc.nextInt();
        }
        sum /= 30 ;
        System.out.println("The CGPA of three subjects are: " + sum );
    }
}
