package JavaFundamentalsMidPreparation;
import java.util.Scanner;
public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee=Integer.parseInt(scanner.nextLine());
        int secondEmployee=Integer.parseInt(scanner.nextLine());
        int thirdEmployee=Integer.parseInt(scanner.nextLine());

        int numStudents=Integer.parseInt(scanner.nextLine());
        int iterations=0;

        while (numStudents>0){
            iterations++;
            if(!(iterations%4==0)) {
                int sumOfEmployeesWork = firstEmployee + secondEmployee + thirdEmployee;
                numStudents-=sumOfEmployeesWork;
            }

        }

        System.out.printf("Time needed: %dh.",iterations);
    }
}
