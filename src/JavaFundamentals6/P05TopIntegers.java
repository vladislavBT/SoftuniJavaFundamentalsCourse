package JavaFundamentals6;
import java.util.Scanner;
public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers=scanner.nextLine();
        String []items=numbers.split(" ");
        int []arr=new int[items.length];
        int counter=0;
        int index=0;
        int []top=new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arr[i]= Integer.parseInt(items[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            counter=0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    counter++;
                }
                else{
                    continue;
                }
            }
            if(counter==arr.length-(i+1)){
                top[index]=arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.printf("%d ",top[i]);
        }

    }
}
