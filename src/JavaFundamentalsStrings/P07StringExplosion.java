package JavaFundamentalsStrings;
import java.util.Scanner;
public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder sb =new StringBuilder();
        sb.append(line);
        int strength=0;
        for (int i = 0; i < sb.length(); i++) {
            if(strength>0 && sb.charAt(i) != '>'){
                sb.deleteCharAt(i);
                strength--;
                i--;
            }
            else if(sb.charAt(i)=='>'){
             strength+= Integer.parseInt(String.valueOf(sb.charAt(i+1)));
                
            }
        }
        System.out.println(sb);
    }
}
