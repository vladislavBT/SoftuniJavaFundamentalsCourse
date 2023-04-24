package JavaFundamentals9;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
public class lists2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        String lineOfNumbers=scanner.nextLine();
        String numbersAsStings[]=lineOfNumbers.split(" ");
        for (int i = 0; i < numbersAsStings.length; i++) {
            numbers.add(Integer.parseInt(numbersAsStings[i]));
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
