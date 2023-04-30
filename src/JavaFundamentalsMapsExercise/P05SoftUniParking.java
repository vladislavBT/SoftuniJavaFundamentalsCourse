package JavaFundamentalsMapsExercise;
import java.util.*;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String arr[] = command.split("\\s+");
            String name = arr[1];


            if (arr[0].equals("register")) {
                String ip = arr[2];
                if (map.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", map.get(name));
                } else {
                    map.put(name, ip);
                    System.out.printf("%s registered %s successfully%n", name, ip);
                }
            } else if (arr[0].equals("unregister")) {

                if (map.containsKey(name)) {
                    map.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }


        }
    }


