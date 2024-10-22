import java.util.Scanner;

public class CWH_Ch01_Practice05 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);

        boolean b = sc.hasNextInt();
        if(b == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
// Detect a number if it is an integer or not