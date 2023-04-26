package JavaFundamnetalsRegex;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("%(?<customerName>[A-Z][a-z]+)%[^$|.%]*?<(?<product>\\w+)>[^$|.%]*?\\|(?<count>\\d+)\\|[^$|.%]*?(?<price>\\d*\\.?\\d+)\\$");
        List <String> customerName=new ArrayList<>();
        List <String> product=new ArrayList<>();
        List <Double> totalPrice=new ArrayList<>();
        double totalSum=0;

        String line= scanner.nextLine();
        while (!line.equals("end of shift")){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                customerName.add(matcher.group("customerName"));
                int counts=Integer.parseInt(matcher.group("count"));
                double productPrice=Double.parseDouble(matcher.group("price"));
                totalPrice.add(counts*productPrice);
                product.add(matcher.group("product"));
            }
            line= scanner.nextLine();
        }
        for (int i = 0; i < customerName.size(); i++) {
            System.out.printf("%s: %s - %.2f%n", customerName.get(i),product.get(i),totalPrice.get(i));
        }
        for (Double price : totalPrice) {
            totalSum+=price;
        }
        System.out.printf("Total income: %.2f",totalSum);

    }
}
