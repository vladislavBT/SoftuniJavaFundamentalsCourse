package JavaFundamnetalsRegex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        Pattern pattern=Pattern.compile(">>(?<name>[A-Z]\\w+)<<(?<price>\\d+[\\d\\.]+)!(?<quantity>\\d+)");

        List <String> listWithNames = new ArrayList<>();
        List <Double> priceAndQuantity = new ArrayList<>();
        while(!line.equals("Purchase")){
            Matcher matcher=pattern.matcher(line);
            while(matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                listWithNames.add(name);
                priceAndQuantity.add(price * quantity);
            }
            line= scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String listWithName : listWithNames) {
            System.out.println(listWithName);
        }
        double totalSum=0.0;

        for (Double sum : priceAndQuantity) {
            totalSum+=sum;
        }

        System.out.printf("Total money spend: %.2f",totalSum);


    }
}
