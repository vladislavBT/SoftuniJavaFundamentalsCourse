package JavaFundamentalsFinalExam;
import java.util.Locale;
import java.util.Scanner;
public class P01Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        String commands=scanner.nextLine();

        while (!(commands.equals("Abracadabra"))) {
            String command[]=commands .split(" ");
            if (command[0].equals("Abjuration")) {
                sb=new StringBuilder(Abjuration(sb));
                System.out.println(sb);
            } else if (command[0].equals("Necromancy")) {
                sb=new StringBuilder(Necromancy(sb));
                System.out.println(sb);
            } else if (command[0].equals("Illusion")) {
                int index = Integer.parseInt(command[1]);
                char letter = command[2].charAt(0);
                if(index<=sb.toString().length()-1 && index>=0) {
                   sb= new StringBuilder(Illusion(index, letter, sb));
                    System.out.println("Done!");
                }
                else{
                    System.out.println("The spell was too weak.");
                }

            } else if (command[0].equals("Divination")) {
                String firstSubstring= command[1];
                String secondSubstring= command[2];
                if(sb.toString().contains(firstSubstring)){
                    sb= new StringBuilder(Divination(sb,firstSubstring,secondSubstring));
                    System.out.println(sb);
                }


            } else if (command[0].equals("Alteration")) {
                String substring=command[1];
            if(sb.toString().contains(substring)){
                sb=new StringBuilder(Alternation(sb,substring));
                System.out.println(sb);
            }

            } else {
                System.out.println("The spell did not work!");
            }
            commands= scanner.nextLine();
        }

    }

    private static StringBuilder Alternation(StringBuilder sb,String substring) {
        String text = sb.toString().replace(substring,"");
        sb = new StringBuilder(text);
        return sb;
    }

    private static StringBuilder Divination(StringBuilder sb,String firstSubstring,String secondSubstring) {
        String text = sb.toString().replace(firstSubstring,secondSubstring);
        sb = new StringBuilder(text);
        return sb;
    }

    private static StringBuilder  Illusion(Integer index , char letter, StringBuilder sb) {
    sb.setCharAt(index,letter);
        return sb;
    }

    private static StringBuilder Necromancy(StringBuilder sb) {
        String text=sb.toString();
        text=text.toLowerCase();
        sb=new StringBuilder(text);
        return sb;
    }

    private static StringBuilder Abjuration(StringBuilder sb) {
        String text=sb.toString();
        text=text.toUpperCase();
        sb=new StringBuilder(text);
        return sb;
    }
}
