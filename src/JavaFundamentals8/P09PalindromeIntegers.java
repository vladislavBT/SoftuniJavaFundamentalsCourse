package JavaFundamentals8;
import java.util.Scanner;
public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        palindrome(scanner);

    }

    private static void palindrome(Scanner scanner) {
        String palindrome= scanner.nextLine();

        while(!palindrome.equals("END")){
            int counter=0;
            if(palindrome.length()%2==1){
                int arr[]=new int [palindrome.length()];
                for (int i = 0; i < palindrome.length(); i++) {
                    arr[i]=palindrome.charAt(i);
                }
                for (int i = 0; i < (palindrome.length()-1)/2; i++) {
                    if(arr[i]==arr[palindrome.length()-1-i]){
                        counter++;
                    }
                }
                if(counter==(palindrome.length()-1)/2){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }

            }
            else{
                int arr[]=new int [palindrome.length()];
                for (int i = 0; i < palindrome.length(); i++) {
                    arr[i]=palindrome.charAt(i);
                }
                for (int i = 0; i < palindrome.length()/2; i++) {
                    if(arr[i]==arr[palindrome.length()-1-i]){
                        counter++;
                    }
                }
                if(counter==palindrome.length()/2){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            palindrome= scanner.nextLine();
        }

    }
}
