package JavaFundamentals4;
import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int capacity=255;
        int sumWater=0;

        for (int i = 0; i < n; i++) {
            int pourWater=Integer.parseInt(scanner.nextLine());
            if(capacity>=sumWater+pourWater){
                sumWater+=pourWater;

            }
            else{
                System.out.printf("Insufficient capacity!%n");
            }
        }

        System.out.println(sumWater);
    }
}
