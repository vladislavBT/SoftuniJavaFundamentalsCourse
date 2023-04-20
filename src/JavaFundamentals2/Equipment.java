package JavaFundamentals2;
import java.util.Scanner;
public class Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double priceLightsabers= Double.parseDouble(scanner.nextLine());
        double priceRobes=Double.parseDouble(scanner.nextLine());
        double priceBelts=Double.parseDouble(scanner.nextLine());


        double neededMoney=priceLightsabers*(Math.ceil(students*1.1))+students*priceRobes;
        if(students/6>=1){
            neededMoney+=(students-Math.floor(students/6))*priceBelts;
        }
        else{
            neededMoney+=students*priceBelts;
        }

        if(neededMoney<=money){
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);

        }
        else{
            System.out.printf("George Lucas will need %.2flv more.", neededMoney-money);
        }

    }

}
