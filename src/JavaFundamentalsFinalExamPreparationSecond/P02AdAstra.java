package JavaFundamentalsFinalExamPreparationSecond;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<itemName>[A-Za-z ]*)\\1(?<expirationDate>\\d\\d*/\\d\\d/\\d\\d)\\1(?<calories>[\\d]*)\\1");
        Matcher matcher = pattern.matcher(text);
        Map<String, List<String>> map= new LinkedHashMap<>();
        int sumOfCalories=0;
        while (matcher.find()){
            String nameOfFood=matcher.group("itemName");
            String date=matcher.group("expirationDate");
            String calories=matcher.group("calories");
            sumOfCalories+=Integer.parseInt(calories);
            List<String> list = new ArrayList<>();
            list.add(date);
            list.add(calories);
            map.put(nameOfFood,list);
        }
        System.out.printf("You have food to last you for: %d days!%n",sumOfCalories/2000);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));

        }

    }
}
