public class ObjectCopy{
    int roll;
    String name;
    static String Clg = "ICE";
    ObjectCopy(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public static void main(String args[]){
        ObjectCopy st1 = new ObjectCopy();
        ObjectCopy st2 = new ObjectCopy();
        st1.roll = 1;
        st2.roll = 2;
        System.out.println(st1.Clg);
    }




}