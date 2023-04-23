package JavaFundamentals6;
import java.util.Scanner;
public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers=scanner.nextLine();
        String []items=numbers.split(" ");
        int []arr=new int[items.length];
        int number=Integer.parseInt(scanner.nextLine());;

        for (int i = 0; i < items.length; i++) {
            arr[i]= Integer.parseInt(items[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==number){
                    System.out.printf("%d %d%n",arr[i],arr[j]);
                }
            }
        }
    }
}
