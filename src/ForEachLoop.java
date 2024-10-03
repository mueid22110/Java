import java.util.ArrayList;

public class ForEachLoop {
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Bird");
		animals.add("Dog");
		animals.add("Cat");
		
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		
	}
}
