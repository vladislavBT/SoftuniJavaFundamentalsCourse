package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String arr[] = lineOfNumbers.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        String command=scanner.nextLine();
        String commands[]=command.split(" ");
        List<String> Commands=new ArrayList<>(commands.length);
        for (int i = 0; i < commands.length; i++) {
            Commands.add(commands[i]);
        }
        while (!command.equals("end")) {
            if (Commands.get(0).equals("Delete")) {
                delete(list, command);
            } else {
                insert(list, command);
            }

            command= scanner.nextLine();
           while (!(Commands.size()==0)){
               Commands.remove(0);
           }
           String newCommands[]=command.split(" ");
            for (int i = 0; i < newCommands.length; i++) {
                Commands.add(newCommands[i]);
            }
        }
        for (Integer integer : list) {
            System.out.printf("%d ",integer);
        }

    }


    private static List<Integer> insert(List<Integer> insertList, String command) {
        String arr[]=command.split(" ");
        int value=Integer.parseInt(arr[1]);
        int index=Integer.parseInt(arr[2]);

        insertList.add(index,value);

        return insertList;
    }

    private static List<Integer> delete(List<Integer> deleteList, String command) {
        String arr[]=command.split(" ");
        int value=Integer.parseInt(arr[1]);
        for (int i = 0; i < deleteList.size(); i++) {
            if(deleteList.get(i)==value) {
                deleteList.remove(Integer.valueOf(value));
                i--;
            }
        }



        return deleteList;
    }
}
