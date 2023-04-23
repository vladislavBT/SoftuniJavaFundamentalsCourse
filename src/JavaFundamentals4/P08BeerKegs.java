package JavaFundamentals4;
import java.util.Scanner;
public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double volume=0;
        double maxVolume=0;
        String maxModel="";

        for (int i = 0; i < n; i++) {
            String model= scanner.nextLine();
            float radius= Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume=radius*radius*height*Math.PI;
            if(maxVolume<volume){
                maxVolume=volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
