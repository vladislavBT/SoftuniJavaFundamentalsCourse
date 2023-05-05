package JavaFundamentalsFinalExamPreparationSecond;
import java.util.Scanner;
public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        String command= scanner.nextLine();
        while(!command.equals("Reveal")){
            String arr[]=command.split(":[|]:");
            if(arr[0].equals("InsertSpace")){
                int index =Integer.parseInt(arr[1]);
                sb.insert(index," ");
                System.out.println(sb);
            }
            if(arr[0].equals("Reverse")){
                String textForChange = arr[1];
                int indexOfOurText= sb.toString().indexOf(textForChange);
                if(indexOfOurText!=-1) {
                    StringBuilder unrevarsedText = new StringBuilder(textForChange);
                    String reversedText = unrevarsedText.reverse().toString();
                    sb.replace(indexOfOurText, indexOfOurText + reversedText.length(), reversedText);
                    System.out.println(sb);
                }
                else{
                    System.out.println("error");
                }
            }
            if(arr[0].equals("ChangeAll")){
                String lastSubstring=arr[1];
                String newSubstring =arr[2];
                String ourText=sb.toString();
                int index = ourText.indexOf(lastSubstring);
                while(index!=-1){
                    ourText=ourText.replace(lastSubstring,newSubstring);
                    index= ourText.indexOf(lastSubstring);
                }
                sb=new StringBuilder(ourText);
                System.out.println(sb);
            }

        command= scanner.nextLine();

        }
        System.out.printf("You have a new text message: %s",sb.toString());
    }
}
