package JavaFundamentalsFinalExamPreparationSecond;
import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> map = new LinkedHashMap<>();
        String command= scanner.nextLine();
        while(!command.equals("Sail")){
            String arr[]=command.split("\\|\\|");
            if(map.containsKey(arr[0])){
                List<Integer> myList=map.get(arr[0]);
                myList.set(0, myList.get(0)+Integer.parseInt(arr[1]));//citizens
                myList.set(1 ,myList.get(1)+Integer.parseInt(arr[2]));//gold
                map.put(arr[0],myList);
            }
            else{
                List<Integer> myList=new ArrayList<>();
                myList.add(Integer.parseInt(arr[1]));
                myList.add(Integer.parseInt(arr[2]));
                map.put(arr[0],myList);
            }

            command= scanner.nextLine();
        }
        command= scanner.nextLine();
        while(!command.equals("End")){
            String arr[]=command.split("=>");
            if(arr[0].equals("Plunder")){
                String nameOfTown = arr[1];
                int killedPeople= Integer.parseInt(arr[2]);
                int stolenGold=Integer.parseInt(arr[3]);

                List<Integer> list=map.get(nameOfTown);
                if(list.get(0)-killedPeople<=0 || list.get(1)-stolenGold<=0){
                    if(list.get(0)-killedPeople<=0 && !(list.get(1)-stolenGold<=0)){
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",nameOfTown,stolenGold,list.get(0));
                    }
                    if(list.get(1)-stolenGold<=0 && !(list.get(0)-killedPeople<=0)){
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",nameOfTown,list.get(1),killedPeople);
                    }
                    if(list.get(0)-killedPeople<=0 && list.get(1)-stolenGold<=0){
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",nameOfTown,list.get(1),list.get(0));

                    }
                    map.remove(nameOfTown);
                    System.out.printf("%s has been wiped off the map!%n",nameOfTown);
                }
                else{
                    list.set(0,list.get(0)-killedPeople);
                    list.set(1,list.get(1)-stolenGold);
                    map.put(nameOfTown,list);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",nameOfTown,stolenGold,killedPeople);
                }


            }
            if(arr[0].equals("Prosper")){
                String nameOfTown = arr[1];
                int givenGold=Integer.parseInt(arr[2]);
                List<Integer> list=map.get(nameOfTown);
                if(givenGold<0){
                    System.out.println("Gold added cannot be a negative number!");
                }
                else{
                    int oldGold=list.get(1);
                    list.set(1,list.get(1)+givenGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", givenGold,nameOfTown,list.get(1));
                }


            }
            command= scanner.nextLine();
        }

        if(map.size()==0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",map.size());
            for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        }

    }
}
