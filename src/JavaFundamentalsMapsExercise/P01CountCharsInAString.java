package JavaFundamentalsMapsExercise;
import java.util.*;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();

        List<String> words = Arrays.asList(line.split(" "));
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char letter=word.charAt(i);
                if(!(map.containsKey(letter))){
                    map.put(letter,1);
                }
                else{
                    int currentValue= map.get(letter)+1;
                    map.put(letter,currentValue);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }


    }
}
