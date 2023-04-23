package JavaFundamentals4;
import java.util.Scanner;
public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int letterOne=97;
        int letterTwo=97;
        int letterThree=97;

        for (int i = 0; i < n; i++) {
            char symbolOne= (char)letterOne;
            for (int j = 0; j < n; j++) {
                char symbolTwo= (char)letterTwo;
                for (int k = 0; k < n; k++) {
                    char symbolThree= (char)letterThree;
                    System.out.printf("%c%c%c%n",symbolOne,symbolTwo, symbolThree);
                    letterThree++;
                }
                letterThree=97;
                letterTwo++;
            }
            letterTwo=97;
            letterOne++;
        }

    }
}
