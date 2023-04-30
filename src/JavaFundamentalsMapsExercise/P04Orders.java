package JavaFundamentalsMapsExercise;
import java.sql.Array;
import java.time.temporal.IsoFields;
import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String, List<Double>> map = new LinkedHashMap<>();
        while (!command.equals("buy")){

            String [] arr=command.split(" ");
            String name= arr[0];
            double price= Double.parseDouble(arr[1]);
            double quantity= Double.parseDouble(arr[2]);



            if(map.containsKey(name)){
                double nowQuantity= map.get(name).get(1)+quantity;
                List<Double> listWithData = Arrays.asList(price,nowQuantity);
                map.put(name,listWithData);

            }
            else{
                List<Double> listWithData = Arrays.asList(price,quantity);
                map.put(name, listWithData);
            }
            command=scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double finalPrice= entry.getValue().get(0)* entry.getValue().get(1);

            System.out.printf("%s -> %.2f%n", entry.getKey(),finalPrice);
        }

    }
}
