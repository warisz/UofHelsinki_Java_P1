
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        ArrayList<Student> list = new ArrayList<Student>();
        
        Scanner reader = new Scanner (System.in);
        String name = ".";
        String studentNumber = ".";
        
        while (!name.isEmpty()){
            System.out.print("name: ");
            name = reader.nextLine();

            System.out.print("studentnumber:");
            studentNumber = reader.nextLine();
            
            Student newStudent = new Student (name, studentNumber);
            list.add(newStudent);
    }
        System.out.println("");
        for(Student student : list){
            System.out.println(student);
        }
        System.out.println("");
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        
        System.out.println("Result: ");
        for(Student student : list){
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}
