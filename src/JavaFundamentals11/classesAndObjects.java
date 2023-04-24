package JavaFundamentals11;
import java.util.Scanner;
public class classesAndObjects {
    static class Student{
        String name;
        int id;
        int age;

       Student(String name, int id, int age){ // constructor of class
            this.name=name;
            this.age=age;
            this.id=id;
        }

        void increaseAges(){//method
           this.age++;
        }

        void changeName(){//method
           this.name="kind of name";
        }


        String returnStudent(){  //method
            return "Name: " + this.name + ", Age: "+ this.age + ", Id: " + this.id;
        }
    }

    public static void main(String[] args) {
        Student a = new Student("Vladi",15145128,16);
        a.increaseAges();

        Student b = new Student("Ivan",18426498,21);
        b.increaseAges();

        Student c = new Student("Georgi", 8484848, 42);

        System.out.println(a.returnStudent());
        System.out.println(b.returnStudent());

        c.changeName();
        c.increaseAges();
        c.increaseAges();

        System.out.println(c.returnStudent());



    }
}
