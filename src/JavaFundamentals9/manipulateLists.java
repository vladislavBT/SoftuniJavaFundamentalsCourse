package JavaFundamentals9;
import javax.imageio.ImageReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Scanner;
public class manipulateLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersA = new ArrayList<>(Arrays.asList(10,6,3,2,1));
        List<Integer> numbersB = new ArrayList<>(Arrays.asList(9,8,4,0));

        List <Integer> merged = new ArrayList<>();

        int i=0;
        while(i==0){
            if(!(numbersA.size()==0) && !(numbersB.size()==0)) {
                if (numbersA.get(i) > numbersB.get(i)) {
                    merged.add(numbersA.get(i));
                    numbersA.remove(0);

                }
                else if (numbersA.get(i) < numbersB.get(i)) {
                    merged.add(numbersB.get(i));
                    numbersB.remove(0);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }

        }
        if(!(numbersA.size()==0)){
            merged.add(numbersA.get(0));
            numbersA.remove(0);
        }
        if(!(numbersB.size()==0)){
            merged.add(numbersB.get(0));
            numbersB.remove(0);
        }

        for (Integer integer : merged) {
            System.out.printf("%d ",integer);
        }


    }
}
