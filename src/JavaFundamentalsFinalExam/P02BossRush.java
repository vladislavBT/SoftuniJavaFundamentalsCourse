package JavaFundamentalsFinalExam;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02BossRush {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("\\|(?<boss>[A-Z][A-Z][A-Z][A-Z][A-Z]*)\\|:#(?<title>[A-Za-z][A-Za-z]* [A-Za-z][A-Za-z]*)#");
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text= scanner.nextLine();
            Matcher matcher= pattern.matcher(text);
            if(matcher.find()){
                String bossName= matcher.group("boss");
                String title= matcher.group("title");
                int lengthOfName=bossName.length();
                int lengthOfTitle=title.length();

                System.out.printf("%s, The %s%n",bossName,title);
                System.out.printf(">> Strength: %s%n",lengthOfName);
                System.out.printf(">> Armor: %s%n", lengthOfTitle);

            }
            else{
                System.out.println("Access denied!");
            }
        }
    }
}
