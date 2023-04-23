package JavaFundamentals6;
import java.util.Scanner;
public class P07MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers=scanner.nextLine();
        String []items=numbers.split(" ");
        int []arr=new int[items.length];
        int counter=0;
        int remember=0;
        int rememberNum=0;
        int firstNum=0;


        for (int i = 0; i < items.length; i++) {
            arr[i]= Integer.parseInt(items[i]);
        }

        for (int i = 0; i < arr.length-1; i++) {
            firstNum=arr[0];
            if(arr[i]==arr[i+1]){
                counter++;

            }
            else if(counter>remember){
                remember=counter;
                rememberNum=arr[i];
            }
            else{
                counter=0;
            }

        }

        if(counter>remember){
            remember=counter;
            rememberNum=arr[arr.length-1];
        }


if(remember!=0) {
    for (int i = 0; i < remember + 1; i++) {
        System.out.printf("%d ", rememberNum);
    }
}
else{
    System.out.printf("%d ",firstNum);
}



    }
}
