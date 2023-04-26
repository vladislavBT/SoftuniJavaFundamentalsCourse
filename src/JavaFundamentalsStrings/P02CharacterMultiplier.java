package JavaFundamentalsStrings;
import java.util.Scanner;
public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String twoArrays [] = scanner.nextLine().split(" ");
        char firstArr[]=twoArrays[0].toCharArray();
        char secondArr[]=twoArrays[1].toCharArray();
        int sum=0;

        int lengthOfLongerString=0;
        int lengthOfShorterString=0;

        if(firstArr.length>secondArr.length){
            lengthOfLongerString=firstArr.length;
            lengthOfShorterString= secondArr.length;
        }
        else if(firstArr.length==secondArr.length){
            lengthOfLongerString=firstArr.length;
            lengthOfShorterString= secondArr.length;
        }
        else{
            lengthOfLongerString=secondArr.length;
            lengthOfShorterString= firstArr.length;
        }

        for (int i = 0; i < lengthOfShorterString; i++) {
            sum+=firstArr[i]*secondArr[i];
        }
        for (int i = lengthOfShorterString; i < lengthOfLongerString; i++) {
            if(firstArr.length>secondArr.length) {
                sum += firstArr[i];
            }
            else {
                sum+= secondArr[i];
            }
        }

        System.out.println(sum);


    }
}
