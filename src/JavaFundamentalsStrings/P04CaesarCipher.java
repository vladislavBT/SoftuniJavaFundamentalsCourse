package JavaFundamentalsStrings;
import java.util.Scanner;
public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        char [] input =line.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            int newCharIndex= (int)input[i]+3;
            char newChar= (char) newCharIndex;
            sb.append(newChar);
        }
        System.out.println(sb);

    }
}
