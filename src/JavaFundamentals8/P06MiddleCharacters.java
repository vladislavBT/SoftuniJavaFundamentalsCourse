package JavaFundamentals8;
import java.util.Scanner;
public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        middle(word);
    }

    private static void middle(String word) {
        if(word.length()%2==1){
          int num= (word.length()+1)/2;
            System.out.println(word.charAt(num-1));
        }
        else{
            int num= word.length()/2;
            char first=word.charAt(num-1);
            char second=word.charAt(num);


            System.out.printf("%c%c",first,second);

        }


    }


}
