import java.util.Random;

public class RandomNumbers{
    public static void main(String[] args){
        System.out.println("Hello");
        Random random = new Random();

        int x = random.nextInt(5)+3;
        //5 is the upper and 3 is the lower limit of the random numbers that will be printed
        double y = random.nextDouble(1)+0;

        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}