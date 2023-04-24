package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers= scanner.nextLine();

        String arr[]=lineOfNumbers.split("|");
        List<String> list= new ArrayList<>();

        List<String> listFinal= new ArrayList<>();

        for (int i =0; i < arr.length; i++) {
            String array[]=arr[i].split("\\s+");
            for (String s : array) {
                list.add(s);
            }
        }

        int index;
        int previousIndex=list.size()-1;
        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i).equals("|")){
                index=i;
                for (int j = 0; j < previousIndex-index; j++) {
                    listFinal.add(list.get(j+index+1));
                }
                previousIndex=index-1;
            }
            if(i==0){
                index=i;
                for (int j = 0; j < previousIndex-index+1; j++) {
                    listFinal.add(list.get(j+index));
                }
            }
        }
        for (String s : listFinal) {
            System.out.printf("%s ", s);
        }

    }
}
