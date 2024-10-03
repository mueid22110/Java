import javax.swing.JOptionPane;

public class IfStatements{

    public static void main(String[] args){

        int age = 18;

        if  ( age >= 20){
            System.out.println("You are adult");
        }else {
            System.out.println("You are not adult");
        }

        System.out.println(age>20);
        JOptionPane.showMessageDialog(null, "The age is "+age);
    }
}