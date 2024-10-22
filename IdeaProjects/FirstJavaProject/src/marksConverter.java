import java.util.Scanner;

public class marksConverter {

    static float percent(int y, int x){

        float result = (float) y *100 / x;

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the subjects : ");
        int sub = sc.nextInt();

        System.out.print("Enter the total mark per subject: ");
        int total = sc.nextInt();
        float avg = 0.00f;

        for(int i = 1; i <= sub; i++){

            System.out.print("Enter the mark of sub " + i + " : ");
            int obt = sc.nextInt();
            float result = percent(obt, total);
            avg += result;
        }
        avg /= sub;


        System.out.println("Your obtained mark is "+ avg +"%\n");
    }
}
