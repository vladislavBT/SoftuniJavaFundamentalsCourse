package JavaFundamentals4;
import java.util.Scanner;
public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = 0; i < n; i++) {
            String input=scanner.nextLine();
            char symbol=input.charAt(0);
            sum+=(int)symbol;
        }

        System.out.printf("The sum equals: %d", sum);


    }
}
