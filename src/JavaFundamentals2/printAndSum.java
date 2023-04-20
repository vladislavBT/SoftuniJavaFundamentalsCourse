package JavaFundamentals2;
import java.util.Scanner;
public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for(int n=firstNumber; n<=lastNumber; n++){
            sum+=n;
            System.out.print(n + " " );
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
