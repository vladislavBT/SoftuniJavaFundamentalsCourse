package JavaFundamentals9;
import java.util.*;

public class sortLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = new ArrayList<>(Arrays.asList(10,15,1,2,3,4,5,4,12,48));

        List <String> names = new ArrayList<>(Arrays.asList("Gosho", "Ivan", "Pesho", "Kaloqn", "Anna"));
        Collections.sort(numbers);
        Collections.reverse(numbers);
        Collections.sort(names);

        Collections.sort(names, (a,b)-> Integer.compare(a.length(),b.length()));

        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }

        for (String name : names) {
            System.out.printf("%s ", name);
        }


    }
}
