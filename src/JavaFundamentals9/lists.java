package JavaFundamentals9;
import java.util.ArrayList;
import  java.util.Scanner;
public class lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //array
        int arr[]=new int []{1,2,3};
        for (int i = 0; i <= 2; i++) {
            System.out.println(arr[i]);
        }

        //List
        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("love");
        wordsList.add("hate");
        wordsList.add("feel");
        wordsList.add("smile");

        System.out.println(wordsList.get(1));

        wordsList.set(1,"like");

        for (int i = 0; i < 4; i++) {
            System.out.println(wordsList.get(i));
        }
    }
}
