

public class StringMethod {
    public static void main(String[] args) {
        
        String name = "Mueid Hasan ";
        
        boolean b = name.equals("Mueid");
        int i = name.length();
        char c = name.charAt(3);
        int position = name.indexOf("u");
        boolean check = name.isEmpty();
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String trim = name.trim();
        String replace = name.replace('a', 'o');
        
        
        System.out.println("<boolean>\t"+b);
        System.out.println("<length>\t"+i);
        System.out.println("<charPositon>\t"+c);
        System.out.println("<charAtPos>\t"+position);
        System.out.println("<Empty/Not>\t"+check);
        System.out.println("<Upper>\t"+upper);
        System.out.println("<lower>\t"+lower);
        System.out.println("<trim>\t"+trim);
        System.out.println("<replace>\t"+replace);
        
    }
}
