package JavaFundamentals9;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers= scanner.nextLine();
        String arr[]= lineOfNumbers.split(" ");

        List<Integer> numbers= new ArrayList<>();

        for (String s : arr) {
            numbers.add(Integer.parseInt(s));
        }

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<0){
                numbers.remove(i);
                i--;
            }
        }

        Collections.reverse(numbers);

        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }


    }
}
