package JavaFundamentals6;
import java.util.Scanner;
public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());
        int changer=0;
        String []items=numbers.split(" ");

        int arr[]=new int [items.length];
        for (int i = 0; i < items.length; i++) {
            arr[i]=Integer.parseInt(items[i]);
        }


        for (int j = 0; j < n; j++) {
            changer = arr[0];

            for (int i = 0; i < arr.length-1; i++) {

                arr[i] = arr[i + 1];


            }
            arr[arr.length-1] = changer;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }

    }
}
