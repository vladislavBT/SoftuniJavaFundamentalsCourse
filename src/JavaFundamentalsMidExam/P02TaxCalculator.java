package JavaFundamentalsMidExam;
import java.util.Scanner;
public class P02TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfVehicles= scanner.nextLine();
        String [] arr= lineOfVehicles.split(">>");
        double sum=0;

        for (int i = 0; i < arr.length; i++) {
           String [] separated=arr[i].split(" ");
           if(separated[0].equals("family")){
               int years= Integer.parseInt(separated[1]);
               int travel=Integer.parseInt(separated[2]);

               double tax=(50-5*years)+(travel/3000)*12;
               sum+=tax;
               System.out.printf("A family car will pay %.2f euros in taxes.%n",tax);
           }
           else if(separated[0].equals("heavyDuty")){
               int years= Integer.parseInt(separated[1]);
               int travel=Integer.parseInt(separated[2]);

              double tax=(80-8*years)+(travel/9000)*14;
               sum+=tax;
               System.out.printf("A heavyDuty car will pay %.2f euros in taxes.%n",tax);
           }
           else if(separated[0].equals("sports")){
               int years= Integer.parseInt(separated[1]);
               int travel=Integer.parseInt(separated[2]);

               double tax=(100-9*years)+(travel/2000)*18;
               sum+=tax;
               System.out.printf("A sports car will pay %.2f euros in taxes.%n",tax);
           }
           else{
               System.out.println("Invalid car type.");

           }
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",sum);


    }

}
