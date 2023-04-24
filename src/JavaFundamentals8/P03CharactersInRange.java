package JavaFundamentals8;
import java.util.Calendar;
import java.util.Scanner;
public class P03CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        charactersInRange(scanner.nextLine(), scanner.nextLine());
    }
    public static void charactersInRange(String first,String second){
int change=0;
        char firstChar=first.charAt(0);
        char secondChar=second.charAt(0);

        int numOne=firstChar;
        int numTwo=secondChar;
        if(numOne>numTwo){
            change=numOne;
            numOne=numTwo;
            numTwo=change;

        }

        for (int i = numOne+1; i <numTwo ; i++) {

            System.out.printf("%c ",(char)i);
        }

    }
}
