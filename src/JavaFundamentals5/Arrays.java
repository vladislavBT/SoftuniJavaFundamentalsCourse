package JavaFundamentals5;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter=0;



        String numbers=scanner.nextLine();
        String [] items= numbers.split(" ");

        int [] arr=new int [items.length];



        for (int i = 0; i < items.length; i++) {
            arr[i]=Integer.parseInt(items[i]);
        }

        int [] arrayForCounter= new int [arr.length-1];


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                counter++;
                arrayForCounter[i]=counter;
            }
            else{
                counter=0;
                arrayForCounter[i]=counter;
            }
        }

        for (int i = 0; i < arrayForCounter.length; i++) {

            System.out.println(arrayForCounter[i]);

        }

        //1 2 1 2 1 1 1 2 3 4 5 1 2 1 2
        int max=arrayForCounter[0];
        for (int i = 0; i < arrayForCounter.length; i++) {
            if(arrayForCounter[i]> max){
                max=arrayForCounter[i];
            }
        }

        System.out.println(max+1);




            }
        }








