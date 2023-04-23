package JavaFundamentals6;
import java.util.Scanner;
public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.nextLine();
        String []items=numbers.split(" ");
        int []arr=new int[items.length];
        int sum=-1;
        int myNum=-1;
        int sumLeft=0;
        int sumRight=0;
        int value=0;


        for (int i = 0; i < items.length; i++) {
            arr[i]= Integer.parseInt(items[i]);
        }

        for (int i = 0; i < items.length; i++) {
            sum+=arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {
                sumLeft+=arr[j];
            }
            for (int j = i+1; j < arr.length ; j++) {
                sumRight+=arr[j];
            }
            if(sumRight==sumLeft){
                value=i;
                myNum=value;
            }
            sumRight=0;
            sumLeft=0;
        }
        if(myNum==-1){
            System.out.println("no");
        }
        else if(arr.length==1){
            System.out.println("0");
        }
        else {
            System.out.printf("%d",myNum);
        }



    }
}
