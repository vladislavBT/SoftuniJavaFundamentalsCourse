package JavaFundamentals8;
import java.util.Scanner;
public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());

        factorialDivision(a,b);
    }

    private static void factorialDivision(int a,int b) {
        double multiplyOne=1.0;
        double multiplyTwo=1.0;
        for (int i = 1; i <= a; i++) {
            multiplyOne*=i;
        }

        for (int i = 1; i <= b; i++) {
            multiplyTwo*=i;
        }

        double division=multiplyOne/multiplyTwo;
        System.out.printf("%.2f",division);
    }
}
