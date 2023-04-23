package JavaFundamentals4;
import java.util.Scanner;
public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int maxValue=0;
        int maxSnow=0;
        int maxTime=0;
        int maxQuality=0;

        for (int i = 0; i < n; i++) {
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());

            int snowballValue=(snowballSnow/snowballTime);

            for (int j = 0; j < snowballQuality-1; j++) {
                snowballValue*=(snowballSnow/snowballTime);
            }

            if(snowballValue>maxValue){
                maxValue=snowballValue;
                maxSnow=snowballSnow;
                maxTime=snowballTime;
                maxQuality=snowballQuality;
            }
        }


        System.out.printf("%d : %d = %d (%d)",maxSnow,maxTime, maxValue, maxQuality);








    }
}
