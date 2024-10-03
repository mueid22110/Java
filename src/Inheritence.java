public class Inheritence{
    public class animal{
        int leg = 4;
    }
    public class dog extends animal{
        String name = "Dog";
    }
    public static void main(String[] args){
        
        dog obj = new dog();
        System.out.println(obj.leg);
        
    }
}