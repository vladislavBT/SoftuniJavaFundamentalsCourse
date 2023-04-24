package JavaFundamentals9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Scanner;
public class lists3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(8,2,2,4,8,16));
       List<Integer>nextNumbers=new ArrayList<>();

        int index=0;

        while (index<numbers.size()-1){

            if(numbers.get(index)==numbers.get(index+1)){
                nextNumbers.add(2*numbers.get(index));
                numbers.remove(index);
                numbers.remove(index);

            }
            else{
                nextNumbers.add(numbers.get(index));
                index++;
            }
        }
        index=0;
        nextNumbers.add(numbers.get(numbers.size()-1));


        for (Integer nextNumber : nextNumbers) {
            System.out.println(nextNumber);
        }

    }
    }

