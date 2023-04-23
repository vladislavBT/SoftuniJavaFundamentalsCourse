package JavaFundamentals4;
import javax.swing.*;
import java.util.Scanner;
public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;

        String number=String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            char digitAt= number.charAt(i);
            int digit= (int)digitAt-48;
            sum+=digit;


        }

        System.out.println(sum);
    }
}
