package JavaFundamentalsMidPreparation;
import java.util.Scanner;
public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfTargets= scanner.nextLine();
        String arr[]=lineOfTargets.split(" ");
        int targets[]=new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            targets[i]=Integer.parseInt(arr[i]);
        }
        String command=scanner.nextLine();
        int counterOfShots=0;

        while (!command.equals("End")){
            int commandsForTarget=Integer.parseInt(command);
            if(commandsForTarget<targets.length){
                counterOfShots++;
                int valueOfTarget=targets[commandsForTarget];
                targets[commandsForTarget]=-1;
                for (int i = 0; i < targets.length; i++) {
                    if(!(targets[i]==-1)){
                        if(targets[i]>valueOfTarget){
                            targets[i]=targets[i]-valueOfTarget;
                        }
                        else{
                            targets[i]=targets[i]+valueOfTarget;
                        }
                    }
                    else {
                        continue;
                    }
                }
            }
            command= scanner.nextLine();

        }

        System.out.printf("Shot targets %d: -> ",counterOfShots);
        for (int i = 0; i < targets.length; i++) {
            System.out.printf("%d ",targets[i]);
        }

    }
}
