import java.util.Scanner;

class  Student{
    long id;
    float gpa;
    String name;
    int position;
    public void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Merit : "+position);
        System.out.println("GPA : "+ gpa +" out of " + 4);
    }
}
public class firstSemesterResult {
    static void munem(){
        Student munem = new Student();
        munem.id= 2338520127l;
        munem.name= "Munem Uddin";
        munem.gpa= 3.642f;
        munem.position = 1;
        munem.printDetails();
    }
    static void mueid(){
        Student mueid = new Student();
        mueid.id= 2338520105l;
        mueid.name= "Md. Mueid Hasan";
        mueid.position = 2;
        mueid.gpa= 3.523f;
        mueid.printDetails();
    }
    static void lamia(){
        Student lamia = new Student();
        lamia.id= 2338520130l;
        lamia.name= "Lamia Kawsar";
        lamia.position = 3;
        lamia.gpa= 3.428f;
        lamia.printDetails();
    }
    static void Details() {

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter the roll Number off the student:");
            int roll = sc.nextInt();
            switch (roll) {
                case 1:
                    siam();
                    break;
                case 2:
                    masuma();
                    break;
                case 3:
                    manik();
                    break;
                case 5:
                    mueid();
                    break;
                case 6:
                    rahee();
                    break;
                case 27:
                    munem();
                    break;
                case 30:
                    lamia();
                    break;
                default:
                    Details();
            }
        }
    }
    public static void main(String[] args) {
//        System.out.println("This is our custom class.");


        Details();

    }
}
