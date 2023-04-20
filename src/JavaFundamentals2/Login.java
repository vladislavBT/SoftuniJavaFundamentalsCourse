package JavaFundamentals2;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password="";

        for (int i = username.length()-1; i >= 0 ; i--) {
            password += username.charAt(i);
        }
        String input= scanner.nextLine();

        while(!(password.equals(input))){

            System.out.println("Incorrect password. Try again.");
            input=scanner.nextLine();
        }


        if(password.equals(input)){
            System.out.printf("User %s logged in.", username);
        }

    }
}
