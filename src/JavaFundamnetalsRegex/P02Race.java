package JavaFundamnetalsRegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameRegex="[A-Z]|[a-z]";
        String distanceRegex="\\d";

        Pattern patternName=Pattern.compile(nameRegex);
        Pattern patternDistance=Pattern.compile(distanceRegex);


        List<String> listWithParticipants= List.of(scanner.nextLine().split(", "));
        Map <String,Integer> map= new TreeMap<>();

        String name="";
        int score=0;

        String line = scanner.nextLine();
        while (!line.equals("end of race")){
            Matcher matcherName=patternName.matcher(line);
            while (matcherName.find()){
                name+=matcherName.group();
            }
            Matcher matcherScore=patternDistance.matcher(line);
            while (matcherScore.find()){
                score+=Integer.parseInt(matcherScore.group());
            }
            if(listWithParticipants.contains(name)) {
                if (map.containsKey(name)) {
                    int current = map.get(name);
                    map.put(name, current + score);
                } else {
                    map.put(name, score);
                }
            }
            score=0;
            name="";
            line= scanner.nextLine();
        }

    List<String> sorted = map.entrySet().stream().
            sorted((a , b)-> Integer.compare(b.getValue(), a.getValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());


        System.out.printf("1st place: %s%n",sorted.get(0));
        System.out.printf("2nd place: %s%n",sorted.get(1));
        System.out.printf("3rd place: %s%n",sorted.get(2));


    }
}
