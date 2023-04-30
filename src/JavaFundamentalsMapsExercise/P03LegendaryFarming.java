package JavaFundamentalsMapsExercise;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfMaterials= scanner.nextLine();
        String arr[]= lineOfMaterials.split("\\s+");
        boolean doWeFindIt=true;
        String legendaryItem = null;
        Map<String, Integer> map = new LinkedHashMap<>();
        int index=0;
        while (doWeFindIt){
            String material = arr[index+1].toLowerCase();
            if(map.containsKey(material)){
                int newValue=map.get(material)+Integer.parseInt(arr[index]);
                if(newValue>=250){
                    legendaryItem=arr[index+1];
                    map.put(material,newValue);
                    doWeFindIt=false;
                }
                else {
                    map.put(material,newValue);
                }
            }
            else {
                int newValue=Integer.parseInt(arr[index]);
                if(Integer.parseInt(arr[index])>=250){
                   legendaryItem=arr[index+1];
                   map.put(material,newValue);
                   doWeFindIt=false;

                }
                else {
                    map.put(material,Integer.parseInt(arr[index]));
                }

            }
            index+=2;
        }
        if(legendaryItem.equals("shards")){
            System.out.println("Shadowmourne obtained!");
            System.out.printf("shards: %d%n", map.get("shards")-250);
            System.out.printf("fragments: %d%n", map.get("fragments"));
            System.out.printf("motes: %d%n", map.get("motes"));
            for (Map.Entry<String, Integer> Entry : map.entrySet()) {
                if(!(Entry.getKey().equals("motes"))&& !(Entry.getKey().equals("shards")) && !(Entry.getKey().equals("fragments"))) {
                    System.out.println(Entry.getKey() + ": " + Entry.getValue());
                }
            }
        }
        else if(legendaryItem.equals("motes")){
            System.out.println("Dragonwrath  obtained!");
            System.out.printf("shards: %d%n", map.get("shards"));
            System.out.printf("fragments: %d%n", map.get("fragments"));
            System.out.printf("motes: %d%n", map.get("motes")-250);
            for (Map.Entry<String, Integer> Entry : map.entrySet()) {
                if(!(Entry.getKey().equals("motes"))&& !(Entry.getKey().equals("shards")) && !(Entry.getKey().equals("fragments"))) {
                    System.out.println(Entry.getKey() + ": " + Entry.getValue());
                }
            }

        }
        else if(legendaryItem.equals("fragments")){
            System.out.println("Valanyr  obtained!");
            System.out.printf("shards: %d%n", map.get("shards"));
            System.out.printf("fragments: %d%n", map.get("fragments")-250);
            System.out.printf("motes: %d%n", map.get("motes"));
            for (Map.Entry<String, Integer> Entry : map.entrySet()) {
                if(!(Entry.getKey().equals("motes"))&& !(Entry.getKey().equals("shards")) && !(Entry.getKey().equals("fragments"))) {
                    System.out.println(Entry.getKey() + ": " + Entry.getValue());
                }
            }
        }








    }
}
