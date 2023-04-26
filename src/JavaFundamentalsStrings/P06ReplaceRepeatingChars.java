package JavaFundamentalsStrings;
import java.util.Scanner;
public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line= scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(line);

        char firstChar;
        char secondChar;
        for (int i = 0; i < sb.length()-1; i++) {
            firstChar=sb.charAt(i);
            secondChar=sb.charAt(i+1);
            if(firstChar==secondChar){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);



    }
}
