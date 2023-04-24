package JavaFundamentals12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P07OrderByAge {
    static class Person{
        String name;
        String id;
        int age;


        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.%n",this.name,this.id,this.age);
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople= new ArrayList<>();


        String command= scanner.nextLine();
        while(!command.equals("End")){
            String []arr=command.split(" ");
            Person human=new Person(arr[0],arr[1],Integer.parseInt(arr[2]));

            listOfPeople.add(human);
            command= scanner.nextLine();
        }

        listOfPeople.stream().
                sorted((h1,h2)->Integer.compare(h1.getAge(), h2.getAge()))
                .forEach(person -> System.out.print(person.toString()));


    }
}
