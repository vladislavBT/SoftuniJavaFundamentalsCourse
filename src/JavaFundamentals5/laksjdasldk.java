package JavaFundamentals5;
import java.util.Scanner;
public class laksjdasldk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values=scanner.nextLine();
        String [] items= values.split(" ");

        int [] arr=new int [items.length];


        for (int i = 0; i < items.length; i++) {
            arr[i]=Integer.parseInt(items[i]);
        }
    }
}
