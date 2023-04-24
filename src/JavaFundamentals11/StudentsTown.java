package JavaFundamentals11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentsTown {
    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        Student(String firstName, String lastName, int age, String homeTown){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.homeTown=homeTown;
        }

        String returnOutFirstPart(){
            return this.firstName +" "+ this.lastName;
        }
        String returnOutSecondPart(){
            return " is " + this.age + " years old.";
        }



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        String []arr=command.split(" ");
        List<String> list=new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }

        List<String> list2= new ArrayList<>();



        while(!(list.get(0).equals("end"))) {


            String firstName= scanner.nextLine();
            String lastName=scanner.nextLine();
            int age=Integer.parseInt(scanner.nextLine());
            String homeTown= scanner.nextLine();

            Student a = new Student(firstName,lastName,age,homeTown);

            list2.add(a.returnOutFirstPart());

            command=scanner.nextLine();
            String [] arr2=command.split(" ");
            for (String s : arr) {
                list.remove(s);
            }
            for (String s : arr2) {
                list.add(s);
            }
        }
    }
}
