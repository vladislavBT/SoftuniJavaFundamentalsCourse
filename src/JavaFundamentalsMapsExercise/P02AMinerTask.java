package JavaFundamentalsMapsExercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        String firstLine= scanner.nextLine();
        while (!(firstLine.equals("stop"))){
            int secondLine= Integer.parseInt(scanner.nextLine());

            if(map.containsKey(firstLine)){
                int newValue= map.get(firstLine)+secondLine;
                map.put(firstLine,newValue);
            }
            else{
                map.put(firstLine,secondLine);
            }
            firstLine=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }

    }
}
