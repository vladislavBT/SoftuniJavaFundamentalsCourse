package JavaFundamentalsMapsExercise;
import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("End")){
            String []arr= input.split(" -> ");
            if(map.containsKey(arr[0])){
                if(!(map.get(arr[0]).contains(arr[1]))) {
                    List<String> listWithCompanies = map.get(arr[0]);
                    listWithCompanies.add(arr[1]);
                    map.put(arr[0], listWithCompanies);
                }
            }
            else{
                List<String> listWithCompanies= new ArrayList<>();
                listWithCompanies.add(arr[1]);
                map.put(arr[0],listWithCompanies);
            }

            input= scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }

    }
}
