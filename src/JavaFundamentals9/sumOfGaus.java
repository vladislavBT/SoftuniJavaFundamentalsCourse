package JavaFundamentals9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Scanner;
public class sumOfGaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList());
        List<Integer> nextLineOfNumbers= new ArrayList<>();
if(numbers.size()%2==0) {
    for (int i = 0; i < numbers.size() / 2; i++) {
        nextLineOfNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
    }
}
else{
    for (int i = 0; i < numbers.size() / 2; i++) {
        nextLineOfNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
    }
    nextLineOfNumbers.add(numbers.get((numbers.size()-1)/2));
}
        for (Integer nextLineOfNumber : nextLineOfNumbers) {
            System.out.printf("%d ", nextLineOfNumber);
        }


    }
}
