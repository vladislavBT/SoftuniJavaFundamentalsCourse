package JavaFundamentals8;
import java.util.Scanner;
public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        System.out.println(sumAndSubtract(a,b,c));
    }


    public static int sumAndSubtract(int a,int b,int c){
        int result = a+b-c;

        return result;
    }
}
