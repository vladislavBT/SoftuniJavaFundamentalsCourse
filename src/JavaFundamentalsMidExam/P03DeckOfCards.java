package JavaFundamentalsMidExam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P03DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfCards= scanner.nextLine();
        String []arr=lineOfCards.split(", ");
        List<String> deck= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            deck.add(arr[i]);
        }

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command= scanner.nextLine();
            String []arrCommand=command.split(", ");
            if(arrCommand[0].equals("Add")){
                add(deck, arrCommand);
            }
            else if(arrCommand[0].equals("Remove")){
                remove(deck, arrCommand);
            }
            else if(arrCommand[0].equals("Remove At")){
                    removeAt(deck,Integer.parseInt(arrCommand[1]));
            }
            else if(arrCommand[0].equals("Insert")){
                   insert(deck,arrCommand);
            }

            }

        for (int i = 0; i < deck.size(); i++) {
            if(i==deck.size()-1){
                System.out.printf("%s", deck.get(i));
            }
            else{
                System.out.printf("%s, ",deck.get(i));
            }
        }


    }

    private static List<String> insert(List<String> deck , String [] arr) {
        if(Integer.parseInt(arr[1])>deck.size()-1 || Integer.parseInt(arr[1])<0){
            System.out.println("Index out of range");
        }
        else if(deck.contains(arr[2])){
            System.out.println("Card is already added");
        }
        else{
            deck.add(Integer.parseInt(arr[1]),arr[2]);
            System.out.println("Card successfully added");
        }

        return deck;
    }

    private static List<String> removeAt(List<String> deck , int index) {
        if(index>deck.size()-1 || index<0){
            System.out.println("Index out of range");
        }
        else{
            deck.remove(index);
            System.out.println("Card successfully removed");
        }
        return deck;
    }

    private static List<String> remove(List<String> deck , String [] arr) {
        if(!(deck.contains(arr[1]))){
            System.out.println("Card not found");
        }
        else{
            deck.remove(arr[1]);
            System.out.println("Card successfully removed");
        }

        return deck;
    }

    private static List<String> add(List<String> deck , String [] arr) {
           if(deck.contains(arr[1])){
               System.out.println("Card is already in the deck");
           }
           else{
               deck.add(arr[1]);
               System.out.println("Card successfully added");
           }
           return deck;
    }
}

