package JavaFundamentals1;
import  java.util.Scanner;
public class firstFundamental {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());

        if(hours<24 && hours>9){
            if(minutes<30){
                minutes=minutes+30;
                System.out.printf("%d:%d",hours,minutes);
            }

            else{
                hours+=1;
                minutes=30-(60-minutes);
                System.out.printf("%d:%d",hours,minutes);
            }
        }
        else if(hours<9){
            if(minutes<30){
                minutes=minutes+30;
                System.out.printf("0%d:%d",hours,minutes);
            }

            else{
                hours+=1;
                minutes=30-(60-minutes);
                System.out.printf("0%d:%d",hours,minutes);
            }

        }



    }
}
