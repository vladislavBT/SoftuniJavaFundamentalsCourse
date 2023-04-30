package JavaFundamentalsMidExam;
import java.util.Scanner;
public class P01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience=Double.parseDouble(scanner.nextLine());
        int countOfBattles=Integer.parseInt(scanner.nextLine());
        double sumOfExperience=0;
        int counter=0;

        for (int i = 1; i <= countOfBattles; i++) {

            if(sumOfExperience>=neededExperience){
                break;
            }
            else {
                double experiencePerBattle=Double.parseDouble(scanner.nextLine());
                if(i % 15 == 0 || i % 3 == 0 || i % 5 == 0) {
                    if (i % 15 == 0) {
                        sumOfExperience += 1.05 * experiencePerBattle;

                    }
                    else if (i % 3 == 0) {
                        sumOfExperience += 1.15 * experiencePerBattle;
                    }
                    else if (i % 5 == 0) {
                        sumOfExperience += 0.90 * experiencePerBattle;
                    }
                }
                else {
                    sumOfExperience += experiencePerBattle;
                }
            }

            counter++;
        }
        if(sumOfExperience>=neededExperience){
            System.out.printf("Player successfully collected his needed experience for %d battles.%n", counter);
        }
        else{
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.%n", neededExperience-sumOfExperience);
        }

    }
}
