package JavaFundamentals12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P04Articles20 {
    static class Article{
        String title;
        String content;
        String author;
            Article(String title, String content, String author){
                this.title=title;
                this.content=content;
                this.author=author;
            }

            String ToString(){
                return String.format("%s - %s: %s", title,content,author);
            }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> listOfArticles= new ArrayList<>();


        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String []command= scanner.nextLine().split(", ");
            Article article=new Article(command[0],command[1],command[2]);
            listOfArticles.add(article);
        }
        String criteria=scanner.nextLine();
        if(criteria.equals("title")){
            listOfArticles.stream().
                    sorted((a1,a2)-> a1.title.compareTo(a2.title))
                    .forEach(a -> System.out.println(a.ToString()));
        }
        else if(criteria.equals("content")){
            listOfArticles.stream().
                    sorted((a1,a2)-> a1.content.compareTo(a2.content))
                    .forEach(a -> System.out.println(a.ToString()));
        }
        else if(criteria.equals("author")){
            listOfArticles.stream().
                    sorted((a1,a2)-> a1.author.compareTo(a2.author))
                    .forEach(a -> System.out.println(a.ToString()));
        }

    }
}
