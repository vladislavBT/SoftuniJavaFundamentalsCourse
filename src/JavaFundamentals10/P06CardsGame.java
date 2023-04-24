package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String arrA[] = lineOfNumbers.split(" ");
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < arrA.length; i++) {
            listA.add(Integer.parseInt(arrA[i]));
        }

        String secondLineOfNumbers = scanner.nextLine();
        String arrB[] = secondLineOfNumbers.split(" ");
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < arrB.length; i++) {
            listB.add(Integer.parseInt(arrB[i]));
        }

        while(!(listA.size()==0||listB.size()==0)){
            if(listA.get(0)>listB.get(0)){
                listA.add(listA.size(),listA.get(0));
                listA.remove(0);
                listA.add(listA.size(),listB.get(0));
                listB.remove(0);
            }
            else if(listA.get(0)==listB.get(0)){
                listA.remove(0);
                listB.remove(0);
            }
            else if(listA.get(0)<listB.get(0)){
                listB.add(listB.size(),listB.get(0));
                listB.remove(0);
                listB.add(listB.size(),listA.get(0));
                listA.remove(0);
            }

        }
        int sum=0;

        if(listA.size()==0){
            for (Integer integer : listB) {
                sum+=integer;
            }

            System.out.printf("Second player wins! Sum: %d",sum);
        }
        else if(listB.size()==0){
            for (Integer integer : listA) {
                sum+=integer;
            }

            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}
