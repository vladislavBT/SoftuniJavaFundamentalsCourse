package JavaFundamentals2;
import java.util.Scanner;
public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double display= Double.parseDouble(scanner.nextLine());
        int counter=0;

        double sum=0;
        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0) {
                sum += keyboardPrice;
                counter++;
            }  if (i % 2 == 0) {
                sum += headsetPrice;
            }  if (i % 3 == 0) {
                sum += mousePrice;
            }
            if (counter == 2) {
                sum += display;
                counter=0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
