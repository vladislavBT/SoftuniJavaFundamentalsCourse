package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String arr[] = lineOfNumbers.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        String command=scanner.nextLine();
        while (!command.equals("End")){
            String data[]=command.split(" ");
            String cases=data[0];
            String cases2=data[1];

            if(cases.equals("Add")){
                int number=Integer.parseInt(data[1]);
                list.add(number);
            }
            else if(cases.equals("Insert")){
                int number=Integer.parseInt(data[1]);
                int index= Integer.parseInt(data[2]);
                if(index<=list.size()-1) {
                    list.add(index, number);
                }
                else {
                    System.out.printf("Invalid index%n");
                }
            }
            else if(cases.equals("Remove")){
                int index= Integer.parseInt(data[1]);
                if(index<=list.size()-1) {
                    list.remove(index);
                }
                else {
                    System.out.printf("Invalid index%n");
                }
            }
            else if(cases.equals("Shift") && cases2.equals("left")){
                int count=Integer.parseInt(data[2]);
                for (int i = 0; i < count; i++) {
                    list.add(list.get(0));
                    list.remove(0);
                }

            }
            else if(cases.equals("Shift") && cases2.equals("right")){
                int count=Integer.parseInt(data[2]);
                for (int i = 0; i < count; i++) {
                    list.add(0,list.get(list.size()-1));
                    list.remove(list.size()-1);

                }
            }
            command=scanner.nextLine();

        }
        for (Integer integer : list) {
            System.out.printf("%d ",integer);
        }

    }
}
