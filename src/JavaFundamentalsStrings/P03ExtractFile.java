package JavaFundamentalsStrings;
import java.util.Scanner;
public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileExtension= scanner.nextLine();
        int theLastIndex=fileExtension.lastIndexOf('\\');

        fileExtension= fileExtension.substring(theLastIndex+1);
        String [] fileProperties= fileExtension.split("\\.");
        System.out.printf("File name: %s%n",fileProperties[0]);
        System.out.printf("File extension: %s%n",fileProperties[1]);

    }
}
