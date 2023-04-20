import java.util.Scanner;
public class ITexercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double p = (a+b+c)/2;
        if(a<b+c && b<a+c && c<a+b){
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(S);


        }
    else{
            System.out.println("Няма такъв триъгълник");
        }}
}
