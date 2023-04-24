package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands=Integer.parseInt(scanner.nextLine());
        List<String> list= new ArrayList<>();
        List<String> secondList= new ArrayList<>();

        for (int i = 0; i < numCommands; i++) {
            String command= scanner.nextLine();
            String commands[]=command.split(" ");
            for (int j = 0; j < commands.length; j++) {
                secondList.add(commands[j]);
            }
            if(secondList.get(1).equals("is") && secondList.get(2).equals("going!")){
                if(list.contains(secondList.get(0))){
                    System.out.printf("%s is already in the list!%n", secondList.get(0));
                }
                else{
                  list.add(secondList.get(0));
                }
            }
            else if(secondList.get(1).equals("is") && secondList.get(2).equals("not") && secondList.get(3).equals("going!")){
                if(!(list.contains(secondList.get(0)))){
                    System.out.printf("%s is not in the list!%n", secondList.get(0));
                }
                else {
                    list.remove(secondList.get(0));
                }
            }
            while (secondList.size()>0){
                secondList.remove(0);
            }
        }

        for (String s : list) {
            System.out.printf("%s%n",s);
        }


    }
}
