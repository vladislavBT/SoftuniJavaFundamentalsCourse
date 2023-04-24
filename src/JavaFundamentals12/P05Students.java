package JavaFundamentals12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P05Students {
    static class Student{
        String firstName;
        String lastName;
        double grades;

        Student(String firstName, String lastName, double grades){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grades=grades;
        }
        Double getGrades(){
            return this.grades;
        }

        String ToString() {
            return String.format("%s %s: %.2f", firstName, lastName,grades);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> listOfStudents=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String []command=scanner.nextLine().split("\\s+");
            Student s=new Student(command[0],command[1],Double.parseDouble(command[2]));
            listOfStudents.add(s);

        }

        listOfStudents.stream().
                sorted((s1,s2)-> Double.compare(s2.getGrades(), s1.getGrades()))
                .forEach(student -> System.out.println(student.ToString()));
    }
}
