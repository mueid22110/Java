import java.util.*;

public class TwoArrayLists {
        
    public static void main(String[] args) {
        
        ArrayList<String> bakery = new ArrayList();
        
        bakery.add("Pasta");
        bakery.add("Bread");
        bakery.add("Saouce");
        
        ArrayList<String> Products = new ArrayList();
        
        Products.add("Laptop");
        Products.add("Monitors");
        Products.add("Keyboard");
        
        ArrayList<String> Drinks = new ArrayList();
        
        Drinks.add("Tea");
        Drinks.add("Coffee");
        Drinks.add("Juice");
        
        System.out.println(bakery);
        System.out.println(Products);
        System.out.println(Drinks);
        
        ArrayList<ArrayList<String>> Total = new ArrayList();
        
        Total.add(bakery);
        Total.add(Products);
        Total.add(Drinks);
        System.out.println(Total);
        System.out.println(Total.get(1));
        System.out.println(Total.get(1).get(2));
        
        
        
    }
}
