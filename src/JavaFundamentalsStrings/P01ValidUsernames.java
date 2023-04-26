package JavaFundamentalsStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();

        List<String> usernames= Arrays.asList(line.split(", "));
        List<String> finalUsernames= new ArrayList<>();
        int counter=0;
        for (int i = 0; i < usernames.size(); i++) {
            if(usernames.get(i).length()>=3 && usernames.get(i).length()<=16) {
                for (int j = 0; j < usernames.get(i).length(); j++) {
                    char symbol=usernames.get(i).toLowerCase().charAt(j);
                    if(((symbol >=97 && symbol<123) || symbol==45 || symbol==95 || (symbol >=48 && symbol<58))){
                        counter++;
                    }
                    else {
                        break;
                    }
                }
                if(counter==usernames.get(i).length()){
                    finalUsernames.add(usernames.get(i));
                    counter=0;
                }
                else{
                    counter=0;
                }
            }

        }


        for (String finalUsername : finalUsernames) {
            System.out.println(finalUsername);
        }

    }
}
