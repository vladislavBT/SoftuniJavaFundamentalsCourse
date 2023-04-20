package JavaFundamentals2;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        double totalMoney=0;

        while(!(command.equals("Start"))){
            double money = Double.parseDouble(command);
            if(money==0.5 || money==1 || money==0.2 || money==0.1){
                totalMoney+= money;
            }
            else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            command= scanner.nextLine();
        }

        while (!(command.equals("End"))){
            command= scanner.nextLine();
            if(command.equals("Nuts")){
                if(totalMoney-2.0>=0) {
                    totalMoney -= 2.0;
                    System.out.printf("Purchased %s%n", command);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(command.equals("Water")){
                if(totalMoney-0.7>=0) {
                    totalMoney -= 0.7;
                    System.out.printf("Purchased %s%n", command);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(command.equals("Crisps")){
                if(totalMoney-1.5>=0) {
                    totalMoney -= 1.5;
                    System.out.printf("Purchased %s%n", command);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(command.equals("Soda")){
                if(totalMoney-0.8>=0) {
                    totalMoney -= 0.8;
                    System.out.printf("Purchased %s%n", command);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(command.equals("Coke")){
                if(totalMoney-1.0>=0) {
                    totalMoney -= 1.0;
                    System.out.printf("Purchased %s%n", command);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (!(command.equals("End"))){
                System.out.printf("Invalid product%n");
                command= scanner.nextLine();
            }

        }

        System.out.printf("Change: %.2f", totalMoney);



    }
}
