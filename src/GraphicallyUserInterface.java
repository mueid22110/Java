import javax.swing.JOptionPane;

public class GraphicallyUserInterface {
    public static void main(String[] args) {
         
        String name = JOptionPane.showInputDialog("Enter your Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        
       JOptionPane.showMessageDialog(null, "Hello "+name +"\nYou are "+age+" years old");
        /*JOptionPane.showMessageDialog(null, );*/
    
    }  
}