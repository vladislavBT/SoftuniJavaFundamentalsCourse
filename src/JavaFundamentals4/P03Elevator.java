package JavaFundamentals4;
import java.util.Scanner;
public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int p=Integer.parseInt(scanner.nextLine());

        if(n%p!=0){
            System.out.println(n/p+1);

        }
        else{
            System.out.println(n/p);
        }



    }
}
