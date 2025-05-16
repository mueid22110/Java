import java.io.*;
import java.text.*;
import java.util.*;

public class debuggedStudentList {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments found!!!");
            return;
        }

        if (args[0].equals("a")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
                String st = reader.readLine();
                if (st != null) {
                    String i[] = st.split(",");
                    for (String j : i) {
                        System.out.println(j.trim());
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
            System.out.println("Data Loaded.");
        }
        else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(new FileReader("students.txt"));
                String r = s.readLine();
                if (r != null) {
                    String i[] = r.split(",");
                    Random x = new Random();
                    int y = x.nextInt(i.length); // Corrected random index
                    System.out.println(i[y].trim());
                }
                s.close();
            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
            System.out.println("Data Loaded.");
        }
        else if (args[0].equals("+")) {
            if (args.length < 2) {
                System.out.println("Please provide a student name to add.");
                return;
            }
            System.out.println("Loading data ...");
            try {
                BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));
                String t = args[1]; // Corrected argument handling
                Date d = new Date();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss a");
                String fd = dateFormat.format(d);
                s.write(", " + t + "\nList last updated on " + fd);
                s.close();
            } catch (Exception e) {
                System.out.println("Error writing to file.");
            }
            System.out.println("Data Loaded.");
        }
        else if (args[0].equals("?")) {
            if (args.length < 2) {
                System.out.println("Please provide a name to search.");
                return;
            }
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(new FileReader("students.txt"));
                String r = s.readLine();
                if (r != null) {
                    String i[] = r.split(",");
                    boolean found = false;
                    String t = args[1]; // Corrected argument handling
                    for (String student : i) {
                        if (student.trim().equals(t)) {
                            System.out.println("We found it!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }
                s.close();
            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
            System.out.println("Data Loaded.");
        }
        else if (args[0].equals("c")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(new FileReader("students.txt"));
                String r = s.readLine();
                if (r != null) {
                    String i[] = r.split(",");
                    System.out.println(i.length + " word(s) found.");
                }
                s.close();
            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
            System.out.println("Data Loaded.");
        }
        else {
            System.out.println("Invalid command.");
        }
    }
}
