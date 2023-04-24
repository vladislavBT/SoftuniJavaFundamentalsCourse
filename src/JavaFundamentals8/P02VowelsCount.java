package JavaFundamentals8;
import java.util.Scanner;
public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vowelsOfWord(scanner.nextLine());

    }

    static void vowelsOfWord(String word){
        int counter=0;
        for (int i = 0; i < word.length(); i++) {
            if((word.charAt(i))=='A'){
                counter++;
            }
            else if((word.charAt(i))=='a'){
                counter++;

            }
            else if((word.charAt(i))=='I'){
                counter++;

            }
            else if((word.charAt(i))=='i'){
                counter++;

            }
            else if((word.charAt(i))=='O'){
                counter++;

            }
            else if((word.charAt(i))=='o'){
                counter++;

            }
            else if((word.charAt(i))=='U'){
                counter++;

            }
            else if((word.charAt(i))=='u'){
                counter++;

            }
            else if((word.charAt(i))=='E'){
                counter++;

            }
            else if((word.charAt(i))=='e'){
                counter++;

            }
        }

        System.out.println(counter);
    }
}
