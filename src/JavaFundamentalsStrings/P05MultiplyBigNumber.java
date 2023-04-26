package JavaFundamentalsStrings;
import java.util.Scanner;
public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int smallNumber = scanner.nextInt();
        int reminder = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            if (i == 0) {
                int digit = bigNumber.charAt(i) - 48;
                int product = (digit * smallNumber) + reminder;
                sb.insert(0, product);

            } else {
                int digit = bigNumber.charAt(i) - 48;
                int product = (digit * smallNumber) + reminder;
                reminder = product / 10;
                int result = product % 10;

                sb.insert(0, result);
            }

        }

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);

        }
        System.out.println(sb);
    }
}
