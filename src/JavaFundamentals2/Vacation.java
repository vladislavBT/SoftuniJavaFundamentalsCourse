package JavaFundamentals2;
import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people=Integer.parseInt(scanner.nextLine());
        String group= scanner.nextLine();
        String dayOfWeek=scanner.nextLine();

        double pricePerPerson=0;
        double totalPrice=0;

        switch (group){
            case "Students":
                if(dayOfWeek.equals("Friday")){
                    pricePerPerson=8.45;
                    totalPrice=pricePerPerson*people;
                    if(people>=30){
                        totalPrice*=0.85;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                else if(dayOfWeek.equals("Saturday")){
                    pricePerPerson=9.80;
                    totalPrice=pricePerPerson*people;
                    if(people>=30){
                        totalPrice*=0.85;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);

                }
                else if(dayOfWeek.equals("Sunday")){
                    pricePerPerson=10.46;
                    totalPrice=pricePerPerson*people;
                    if(people>=30){
                        totalPrice*=0.85;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                break;
            case "Business":
                if(dayOfWeek.equals("Friday")){
                    pricePerPerson=10.90;
                    totalPrice=pricePerPerson*people;
                    if(people>=100){
                        people=-10;
                        totalPrice=pricePerPerson*people;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                else if(dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 15.60;
                    totalPrice = pricePerPerson * people;
                    if (people >= 100) {
                        people = -10;
                        totalPrice = pricePerPerson * people;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                else if(dayOfWeek.equals("Sunday")) {
                        pricePerPerson = 16;
                        totalPrice = pricePerPerson * people;
                        if (people >= 100) {
                            people = -10;
                            totalPrice = pricePerPerson * people;
                        }
                    System.out.printf("Total price: %.2f", totalPrice);
                    }
                break;
            case "Regular":
                if(dayOfWeek.equals("Friday")){
                    pricePerPerson=15;
                    totalPrice=pricePerPerson*people;
                    if(people>=10 && people<=20){
                        totalPrice*=0.95;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                    }

                else if(dayOfWeek.equals("Saturday")){
                    pricePerPerson=20;
                    totalPrice=pricePerPerson*people;
                    if(people>=10 && people<=20){
                        totalPrice*=0.95;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                else if(dayOfWeek.equals("Sunday")){
                    pricePerPerson=22.50;
                    totalPrice=pricePerPerson*people;
                    if(people>=10 && people<=20){
                        totalPrice*=0.95;
                    }
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                break;

        }
    }
}
