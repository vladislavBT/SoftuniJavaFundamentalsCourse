package JavaFundamentalsFinalExampPreparation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P022DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfWords= scanner.nextLine();
        List<String> destinations = new ArrayList<>();
        Pattern pattern = Pattern.compile("([=/])(?<name>[A-Z][A-Za-z]*)\\1");
        Matcher matcher = pattern.matcher(lineOfWords);
        while (matcher.find()){
            destinations.add(matcher.group("name"));
        }

        int travelPoints=0;

        for (String destination : destinations) {
            travelPoints+=destination.length();
        }
        System.out.printf("Destinations: ");
        for (int i = 0; i < destinations.size(); i++) {
            if(i== destinations.size()-1){
                System.out.printf("%s",destinations.get(i));
            }
            else{
                System.out.printf("%s, ",destinations.get(i));
            }
        }
        System.out.printf("%nTravel Points: %d",travelPoints);


    }
}
