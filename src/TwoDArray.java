

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars = new String[2][3];
        
        cars[0][0] = "Maruti";
        cars[0][1] = "Toyota";
        cars[0][2] = "BMW";
        
        cars[1][0] = "Roles Roys";
        cars[1][1] = "Range Rover";
        cars[1][2] = "Mustang";
        
        for (int i=0 ; i<cars.length ; i++){
            for (int j=0 ; j<cars[i].length ; j++){
                System.out.println("The car at index ["+i+"]["+j+ "] : "+cars[i][j]);
            }
            System.out.println("");
        }
    }
}
