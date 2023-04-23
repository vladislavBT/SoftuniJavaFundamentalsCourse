package JavaFundamentals4;
import java.util.Scanner;
public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int days=0;
        int sum=0;
        while(n>=100){
            sum+=n-26;
            n-=10;
            days++;

        }
        sum-=26;

        System.out.println(days);
        System.out.println(sum);
    }
}
