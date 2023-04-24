package JavaFundamentals8;
import java.util.Scanner;
public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        topNumbers(scanner);
    }

    private static void topNumbers(Scanner scanner) {
        String n =scanner.nextLine();
        int q=Integer.parseInt(n);
        int sum = 0;
        int counter=0;
        int odd=0;


        for (int i = 1; i <= q ; i++) {
             String p =""+i;

            for (int j = 0; j < p.length(); j++) {
                int num=p.charAt(j);
                sum+=num-48;
                if((num-48)%2==1){
                  odd++;
                }
            }
            if(odd>=1){
                counter++;
                odd=0;
            }
            if(sum%8==0){
                counter++;
            }
            if(counter==2){
                counter=0;
                System.out.println(i);
            }
            else{
                counter=0;
            }
            sum=0;
        }
    }
}
