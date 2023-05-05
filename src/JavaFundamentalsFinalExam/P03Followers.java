package JavaFundamentalsFinalExam;
import java.util.*;

public class P03Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        Map <String, List<Integer>> map = new LinkedHashMap<>();

        while(!command.equals("Log out")){
            String commands[]=command.split(": ");
            if(commands[0].equals("New follower")){
                String name=commands[1];
                if(!map.containsKey(name)){
                    List<Integer> stats = new ArrayList<>();
                    stats.add(0);
                    stats.add(0);
                    map.put(name,stats);
                }
            }
            if(commands[0].equals("Like")){
                String name =commands[1];
                int count = Integer.parseInt(commands[2]);

                if(!map.containsKey(name)){
                    List<Integer> stats = new ArrayList<>();
                    stats.add(count);//index 0-likes
                    stats.add(0);//index 1-comments
                    map.put(name,stats);
                }
                else {
                    List<Integer> stats = map.get(name);
                    int newLikes= stats.get(0)+ count;
                    stats.set(0,newLikes);
                    //index 0-likes
                    //index 1-comments
                    map.put(name,stats);
                }
            }
            if(commands[0].equals("Comment")){
                String name =commands[1];
                if(!map.containsKey(name)){
                    List<Integer> stats = new ArrayList<>();
                    stats.add(0,0);
                    stats.add(1,1);
                    map.put(name,stats);
                }
                else{
                    List<Integer> stats = map.get(name);
                    int newComments = stats.get(1)+1;
                    stats.set(1,newComments);
                    map.put(name,stats);
                }
            }
            if(commands[0].equals("Blocked")){
                String name =commands[1];
                if(!map.containsKey(name)){
                    System.out.printf("%s doesn't exist.%n", name);
                }
                else{
                    map.remove(name);
                }
            }
            command= scanner.nextLine();
        }
        System.out.printf("%d followers%n",map.size());
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int sum=entry.getValue().get(0)+entry.getValue().get(1);
            System.out.printf("%s: %d%n", entry.getKey(),sum);
        }

    }
}
