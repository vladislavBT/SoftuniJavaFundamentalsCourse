package JavaFundamnetalsRegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter=0;
        Pattern findCountsPattern = Pattern.compile("[starSTAR]");
        Pattern encryptedPattern = Pattern.compile("[^@\\-!:>]*@(?<planetname>[A-Za-z]*)[^@\\-!:>]*:(?<planetPopulation>\\d+)![^@\\-!:>]*(?<attackType>[AD])!->[^@\\-!:>]*(?<soldierCount>\\d+)[^@\\-!:>]*");

        List<String>attack=new ArrayList<>();
        List <String> defend = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            StringBuilder sb= new StringBuilder();
            sb.append(line);
            Matcher matcher = findCountsPattern.matcher(line);
            while (matcher.find()){
                counter++;
            }
            for (int j = 0; j < line.length(); j++) {
                int symbol = line.charAt(j);
                char newSymbol = (char)(symbol-counter);
                sb.setCharAt(j,newSymbol);
            }
            counter=0;
            String massage=sb.toString();
            Matcher matcherEncrypt = encryptedPattern.matcher(massage);
            while (matcherEncrypt.find()){
                if(matcherEncrypt.group("attackType").equals("A")){
                    attack.add(matcherEncrypt.group("planetname"));
                }
                if(matcherEncrypt.group("attackType").equals("D")){
                    defend.add(matcherEncrypt.group("planetname"));
                }
            }
        }


        System.out.printf("Attacked planets: %d%n",attack.size());
        attack.stream()
                .sorted((a,b)->(a.compareTo(b)))
                .forEach(a -> System.out.printf("-> %s%n",a));
        System.out.printf("Destroyed planets: %d%n",defend.size());
        defend.stream()
                .sorted((a,b)->(a.compareTo(b)))
                .forEach(a -> System.out.printf("-> %s%n",a));

    }
}
