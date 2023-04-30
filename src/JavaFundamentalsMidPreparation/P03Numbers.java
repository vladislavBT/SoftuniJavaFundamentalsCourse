package JavaFundamentalsMidPreparation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String lineOfNeighborhoods= scanner.nextLine();
        String arr[]=lineOfNeighborhoods.split("@");
        List<Integer> neighborhoods= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            neighborhoods.add(Integer.parseInt(arr[i]));
        }
        
        String command=scanner.nextLine();
        int indexOfHouse=0;
        while (!(command.equals("Love!"))){
            String commands[]=command.split(" ");
            if(indexOfHouse+Integer.parseInt(commands[1])<= neighborhoods.size()-1) {
                for (int i = 0; i < Integer.parseInt(commands[1]); i++) {

                    if (indexOfHouse < neighborhoods.size() - 1) {
                        indexOfHouse++;

                    } else {
                        indexOfHouse = 0;
                    }
                }
            }
            else{
                indexOfHouse=0;
            }

            if(neighborhoods.get(indexOfHouse)==0){
                System.out.printf("Place %d already had Valentine's day.%n",indexOfHouse);
            }
            else {
                neighborhoods.set(indexOfHouse, neighborhoods.get(indexOfHouse)-2);
                if(neighborhoods.get(indexOfHouse)==0){
                    System.out.printf("Place %d has Valentine's day.%n",indexOfHouse);
                }
            }
            command= scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n",indexOfHouse);

        int failed=0;
        for (Integer neighborhood : neighborhoods) {
            if(neighborhood==0){
            }
            else{
                failed++;
            }
        }
        if(failed==0){
            System.out.printf("Mission was successful.%n");
        }
        else{
            System.out.printf("Cupid has failed %d places.%n",failed);
        }


    }
}
