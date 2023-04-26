package JavaFundamentalsMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Maps {
    static class Student{
        int facultyNumber;
        String name;
        int age;

        public Student(int facultyNumber, String name, int age) {
            this.facultyNumber = facultyNumber;
            this.name = name;
            this.age = age;
        }

        public int getFacultyNumber() {
            return facultyNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(123, new Student(123,"Georgi",18));
        studentMap.put(879, new Student(879,"Misho", 14));
        studentMap.put(456,new Student(456,"Ivan",26));

        Scanner scanner = new Scanner(System.in);
        int searchByFacultyNumber=Integer.parseInt(scanner.nextLine());

        Student result= studentMap.get(searchByFacultyNumber);

        System.out.println(result.getName());
    }
}
