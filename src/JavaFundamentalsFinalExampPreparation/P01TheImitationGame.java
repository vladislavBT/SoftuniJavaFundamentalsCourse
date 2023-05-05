package JavaFundamentalsFinalExampPreparation;
import java.util.Scanner;
public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage=scanner.nextLine();
        String command= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(encryptedMessage);
        while(!command.equals("Decode")){
            String [] arr=command.split("\\|");
            if(arr[0].equals("ChangeAll")){
                char oldSymbol=arr[1].charAt(0);
                char newSymbol=arr[2].charAt(0);
               sb=changeAll(sb,oldSymbol,newSymbol);
            }
            else if(arr[0].equals("Insert")){
                    int index=Integer.parseInt(arr[1]);
                    String symbol=arr[2];
                    insert(sb, index, symbol);
            }
            else if(arr[0].equals("Move")){
                int n=Integer.parseInt(arr[1]);
                move(sb, n);
            }
            command= scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",sb.toString());
    }

    private static StringBuilder move(StringBuilder sb, int n) {
        String text= sb.toString();
        for (int i = 0; i < n; i++) {
            sb.append(text.charAt(i));
        }
        sb.replace(0,n,"");

        return sb;
    }

    private static StringBuilder insert(StringBuilder sb, int index, String text) {
        sb.insert(index,text);
        return sb;
    }

    private static StringBuilder changeAll(StringBuilder sb,char changed, char newChar) {
        for (int i = 0; i < sb.length() ; i++) {
            if(sb.charAt(i)==changed){
                sb.setCharAt(i,newChar);
            }
        }
        return sb;
    }
}
