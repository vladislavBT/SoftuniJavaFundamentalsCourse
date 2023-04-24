package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P05BombNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String arr[] = lineOfNumbers.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        int sum=0;
        int numSpecialNumbers=0;

        String lineOfNumbers2 = scanner.nextLine();
        String arr2[] = lineOfNumbers2.split(" ");
        int specialNum=Integer.parseInt(arr2[0]);
        int numDetonated=Integer.parseInt(arr2[1]);

        int index;
        int numRemoved=0;

        for (int i = 0; i < list.size(); i++) {
if(list.get(i)==specialNum) {
    numSpecialNumbers++;
    index = i;
    for (int j = 0; j < numDetonated; j++) {
        list.remove(index - numDetonated);
        numRemoved++;
    }
    for (int j = 0; j < numDetonated; j++) {
        if((index-numRemoved + 1)<=list.size()-1) {
            list.remove(index - numRemoved + 1);
        }
    }
}
numRemoved=0;
        }


        for (Integer integer : list) {
            sum+=integer;
        }
        sum-=numSpecialNumbers*specialNum;
        System.out.print(sum);


    }
}
