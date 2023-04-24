package JavaFundamentals10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfWagons = scanner.nextLine();
        String arr[] = lineOfWagons.split(" ");
        List<Integer> wagons = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            wagons.add(Integer.parseInt(arr[i]));
        }
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String addOrJoin = scanner.nextLine();
        while (!addOrJoin.equals("end")) {
            String arr2[] = addOrJoin.split(" ");
            if (arr2[0].equals("Add")) {
                int anotherWagon = Integer.parseInt(arr2[1]);
                wagons.add(anotherWagon);
                anotherWagon=0;
            }
            else {
                int anotherWagon=Integer.parseInt(arr2[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if(anotherWagon+wagons.get(i)<=maxCapacity){
                        wagons.set(i, anotherWagon+wagons.get(i));
                        break;
                    }
                }

            }
            addOrJoin = scanner.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.printf("%d ",wagon);
        }


    }
}

