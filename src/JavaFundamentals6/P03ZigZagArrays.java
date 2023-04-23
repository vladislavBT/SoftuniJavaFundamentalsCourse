package JavaFundamentals6;
import java.util.Scanner;
public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int []arr1=new int[n];
        int []arr2=new int[n];

        for (int i = 0; i < n ; i++) {
                String line= scanner.nextLine();
                String []items=line.split(" ");

                if(i%2==0){
                    arr1[i]=Integer.parseInt(items[0]);
                    arr2[i]=Integer.parseInt(items[1]);
                }
                else{
                    arr1[i]=Integer.parseInt(items[1]);
                    arr2[i]=Integer.parseInt(items[0]);
                }

        }


        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr2[i]);
        }
    }
}
