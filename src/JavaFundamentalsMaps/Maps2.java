package JavaFundamentalsMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Maps2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key= scanner.nextLine();

        Map<String,Integer> digitValues= new HashMap<>();
        digitValues.put("zero",0);
        digitValues.put("one",1);
        digitValues.put("two",2);
        digitValues.put("three",3);

        System.out.println(digitValues.get(key));
    }
}
