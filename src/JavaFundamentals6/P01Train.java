package JavaFundamentals6;

import java.util.Scanner;

public class P01Train {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int [] arr = new int[n];
            int sum=0;

            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(scanner.nextLine());
                sum+=arr[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.printf("%d ",arr[i]);
            }
            System.out.printf("%n%d",sum);
        }
    }


