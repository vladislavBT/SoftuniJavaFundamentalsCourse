package JavaFundamentals8;
import java.util.Scanner;
public class P01SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        int y=Integer.parseInt(scanner.nextLine());
        int z=Integer.parseInt(scanner.nextLine());

        theSmallest(x,y,z);


    }
    static void theSmallest(int x,int y, int z){
        int q=Integer.MAX_VALUE;
        if(q>x){
            q=x;
        }
        if(q>y){
            q=y;
        }
        if(q>z){
            q=z;
        }
        System.out.println(q);

    }
}
