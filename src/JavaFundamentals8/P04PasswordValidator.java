package JavaFundamentals8;
import java.util.Scanner;
public class P04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        validPassword(scanner.nextLine());
    }

    private static void validPassword(String password) {
        int digits=0;
        int valid=0;
        for (int i = 0; i < password.length(); i++) {
            int num = password.charAt(i);
            if(num>=48 && num<=57){
                digits++;
            }

        }




        for (int i = 0; i < password.length(); i++) {
            int num = password.charAt(i);
            boolean letterOrDigit=((num>=48 && num<=57) || (num>=65 && num <=90) || (num>=97 && num <=122));

            if(!(letterOrDigit)){
                System.out.println("Password must consist only of letters and digits");
                valid=1;
                break;
            }

        }
        valid++;

        if(digits>=2){
            valid++;
        }
        else {
            System.out.println("Password must have at least 2 digits");
        }

        if(password.length()>=6 && password.length()<=10){
            valid++;
        }
        else {
            System.out.println("Password must be between 6 and 10 characters");

        }

        if(valid==2){
            System.out.println("Password is valid");
        }


    }


}
