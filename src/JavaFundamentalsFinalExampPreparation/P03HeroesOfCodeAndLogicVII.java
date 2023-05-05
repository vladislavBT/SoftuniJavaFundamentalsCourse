package JavaFundamentalsFinalExampPreparation;
import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());

        Map <String,List<Integer>>map= new LinkedHashMap();
        for (int i = 0; i < n; i++) {
            String [] player = scanner.nextLine().split(" ");
            if(Integer.parseInt(player[1])<=100 && Integer.parseInt(player[2])<=200) {
                List <Integer> list = new ArrayList<>();
                list.add(Integer.parseInt(player[1]));
                list.add(Integer.parseInt(player[2]));
                map.put(player[0], list);
            }
        }

        String command= scanner.nextLine();
        while(!command.equals("End")){
            String movement[]=command.split(" - ");
            if(movement[0].equals("CastSpell")){
                CastSpell(map,movement[1],Integer.parseInt(movement[2]),movement[3]);
            }
            else if(movement[0].equals("TakeDamage")){
                TakeDamage(map,movement[1],Integer.parseInt(movement[2]),movement[3]);
            }
            else if(movement[0].equals("Recharge")){
                Recharge(map,movement[1],Integer.parseInt(movement[2]));
            }
            else if(movement[0].equals("Heal")){
                Heal(map,movement[1],Integer.parseInt(movement[2]));
            }

            command= scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n",entry.getValue().get(0));
            System.out.printf("  MP: %d%n",entry.getValue().get(1));
        }


    }

    private static Map Heal(Map<String,List<Integer>>map,String nameOfPlayer, int amount) {
        if(map.get(nameOfPlayer).get(0)+amount<=100){
            int currentHP=map.get(nameOfPlayer).get(0);
            currentHP=currentHP+amount;
            map.get(nameOfPlayer).remove(0);
            map.get(nameOfPlayer).add(0,currentHP);
            System.out.printf("%s healed for %d HP!%n",nameOfPlayer,amount);
        }
        else {
            int lastHP=map.get(nameOfPlayer).get(0);
            map.get(nameOfPlayer).remove(0);
            map.get(nameOfPlayer).add(0,100);
            System.out.printf("%s healed for %d HP!%n",nameOfPlayer,100-lastHP);
        }
        return map;
    }

    private static Map Recharge(Map<String,List<Integer>>map,String nameOfPlayer, int amount) {
        if(map.get(nameOfPlayer).get(1)+amount<=200){
            int currentMP=map.get(nameOfPlayer).get(1);
            currentMP=currentMP+amount;
            map.get(nameOfPlayer).remove(1);
            map.get(nameOfPlayer).add(1,currentMP);
            System.out.printf("%s recharged for %d MP!%n",nameOfPlayer,amount);
        }
        else {
            int lastMP=map.get(nameOfPlayer).get(1);
            map.get(nameOfPlayer).remove(1);
            map.get(nameOfPlayer).add(1,200);
            System.out.printf("%s recharged for %d MP!%n",nameOfPlayer,200-lastMP);
        }

        return map;
    }

    private static Map TakeDamage(Map<String,List<Integer>>map,String nameOfPlayer, int damage, String nameOfAttacker) {
        if(map.get(nameOfPlayer).get(0) > damage){
            int currentHP=map.get(nameOfPlayer).get(0);
            currentHP=currentHP-damage;
            map.get(nameOfPlayer).remove(0);
            map.get(nameOfPlayer).add(0,currentHP);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",nameOfPlayer,damage,nameOfAttacker,map.get(nameOfPlayer).get(0));
        }
        else{
            System.out.printf("%s has been killed by %s!%n",nameOfPlayer,nameOfAttacker);
            map.remove(nameOfPlayer);
        }
        return map;
    }

    private static Map CastSpell(Map<String,List<Integer>>map,String nameOfPlayer, int neededMP, String spellName) {
        if(map.get(nameOfPlayer).get(1) >= neededMP){
            int currentMP=map.get(nameOfPlayer).get(1);
            currentMP=currentMP-neededMP;
            map.get(nameOfPlayer).remove(1);
            map.get(nameOfPlayer).add(1,currentMP);
            System.out.printf("%s has successfully cast %s and now has %d MP!%n",nameOfPlayer, spellName,map.get(nameOfPlayer).get(1));
        }
        else {
            System.out.printf("%s does not have enough MP to cast %s!%n",nameOfPlayer,spellName);
        }
        return map;
    }

}
