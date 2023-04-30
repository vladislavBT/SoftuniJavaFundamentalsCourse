package JavaFundamentalsMapsExercise;
import java.util.*;

public class P07StudenAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if(map.containsKey(name)){
               List<Double> list= map.get(name);
               list.add(price);
               map.put(name,list);
            }
            else{
                List<Double> list = new ArrayList<>();
                list.add(price);
                map.put(name,list);
            }
        }


        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            Double average=0.0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average+=entry.getValue().get(i);
            }
            average=average/entry.getValue().size();
            if(average>=4.50) {
                System.out.printf( "%s -> %.2f%n",entry.getKey(), average);
            }
        }


    }
}
