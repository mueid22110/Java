import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hypotenouse {
    public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x side of the triangle:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y side of the triangle:"));
        double hypotenouse = Math.sqrt((x*x) + (y*y));
                
        JOptionPane.showMessageDialog(null, "hypotenouse of this triangle: "+hypotenouse);
        
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        
        System.out.println("Hello "+name+".");
    }

}
