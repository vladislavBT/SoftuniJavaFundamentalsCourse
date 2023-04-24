package JavaFundamentals8;
import java.util.Scanner;
public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        matrix(n);

    }

    private static void matrix(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ",n);
            }
        }

    }
}
