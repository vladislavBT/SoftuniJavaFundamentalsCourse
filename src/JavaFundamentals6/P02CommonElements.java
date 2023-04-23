package JavaFundamentals6;
import java.util.Scanner;
public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstArr= scanner.nextLine();
        String secondArr=scanner.nextLine();
        int num=0,num2=0;


        String [] arrOne= firstArr.split(" ");
        String [] arrTwo=secondArr.split(" ");
        String [] arrThree= new String[arrTwo.length];
        String [] arrFour= new String[arrThree.length];

        for (int i = 0; i < arrOne.length; i++) {

            for (int j = 0; j < arrTwo.length; j++) {
                if(arrTwo[j].equals(arrOne[i])){
                    arrThree[num]=arrTwo[j];
                    num++;
                }
            }
        }

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrThree.length; j++) {

                if(arrTwo[i].equals(arrThree[j])){
                    arrFour[num2]=arrThree[j];
                    num2++;
                }

            }


        }


        for (int i = 0; i < num2; i++) {
            System.out.printf("%s ", arrFour[i]);
        }

    }
}
