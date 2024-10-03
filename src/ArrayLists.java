import java.util.ArrayList;

public class ArrayLists 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("Rice");
        food.add("Meat");
        food.add("Vegetables");
        
        for(int i =0; i <food.size(); i++)
        {
            System.out.println(food.get(i));
        }
        
        System.out.println("-------------------------------------");
        
        food.remove(1);
        food.set(0, "Chikhen");
        
        for(int i =0; i <food.size(); i++)
        {
            System.out.println(food.get(i));
        }
        System.out.println("-------------------------------------");
        
        food.clear();
        
        for(int i =0; i <food.size(); i++)
        {
            System.out.println(food.get(i));
        }
        System.out.println("Thank You for running this code.");
        
        
    }
}
