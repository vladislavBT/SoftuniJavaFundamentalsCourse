package JavaFundamentals12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P0Articles {
    static class Articles{
        String title;
        String content;
        String author;

        Articles(String title, String content, String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        String edit(String content){
            this.content=content;
            return this.content;
        }

        String changeAuthor(String author){
            this.author=author;
            return this.author;
        }

        String rename (String title){
            this.title=title;
            return this.title;
        }

        String override(){
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArticles= scanner.nextLine();
        String arr[]=firstArticles.split(", ");
        List<String> listWithArticles= new ArrayList<>();
        for (String s : arr) {
            listWithArticles.add(s);

        }

        Articles ourArticles=new Articles(arr[0],arr[1],arr[2]);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command= scanner.nextLine();
            String [] arrOfCommand=command.split(": ");
            if(arrOfCommand[0].equals("Edit")){
                ourArticles.edit(arrOfCommand[1]);
            }
            else if(arrOfCommand[0].equals("ChangeAuthor")){
                ourArticles.changeAuthor(arrOfCommand[1]);
            }
            else if(arrOfCommand[0].equals("Rename")){
                ourArticles.rename(arrOfCommand[1]);
            }
        }

        System.out.println(ourArticles.override());


    }
}
