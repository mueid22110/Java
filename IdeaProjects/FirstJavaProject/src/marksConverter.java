import java.util.Scanner;

public class marksConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total mark : ");
        int total = sc.nextInt();

        System.out.print("Enter the obtained mark : ");
        int obt = sc.nextInt();
        float result = (float) obt *100 / total;

        System.out.println("The obtained mark is "+ result +"%\n");
    }
}
